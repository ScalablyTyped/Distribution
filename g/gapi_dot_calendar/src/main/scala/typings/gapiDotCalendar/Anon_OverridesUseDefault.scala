package typings.gapiDotCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OverridesUseDefault extends js.Object {
  var overrides: js.UndefOr[js.Array[Anon_Method]] = js.undefined
  var useDefault: Boolean
}

object Anon_OverridesUseDefault {
  @scala.inline
  def apply(useDefault: Boolean, overrides: js.Array[Anon_Method] = null): Anon_OverridesUseDefault = {
    val __obj = js.Dynamic.literal(useDefault = useDefault)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[Anon_OverridesUseDefault]
  }
}

