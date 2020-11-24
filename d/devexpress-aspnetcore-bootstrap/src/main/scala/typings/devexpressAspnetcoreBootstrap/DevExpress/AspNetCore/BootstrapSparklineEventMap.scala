package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSparklineEventMap extends ControlEventMap {
  
  var disposing: BootstrapChartEventArgsBase = js.native
  
  var drawn: BootstrapChartEventArgsBase = js.native
  
  var exported: BootstrapChartEventArgsBase = js.native
  
  var exporting: BootstrapChartExportEventArgs = js.native
  
  var fileSaving: BootstrapChartExportEventArgs = js.native
  
  var incidentOccurred: BootstrapChartErrorEventArgs = js.native
  
  @JSName("init")
  var init_BootstrapSparklineEventMap: BootstrapChartEventArgsBase = js.native
  
  var optionChanged: BootstrapChartOptionChangedEventArgs = js.native
  
  var tooltipHidden: BootstrapChartEventArgsBase = js.native
  
  var tooltipShown: BootstrapChartEventArgsBase = js.native
}
object BootstrapSparklineEventMap {
  
  @scala.inline
  def apply(
    disposing: BootstrapChartEventArgsBase,
    drawn: BootstrapChartEventArgsBase,
    exported: BootstrapChartEventArgsBase,
    exporting: BootstrapChartExportEventArgs,
    fileSaving: BootstrapChartExportEventArgs,
    incidentOccurred: BootstrapChartErrorEventArgs,
    init: BootstrapChartEventArgsBase,
    optionChanged: BootstrapChartOptionChangedEventArgs,
    tooltipHidden: BootstrapChartEventArgsBase,
    tooltipShown: BootstrapChartEventArgsBase
  ): BootstrapSparklineEventMap = {
    val __obj = js.Dynamic.literal(disposing = disposing.asInstanceOf[js.Any], drawn = drawn.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], exporting = exporting.asInstanceOf[js.Any], fileSaving = fileSaving.asInstanceOf[js.Any], incidentOccurred = incidentOccurred.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], optionChanged = optionChanged.asInstanceOf[js.Any], tooltipHidden = tooltipHidden.asInstanceOf[js.Any], tooltipShown = tooltipShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSparklineEventMap]
  }
  
  @scala.inline
  implicit class BootstrapSparklineEventMapOps[Self <: BootstrapSparklineEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisposing(value: BootstrapChartEventArgsBase): Self = this.set("disposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawn(value: BootstrapChartEventArgsBase): Self = this.set("drawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExported(value: BootstrapChartEventArgsBase): Self = this.set("exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExporting(value: BootstrapChartExportEventArgs): Self = this.set("exporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSaving(value: BootstrapChartExportEventArgs): Self = this.set("fileSaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncidentOccurred(value: BootstrapChartErrorEventArgs): Self = this.set("incidentOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: BootstrapChartEventArgsBase): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionChanged(value: BootstrapChartOptionChangedEventArgs): Self = this.set("optionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipHidden(value: BootstrapChartEventArgsBase): Self = this.set("tooltipHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipShown(value: BootstrapChartEventArgsBase): Self = this.set("tooltipShown", value.asInstanceOf[js.Any])
  }
}
