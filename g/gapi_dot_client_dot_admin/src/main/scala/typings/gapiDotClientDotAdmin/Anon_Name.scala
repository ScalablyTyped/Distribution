package typings.gapiDotClientDotAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /** Name of event. */
  var name: js.UndefOr[String] = js.undefined
  /** Parameter value pairs for various applications. */
  var parameters: js.UndefOr[js.Array[Anon_BoolValue]] = js.undefined
  /** Type of event. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, parameters: js.Array[Anon_BoolValue] = null, `type`: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Name]
  }
}

