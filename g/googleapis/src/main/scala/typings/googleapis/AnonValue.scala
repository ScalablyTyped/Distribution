package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValue extends js.Object {
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object AnonValue {
  @scala.inline
  def apply(`type`: String = null, value: String = null): AnonValue = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

