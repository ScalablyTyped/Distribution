package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSparklineEventMap
  extends StObject
     with ControlEventMap {
  
  var disposing: BootstrapChartEventArgsBase
  
  var drawn: BootstrapChartEventArgsBase
  
  var exported: BootstrapChartEventArgsBase
  
  var exporting: BootstrapChartExportEventArgs
  
  var fileSaving: BootstrapChartExportEventArgs
  
  var incidentOccurred: BootstrapChartErrorEventArgs
  
  @JSName("init")
  var init_BootstrapSparklineEventMap: BootstrapChartEventArgsBase
  
  var optionChanged: BootstrapChartOptionChangedEventArgs
  
  var tooltipHidden: BootstrapChartEventArgsBase
  
  var tooltipShown: BootstrapChartEventArgsBase
}
object BootstrapSparklineEventMap {
  
  inline def apply(
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
  
  extension [Self <: BootstrapSparklineEventMap](x: Self) {
    
    inline def setDisposing(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "disposing", value.asInstanceOf[js.Any])
    
    inline def setDrawn(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "drawn", value.asInstanceOf[js.Any])
    
    inline def setExported(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setExporting(value: BootstrapChartExportEventArgs): Self = StObject.set(x, "exporting", value.asInstanceOf[js.Any])
    
    inline def setFileSaving(value: BootstrapChartExportEventArgs): Self = StObject.set(x, "fileSaving", value.asInstanceOf[js.Any])
    
    inline def setIncidentOccurred(value: BootstrapChartErrorEventArgs): Self = StObject.set(x, "incidentOccurred", value.asInstanceOf[js.Any])
    
    inline def setInit(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setOptionChanged(value: BootstrapChartOptionChangedEventArgs): Self = StObject.set(x, "optionChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipHidden(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "tooltipHidden", value.asInstanceOf[js.Any])
    
    inline def setTooltipShown(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
  }
}
