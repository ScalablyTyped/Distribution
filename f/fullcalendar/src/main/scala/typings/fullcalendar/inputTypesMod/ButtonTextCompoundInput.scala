package typings.fullcalendar.inputTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonTextCompoundInput
  extends /* viewId */ StringDictionary[js.UndefOr[String]] {
  var day: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var nextYear: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
  var prevYear: js.UndefOr[String] = js.undefined
  var today: js.UndefOr[String] = js.undefined
  var week: js.UndefOr[String] = js.undefined
}

object ButtonTextCompoundInput {
  @scala.inline
  def apply(
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String]] = null,
    day: String = null,
    month: String = null,
    next: String = null,
    nextYear: String = null,
    prev: String = null,
    prevYear: String = null,
    today: String = null,
    week: String = null
  ): ButtonTextCompoundInput = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (nextYear != null) __obj.updateDynamic("nextYear")(nextYear.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prevYear != null) __obj.updateDynamic("prevYear")(prevYear.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonTextCompoundInput]
  }
}

