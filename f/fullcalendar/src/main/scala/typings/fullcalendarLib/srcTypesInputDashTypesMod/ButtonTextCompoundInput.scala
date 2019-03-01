package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonTextCompoundInput
  extends /* viewId */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] {
  var day: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[java.lang.String] = js.undefined
  var nextYear: js.UndefOr[java.lang.String] = js.undefined
  var prev: js.UndefOr[java.lang.String] = js.undefined
  var prevYear: js.UndefOr[java.lang.String] = js.undefined
  var today: js.UndefOr[java.lang.String] = js.undefined
  var week: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonTextCompoundInput {
  @scala.inline
  def apply(
    StringDictionary: /* viewId */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    day: java.lang.String = null,
    month: java.lang.String = null,
    next: java.lang.String = null,
    nextYear: java.lang.String = null,
    prev: java.lang.String = null,
    prevYear: java.lang.String = null,
    today: java.lang.String = null,
    week: java.lang.String = null
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

