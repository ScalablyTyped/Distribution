package typings.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /** Name of event. */
  var name: js.UndefOr[String] = js.undefined
  /** Parameter value pairs for various applications. */
  var parameters: js.UndefOr[js.Array[BoolValue]] = js.undefined
  /** Type of event. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null, parameters: js.Array[BoolValue] = null, `type`: String = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

