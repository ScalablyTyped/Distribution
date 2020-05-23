package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseDefault extends js.Object {
  var overrides: js.UndefOr[js.Array[Method]] = js.undefined
  var useDefault: Boolean
}

object UseDefault {
  @scala.inline
  def apply(useDefault: Boolean, overrides: js.Array[Method] = null): UseDefault = {
    val __obj = js.Dynamic.literal(useDefault = useDefault.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseDefault]
  }
}

