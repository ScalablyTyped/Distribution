package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapPieChartEventMap
  extends StObject
     with ControlEventMap {
  
  var disposing: BootstrapChartEventArgsBase
  
  var done: BootstrapChartEventArgsBase
  
  var drawn: BootstrapChartEventArgsBase
  
  var exported: BootstrapChartEventArgsBase
  
  var exporting: BootstrapChartExportEventArgs
  
  var fileSaving: BootstrapChartExportEventArgs
  
  var incidentOccurred: BootstrapChartErrorEventArgs
  
  @JSName("init")
  var init_BootstrapPieChartEventMap: BootstrapChartEventArgsBase
  
  var legendClick: BootstrapChartElementClickEventArgs
  
  var optionChanged: BootstrapChartOptionChangedEventArgs
  
  var pointClick: BootstrapChartElementClickEventArgs
  
  var pointHoverChanged: BootstrapChartElementActionEventArgs
  
  var pointSelectionChanged: BootstrapChartElementActionEventArgs
  
  var tooltipHidden: BootstrapChartElementActionEventArgs
  
  var tooltipShown: BootstrapChartElementActionEventArgs
}
object BootstrapPieChartEventMap {
  
  @scala.inline
  def apply(
    disposing: BootstrapChartEventArgsBase,
    done: BootstrapChartEventArgsBase,
    drawn: BootstrapChartEventArgsBase,
    exported: BootstrapChartEventArgsBase,
    exporting: BootstrapChartExportEventArgs,
    fileSaving: BootstrapChartExportEventArgs,
    incidentOccurred: BootstrapChartErrorEventArgs,
    init: BootstrapChartEventArgsBase,
    legendClick: BootstrapChartElementClickEventArgs,
    optionChanged: BootstrapChartOptionChangedEventArgs,
    pointClick: BootstrapChartElementClickEventArgs,
    pointHoverChanged: BootstrapChartElementActionEventArgs,
    pointSelectionChanged: BootstrapChartElementActionEventArgs,
    tooltipHidden: BootstrapChartElementActionEventArgs,
    tooltipShown: BootstrapChartElementActionEventArgs
  ): BootstrapPieChartEventMap = {
    val __obj = js.Dynamic.literal(disposing = disposing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], drawn = drawn.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], exporting = exporting.asInstanceOf[js.Any], fileSaving = fileSaving.asInstanceOf[js.Any], incidentOccurred = incidentOccurred.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], legendClick = legendClick.asInstanceOf[js.Any], optionChanged = optionChanged.asInstanceOf[js.Any], pointClick = pointClick.asInstanceOf[js.Any], pointHoverChanged = pointHoverChanged.asInstanceOf[js.Any], pointSelectionChanged = pointSelectionChanged.asInstanceOf[js.Any], tooltipHidden = tooltipHidden.asInstanceOf[js.Any], tooltipShown = tooltipShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapPieChartEventMap]
  }
  
  @scala.inline
  implicit class BootstrapPieChartEventMapMutableBuilder[Self <: BootstrapPieChartEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisposing(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "disposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawn(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "drawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExported(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExporting(value: BootstrapChartExportEventArgs): Self = StObject.set(x, "exporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSaving(value: BootstrapChartExportEventArgs): Self = StObject.set(x, "fileSaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncidentOccurred(value: BootstrapChartErrorEventArgs): Self = StObject.set(x, "incidentOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendClick(value: BootstrapChartElementClickEventArgs): Self = StObject.set(x, "legendClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionChanged(value: BootstrapChartOptionChangedEventArgs): Self = StObject.set(x, "optionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointClick(value: BootstrapChartElementClickEventArgs): Self = StObject.set(x, "pointClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointHoverChanged(value: BootstrapChartElementActionEventArgs): Self = StObject.set(x, "pointHoverChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointSelectionChanged(value: BootstrapChartElementActionEventArgs): Self = StObject.set(x, "pointSelectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipHidden(value: BootstrapChartElementActionEventArgs): Self = StObject.set(x, "tooltipHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipShown(value: BootstrapChartElementActionEventArgs): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
  }
}
