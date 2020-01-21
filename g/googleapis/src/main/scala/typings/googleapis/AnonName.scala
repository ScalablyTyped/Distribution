package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName extends js.Object {
  var name: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[js.Array[AnonBoolValue]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonName {
  @scala.inline
  def apply(name: String = null, parameters: js.Array[AnonBoolValue] = null, `type`: String = null): AnonName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

