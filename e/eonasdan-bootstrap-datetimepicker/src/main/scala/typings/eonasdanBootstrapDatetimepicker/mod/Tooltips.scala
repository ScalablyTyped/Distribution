package typings.eonasdanBootstrapDatetimepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltips extends js.Object {
  
  /**
    * Default: "Clear selection"
    */
  var clear: js.UndefOr[String] = js.native
  
  /**
    * Default: "Close the picker"
    */
  var close: js.UndefOr[String] = js.native
  
  /**
    * Default: "Decrement Hour"
    */
  var decrementHour: js.UndefOr[String] = js.native
  
  /**
    * Default: "Decrement Minute"
    */
  var decrementMinute: js.UndefOr[String] = js.native
  
  /**
    * Default: "Decrement Second"
    */
  var decrementSecond: js.UndefOr[String] = js.native
  
  /**
    * Default: "Increment Hour"
    */
  var incrementHour: js.UndefOr[String] = js.native
  
  /**
    * Default: "Increment Minute"
    */
  var incrementMinute: js.UndefOr[String] = js.native
  
  /**
    * Default: "Increment Second"
    */
  var incrementSecond: js.UndefOr[String] = js.native
  
  /**
    * Default: "Next Century"
    */
  var nextCentury: js.UndefOr[String] = js.native
  
  /**
    * Default: "Next Decade"
    */
  var nextDecade: js.UndefOr[String] = js.native
  
  /**
    * Default: "Next Month"
    */
  var nextMonth: js.UndefOr[String] = js.native
  
  /**
    * Default: "Next Year"
    */
  var nextYear: js.UndefOr[String] = js.native
  
  /**
    * Default: "Pick Hour"
    */
  var pickHour: js.UndefOr[String] = js.native
  
  /**
    * Default: "Pick Minute"
    */
  var pickMinute: js.UndefOr[String] = js.native
  
  /**
    * Default: "Pick Second"
    */
  var pickSecond: js.UndefOr[String] = js.native
  
  /**
    * Default: "Previous Century"
    */
  var prevCentury: js.UndefOr[String] = js.native
  
  /**
    * Default: "Previous Decade"
    */
  var prevDecade: js.UndefOr[String] = js.native
  
  /**
    * Default: "Previous Month"
    */
  var prevMonth: js.UndefOr[String] = js.native
  
  /**
    * Default: "Previous Year"
    */
  var prevYear: js.UndefOr[String] = js.native
  
  /**
    * Default: "Select Decade"
    */
  var selectDecade: js.UndefOr[String] = js.native
  
  /**
    * Default: "Select Month"
    */
  var selectMonth: js.UndefOr[String] = js.native
  
  /**
    * Default: "Select Time"
    */
  var selectTime: js.UndefOr[String] = js.native
  
  /**
    * Default: "Select Year"
    */
  var selectYear: js.UndefOr[String] = js.native
  
  /**
    * Default: "Go to today"
    */
  var today: js.UndefOr[String] = js.native
  
  /**
    * Default:  "Toggle Period"
    */
  var togglePeriod: js.UndefOr[String] = js.native
}
object Tooltips {
  
  @scala.inline
  def apply(): Tooltips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tooltips]
  }
  
  @scala.inline
  implicit class TooltipsOps[Self <: Tooltips] (val x: Self) extends AnyVal {
    
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
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDecrementHour(value: String): Self = this.set("decrementHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecrementHour: Self = this.set("decrementHour", js.undefined)
    
    @scala.inline
    def setDecrementMinute(value: String): Self = this.set("decrementMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecrementMinute: Self = this.set("decrementMinute", js.undefined)
    
    @scala.inline
    def setDecrementSecond(value: String): Self = this.set("decrementSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecrementSecond: Self = this.set("decrementSecond", js.undefined)
    
    @scala.inline
    def setIncrementHour(value: String): Self = this.set("incrementHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementHour: Self = this.set("incrementHour", js.undefined)
    
    @scala.inline
    def setIncrementMinute(value: String): Self = this.set("incrementMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementMinute: Self = this.set("incrementMinute", js.undefined)
    
    @scala.inline
    def setIncrementSecond(value: String): Self = this.set("incrementSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementSecond: Self = this.set("incrementSecond", js.undefined)
    
    @scala.inline
    def setNextCentury(value: String): Self = this.set("nextCentury", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextCentury: Self = this.set("nextCentury", js.undefined)
    
    @scala.inline
    def setNextDecade(value: String): Self = this.set("nextDecade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextDecade: Self = this.set("nextDecade", js.undefined)
    
    @scala.inline
    def setNextMonth(value: String): Self = this.set("nextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMonth: Self = this.set("nextMonth", js.undefined)
    
    @scala.inline
    def setNextYear(value: String): Self = this.set("nextYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextYear: Self = this.set("nextYear", js.undefined)
    
    @scala.inline
    def setPickHour(value: String): Self = this.set("pickHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickHour: Self = this.set("pickHour", js.undefined)
    
    @scala.inline
    def setPickMinute(value: String): Self = this.set("pickMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickMinute: Self = this.set("pickMinute", js.undefined)
    
    @scala.inline
    def setPickSecond(value: String): Self = this.set("pickSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickSecond: Self = this.set("pickSecond", js.undefined)
    
    @scala.inline
    def setPrevCentury(value: String): Self = this.set("prevCentury", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevCentury: Self = this.set("prevCentury", js.undefined)
    
    @scala.inline
    def setPrevDecade(value: String): Self = this.set("prevDecade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevDecade: Self = this.set("prevDecade", js.undefined)
    
    @scala.inline
    def setPrevMonth(value: String): Self = this.set("prevMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevMonth: Self = this.set("prevMonth", js.undefined)
    
    @scala.inline
    def setPrevYear(value: String): Self = this.set("prevYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevYear: Self = this.set("prevYear", js.undefined)
    
    @scala.inline
    def setSelectDecade(value: String): Self = this.set("selectDecade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectDecade: Self = this.set("selectDecade", js.undefined)
    
    @scala.inline
    def setSelectMonth(value: String): Self = this.set("selectMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectMonth: Self = this.set("selectMonth", js.undefined)
    
    @scala.inline
    def setSelectTime(value: String): Self = this.set("selectTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectTime: Self = this.set("selectTime", js.undefined)
    
    @scala.inline
    def setSelectYear(value: String): Self = this.set("selectYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectYear: Self = this.set("selectYear", js.undefined)
    
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    
    @scala.inline
    def setTogglePeriod(value: String): Self = this.set("togglePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglePeriod: Self = this.set("togglePeriod", js.undefined)
  }
}
