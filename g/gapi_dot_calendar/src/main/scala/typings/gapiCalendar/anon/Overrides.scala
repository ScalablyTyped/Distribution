package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overrides extends js.Object {
  var overrides: js.Array[Minutes]
  var useDefault: Boolean
}

object Overrides {
  @scala.inline
  def apply(overrides: js.Array[Minutes], useDefault: Boolean): Overrides = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any], useDefault = useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
}

