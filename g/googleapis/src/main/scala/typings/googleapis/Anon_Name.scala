package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[js.Array[Anon_BoolValue]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, parameters: js.Array[Anon_BoolValue] = null, `type`: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

