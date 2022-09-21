package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttOptions extends StObject {
  
  var arrow: js.UndefOr[GanttArrow] = js.undefined
  
  var barCornerRadius: js.UndefOr[Double] = js.undefined
  
  var barHeight: js.UndefOr[Double] = js.undefined
  
  var criticalPathEnabled: js.UndefOr[Boolean] = js.undefined
  
  var criticalPathStyle: js.UndefOr[ChartStroke] = js.undefined
  
  var defaultStartDate: js.UndefOr[js.Date | Double] = js.undefined
  
  var innerGridDarkTrack: js.UndefOr[ChartFill] = js.undefined
  
  var innerGridHorizLine: js.UndefOr[ChartStroke] = js.undefined
  
  var innerGridTrack: js.UndefOr[ChartFill] = js.undefined
  
  var labelMaxWidth: js.UndefOr[Double] = js.undefined
  
  var labelStyle: js.UndefOr[LabelStyle] = js.undefined
  
  var percentEnabled: js.UndefOr[Boolean] = js.undefined
  
  var percentStyle: js.UndefOr[ChartFill] = js.undefined
  
  var shadowEnabled: js.UndefOr[Boolean] = js.undefined
  
  var shadowOffset: js.UndefOr[Double] = js.undefined
  
  var shadowStyle: js.UndefOr[ChartFill] = js.undefined
  
  var sortTasks: js.UndefOr[Boolean] = js.undefined
  
  var trackHeight: js.UndefOr[Double] = js.undefined
}
object GanttOptions {
  
  inline def apply(): GanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttOptions]
  }
  
  extension [Self <: GanttOptions](x: Self) {
    
    inline def setArrow(value: GanttArrow): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setBarCornerRadius(value: Double): Self = StObject.set(x, "barCornerRadius", value.asInstanceOf[js.Any])
    
    inline def setBarCornerRadiusUndefined: Self = StObject.set(x, "barCornerRadius", js.undefined)
    
    inline def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
    
    inline def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
    
    inline def setCriticalPathEnabled(value: Boolean): Self = StObject.set(x, "criticalPathEnabled", value.asInstanceOf[js.Any])
    
    inline def setCriticalPathEnabledUndefined: Self = StObject.set(x, "criticalPathEnabled", js.undefined)
    
    inline def setCriticalPathStyle(value: ChartStroke): Self = StObject.set(x, "criticalPathStyle", value.asInstanceOf[js.Any])
    
    inline def setCriticalPathStyleUndefined: Self = StObject.set(x, "criticalPathStyle", js.undefined)
    
    inline def setDefaultStartDate(value: js.Date | Double): Self = StObject.set(x, "defaultStartDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultStartDateUndefined: Self = StObject.set(x, "defaultStartDate", js.undefined)
    
    inline def setInnerGridDarkTrack(value: ChartFill): Self = StObject.set(x, "innerGridDarkTrack", value.asInstanceOf[js.Any])
    
    inline def setInnerGridDarkTrackUndefined: Self = StObject.set(x, "innerGridDarkTrack", js.undefined)
    
    inline def setInnerGridHorizLine(value: ChartStroke): Self = StObject.set(x, "innerGridHorizLine", value.asInstanceOf[js.Any])
    
    inline def setInnerGridHorizLineUndefined: Self = StObject.set(x, "innerGridHorizLine", js.undefined)
    
    inline def setInnerGridTrack(value: ChartFill): Self = StObject.set(x, "innerGridTrack", value.asInstanceOf[js.Any])
    
    inline def setInnerGridTrackUndefined: Self = StObject.set(x, "innerGridTrack", js.undefined)
    
    inline def setLabelMaxWidth(value: Double): Self = StObject.set(x, "labelMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelMaxWidthUndefined: Self = StObject.set(x, "labelMaxWidth", js.undefined)
    
    inline def setLabelStyle(value: LabelStyle): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setPercentEnabled(value: Boolean): Self = StObject.set(x, "percentEnabled", value.asInstanceOf[js.Any])
    
    inline def setPercentEnabledUndefined: Self = StObject.set(x, "percentEnabled", js.undefined)
    
    inline def setPercentStyle(value: ChartFill): Self = StObject.set(x, "percentStyle", value.asInstanceOf[js.Any])
    
    inline def setPercentStyleUndefined: Self = StObject.set(x, "percentStyle", js.undefined)
    
    inline def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
    
    inline def setShadowEnabledUndefined: Self = StObject.set(x, "shadowEnabled", js.undefined)
    
    inline def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    inline def setShadowStyle(value: ChartFill): Self = StObject.set(x, "shadowStyle", value.asInstanceOf[js.Any])
    
    inline def setShadowStyleUndefined: Self = StObject.set(x, "shadowStyle", js.undefined)
    
    inline def setSortTasks(value: Boolean): Self = StObject.set(x, "sortTasks", value.asInstanceOf[js.Any])
    
    inline def setSortTasksUndefined: Self = StObject.set(x, "sortTasks", js.undefined)
    
    inline def setTrackHeight(value: Double): Self = StObject.set(x, "trackHeight", value.asInstanceOf[js.Any])
    
    inline def setTrackHeightUndefined: Self = StObject.set(x, "trackHeight", js.undefined)
  }
}
