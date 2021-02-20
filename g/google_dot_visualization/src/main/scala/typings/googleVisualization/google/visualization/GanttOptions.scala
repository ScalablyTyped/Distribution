package typings.googleVisualization.google.visualization

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttOptions extends StObject {
  
  var arrow: js.UndefOr[GanttArrow] = js.native
  
  var barCornerRadius: js.UndefOr[Double] = js.native
  
  var barHeight: js.UndefOr[Double] = js.native
  
  var criticalPathEnabled: js.UndefOr[Boolean] = js.native
  
  var criticalPathStyle: js.UndefOr[ChartStroke] = js.native
  
  var defaultStartDate: js.UndefOr[Date | Double] = js.native
  
  var innerGridDarkTrack: js.UndefOr[ChartFill] = js.native
  
  var innerGridHorizLine: js.UndefOr[ChartStroke] = js.native
  
  var innerGridTrack: js.UndefOr[ChartFill] = js.native
  
  var labelMaxWidth: js.UndefOr[Double] = js.native
  
  var labelStyle: js.UndefOr[LabelStyle] = js.native
  
  var percentEnabled: js.UndefOr[Boolean] = js.native
  
  var percentStyle: js.UndefOr[ChartFill] = js.native
  
  var shadowEnabled: js.UndefOr[Boolean] = js.native
  
  var shadowOffset: js.UndefOr[Double] = js.native
  
  var shadowStyle: js.UndefOr[ChartFill] = js.native
  
  var sortTasks: js.UndefOr[Boolean] = js.native
  
  var trackHeight: js.UndefOr[Double] = js.native
}
object GanttOptions {
  
  @scala.inline
  def apply(): GanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttOptions]
  }
  
  @scala.inline
  implicit class GanttOptionsMutableBuilder[Self <: GanttOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrow(value: GanttArrow): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setBarCornerRadius(value: Double): Self = StObject.set(x, "barCornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarCornerRadiusUndefined: Self = StObject.set(x, "barCornerRadius", js.undefined)
    
    @scala.inline
    def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
    
    @scala.inline
    def setCriticalPathEnabled(value: Boolean): Self = StObject.set(x, "criticalPathEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalPathEnabledUndefined: Self = StObject.set(x, "criticalPathEnabled", js.undefined)
    
    @scala.inline
    def setCriticalPathStyle(value: ChartStroke): Self = StObject.set(x, "criticalPathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalPathStyleUndefined: Self = StObject.set(x, "criticalPathStyle", js.undefined)
    
    @scala.inline
    def setDefaultStartDate(value: Date | Double): Self = StObject.set(x, "defaultStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStartDateUndefined: Self = StObject.set(x, "defaultStartDate", js.undefined)
    
    @scala.inline
    def setInnerGridDarkTrack(value: ChartFill): Self = StObject.set(x, "innerGridDarkTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerGridDarkTrackUndefined: Self = StObject.set(x, "innerGridDarkTrack", js.undefined)
    
    @scala.inline
    def setInnerGridHorizLine(value: ChartStroke): Self = StObject.set(x, "innerGridHorizLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerGridHorizLineUndefined: Self = StObject.set(x, "innerGridHorizLine", js.undefined)
    
    @scala.inline
    def setInnerGridTrack(value: ChartFill): Self = StObject.set(x, "innerGridTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerGridTrackUndefined: Self = StObject.set(x, "innerGridTrack", js.undefined)
    
    @scala.inline
    def setLabelMaxWidth(value: Double): Self = StObject.set(x, "labelMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMaxWidthUndefined: Self = StObject.set(x, "labelMaxWidth", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: LabelStyle): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setPercentEnabled(value: Boolean): Self = StObject.set(x, "percentEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentEnabledUndefined: Self = StObject.set(x, "percentEnabled", js.undefined)
    
    @scala.inline
    def setPercentStyle(value: ChartFill): Self = StObject.set(x, "percentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentStyleUndefined: Self = StObject.set(x, "percentStyle", js.undefined)
    
    @scala.inline
    def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowEnabledUndefined: Self = StObject.set(x, "shadowEnabled", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    @scala.inline
    def setShadowStyle(value: ChartFill): Self = StObject.set(x, "shadowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowStyleUndefined: Self = StObject.set(x, "shadowStyle", js.undefined)
    
    @scala.inline
    def setSortTasks(value: Boolean): Self = StObject.set(x, "sortTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortTasksUndefined: Self = StObject.set(x, "sortTasks", js.undefined)
    
    @scala.inline
    def setTrackHeight(value: Double): Self = StObject.set(x, "trackHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackHeightUndefined: Self = StObject.set(x, "trackHeight", js.undefined)
  }
}
