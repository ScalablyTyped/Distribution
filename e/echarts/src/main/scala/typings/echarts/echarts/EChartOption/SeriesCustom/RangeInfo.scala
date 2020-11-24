package typings.echarts.echarts.EChartOption.SeriesCustom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * calendar rangeInfo
  */
@js.native
trait RangeInfo extends js.Object {
  
  /**
    * day count in calendar.
    */
  var dayCount: js.UndefOr[Double] = js.native
  
  /**
    * date end of calendar.
    */
  var end: js.UndefOr[js.Any] = js.native
  
  /**
    * date start of calendar.
    */
  var start: js.UndefOr[js.Any] = js.native
  
  /**
    * number of weeks in calendar.
    */
  var weeks: js.UndefOr[Double] = js.native
}
object RangeInfo {
  
  @scala.inline
  def apply(): RangeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeInfo]
  }
  
  @scala.inline
  implicit class RangeInfoOps[Self <: RangeInfo] (val x: Self) extends AnyVal {
    
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
    def setDayCount(value: Double): Self = this.set("dayCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayCount: Self = this.set("dayCount", js.undefined)
    
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setWeeks(value: Double): Self = this.set("weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeks: Self = this.set("weeks", js.undefined)
  }
}
