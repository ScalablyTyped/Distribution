package typings.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverridesUseDefault extends js.Object {
  var overrides: js.UndefOr[js.Array[AnonMethod]] = js.undefined
  var useDefault: Boolean
}

object AnonOverridesUseDefault {
  @scala.inline
  def apply(useDefault: Boolean, overrides: js.Array[AnonMethod] = null): AnonOverridesUseDefault = {
    val __obj = js.Dynamic.literal(useDefault = useDefault.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverridesUseDefault]
  }
}

