package typings.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverrides extends js.Object {
  var overrides: js.Array[AnonMinutes]
  var useDefault: Boolean
}

object AnonOverrides {
  @scala.inline
  def apply(overrides: js.Array[AnonMinutes], useDefault: Boolean): AnonOverrides = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any], useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverrides]
  }
}

