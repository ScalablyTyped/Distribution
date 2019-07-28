package typings.fullcalendar.srcTypesInputDashTypesMod

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
    StringDictionary: /* viewId */ StringDictionary[js.UndefOr[String]] = null,
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
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (day != null) __obj.updateDynamic("day")(day)
    if (month != null) __obj.updateDynamic("month")(month)
    if (next != null) __obj.updateDynamic("next")(next)
    if (nextYear != null) __obj.updateDynamic("nextYear")(nextYear)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (prevYear != null) __obj.updateDynamic("prevYear")(prevYear)
    if (today != null) __obj.updateDynamic("today")(today)
    if (week != null) __obj.updateDynamic("week")(week)
    __obj.asInstanceOf[ButtonTextCompoundInput]
  }
}

