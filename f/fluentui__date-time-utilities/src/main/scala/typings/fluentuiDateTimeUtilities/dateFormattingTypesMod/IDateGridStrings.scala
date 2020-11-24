package typings.fluentuiDateTimeUtilities.dateFormattingTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateGridStrings extends js.Object {
  
  /**
    * An array of strings for the full names of days of the week.
    * The array is 0-based, so days[0] should be the full name of Sunday.
    */
  var days: js.Array[String] = js.native
  
  /**
    * An array of strings for the full names of months.
    * The array is 0-based, so months[0] should be the full name of January.
    */
  var months: js.Array[String] = js.native
  
  /**
    * An array of strings for the initials of the days of the week.
    * The array is 0-based, so days[0] should be the initial of Sunday.
    */
  var shortDays: js.Array[String] = js.native
  
  /**
    * An array of strings for the short names of months.
    * The array is 0-based, so shortMonths[0] should be the short name of January.
    */
  var shortMonths: js.Array[String] = js.native
}
object IDateGridStrings {
  
  @scala.inline
  def apply(
    days: js.Array[String],
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): IDateGridStrings = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateGridStrings]
  }
  
  @scala.inline
  implicit class IDateGridStringsOps[Self <: IDateGridStrings] (val x: Self) extends AnyVal {
    
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
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDaysVarargs(value: String*): Self = this.set("shortDays", js.Array(value :_*))
    
    @scala.inline
    def setShortDays(value: js.Array[String]): Self = this.set("shortDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = this.set("shortMonths", js.Array(value :_*))
    
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
  }
}
