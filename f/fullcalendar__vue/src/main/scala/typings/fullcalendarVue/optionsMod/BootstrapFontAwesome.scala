package typings.fullcalendarVue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapFontAwesome extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var nextYear: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
  var prevYear: js.UndefOr[String] = js.undefined
}

object BootstrapFontAwesome {
  @scala.inline
  def apply(
    close: String = null,
    next: String = null,
    nextYear: String = null,
    prev: String = null,
    prevYear: String = null
  ): BootstrapFontAwesome = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (nextYear != null) __obj.updateDynamic("nextYear")(nextYear.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prevYear != null) __obj.updateDynamic("prevYear")(prevYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapFontAwesome]
  }
}

