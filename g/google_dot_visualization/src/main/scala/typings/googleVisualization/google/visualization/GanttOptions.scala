package typings.googleVisualization.google.visualization

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttOptions extends js.Object {
  
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
  implicit class GanttOptionsOps[Self <: GanttOptions] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: GanttArrow): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setBarCornerRadius(value: Double): Self = this.set("barCornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarCornerRadius: Self = this.set("barCornerRadius", js.undefined)
    
    @scala.inline
    def setBarHeight(value: Double): Self = this.set("barHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarHeight: Self = this.set("barHeight", js.undefined)
    
    @scala.inline
    def setCriticalPathEnabled(value: Boolean): Self = this.set("criticalPathEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriticalPathEnabled: Self = this.set("criticalPathEnabled", js.undefined)
    
    @scala.inline
    def setCriticalPathStyle(value: ChartStroke): Self = this.set("criticalPathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriticalPathStyle: Self = this.set("criticalPathStyle", js.undefined)
    
    @scala.inline
    def setDefaultStartDate(value: Date | Double): Self = this.set("defaultStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStartDate: Self = this.set("defaultStartDate", js.undefined)
    
    @scala.inline
    def setInnerGridDarkTrack(value: ChartFill): Self = this.set("innerGridDarkTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerGridDarkTrack: Self = this.set("innerGridDarkTrack", js.undefined)
    
    @scala.inline
    def setInnerGridHorizLine(value: ChartStroke): Self = this.set("innerGridHorizLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerGridHorizLine: Self = this.set("innerGridHorizLine", js.undefined)
    
    @scala.inline
    def setInnerGridTrack(value: ChartFill): Self = this.set("innerGridTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerGridTrack: Self = this.set("innerGridTrack", js.undefined)
    
    @scala.inline
    def setLabelMaxWidth(value: Double): Self = this.set("labelMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelMaxWidth: Self = this.set("labelMaxWidth", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: LabelStyle): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setPercentEnabled(value: Boolean): Self = this.set("percentEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentEnabled: Self = this.set("percentEnabled", js.undefined)
    
    @scala.inline
    def setPercentStyle(value: ChartFill): Self = this.set("percentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentStyle: Self = this.set("percentStyle", js.undefined)
    
    @scala.inline
    def setShadowEnabled(value: Boolean): Self = this.set("shadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowEnabled: Self = this.set("shadowEnabled", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: Double): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    
    @scala.inline
    def setShadowStyle(value: ChartFill): Self = this.set("shadowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowStyle: Self = this.set("shadowStyle", js.undefined)
    
    @scala.inline
    def setSortTasks(value: Boolean): Self = this.set("sortTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortTasks: Self = this.set("sortTasks", js.undefined)
    
    @scala.inline
    def setTrackHeight(value: Double): Self = this.set("trackHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackHeight: Self = this.set("trackHeight", js.undefined)
  }
}
