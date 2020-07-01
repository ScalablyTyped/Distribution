package typings.fluentuiDateTimeUtilities.dateGridTypesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDay extends js.Object {
  /** `Date.getDate()` value of current date */
  var date: String
  /** Is current date within restriction bboundaries */
  var isInBounds: Boolean
  /** Is current date is in the same month as "today" date */
  var isInMonth: Boolean
  /** Is current date is selected */
  var isSelected: Boolean
  /** Is current date is "today" date */
  var isToday: Boolean
  /** `Date.toString()` value of current date */
  var key: String
  /** `Date` object of current date */
  var originalDate: Date
}

object IDay {
  @scala.inline
  def apply(
    date: String,
    isInBounds: Boolean,
    isInMonth: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    key: String,
    originalDate: Date
  ): IDay = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], originalDate = originalDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDay]
  }
}

