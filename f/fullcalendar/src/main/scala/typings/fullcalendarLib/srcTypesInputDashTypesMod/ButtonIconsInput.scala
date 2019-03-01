package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonIconsInput extends js.Object {
  var next: js.UndefOr[java.lang.String] = js.undefined
  var nextYear: js.UndefOr[java.lang.String] = js.undefined
  var prev: js.UndefOr[java.lang.String] = js.undefined
  var prevYear: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonIconsInput {
  @scala.inline
  def apply(
    next: java.lang.String = null,
    nextYear: java.lang.String = null,
    prev: java.lang.String = null,
    prevYear: java.lang.String = null
  ): ButtonIconsInput = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next)
    if (nextYear != null) __obj.updateDynamic("nextYear")(nextYear)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (prevYear != null) __obj.updateDynamic("prevYear")(prevYear)
    __obj.asInstanceOf[ButtonIconsInput]
  }
}

