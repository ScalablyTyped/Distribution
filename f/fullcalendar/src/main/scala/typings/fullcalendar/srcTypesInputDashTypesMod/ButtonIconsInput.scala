package typings.fullcalendar.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonIconsInput extends js.Object {
  var next: js.UndefOr[String] = js.undefined
  var nextYear: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
  var prevYear: js.UndefOr[String] = js.undefined
}

object ButtonIconsInput {
  @scala.inline
  def apply(next: String = null, nextYear: String = null, prev: String = null, prevYear: String = null): ButtonIconsInput = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (nextYear != null) __obj.updateDynamic("nextYear")(nextYear.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prevYear != null) __obj.updateDynamic("prevYear")(prevYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonIconsInput]
  }
}

