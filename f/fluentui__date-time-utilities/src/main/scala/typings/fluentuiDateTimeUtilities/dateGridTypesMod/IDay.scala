package typings.fluentuiDateTimeUtilities.dateGridTypesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDay extends js.Object {
  
  /** `Date.getDate()` value of current date */
  var date: String = js.native
  
  /** Is current date within restriction boundaries */
  var isInBounds: Boolean = js.native
  
  /** Is current date is in the same month as "today" date */
  var isInMonth: Boolean = js.native
  
  /** Is current date marked */
  var isMarked: Boolean = js.native
  
  /** Is current date is selected */
  var isSelected: Boolean = js.native
  
  /** Is current date is "today" date */
  var isToday: Boolean = js.native
  
  /** `Date.toString()` value of current date */
  var key: String = js.native
  
  /** `Date` object of current date */
  var originalDate: Date = js.native
}
object IDay {
  
  @scala.inline
  def apply(
    date: String,
    isInBounds: Boolean,
    isInMonth: Boolean,
    isMarked: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    key: String,
    originalDate: Date
  ): IDay = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isMarked = isMarked.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], originalDate = originalDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDay]
  }
  
  @scala.inline
  implicit class IDayOps[Self <: IDay] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInBounds(value: Boolean): Self = this.set("isInBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInMonth(value: Boolean): Self = this.set("isInMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMarked(value: Boolean): Self = this.set("isMarked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToday(value: Boolean): Self = this.set("isToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDate(value: Date): Self = this.set("originalDate", value.asInstanceOf[js.Any])
  }
}
