package typings.googleapis

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaQueryParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescription extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[SchemaQueryParameterType] = js.native
}

object AnonDescription {
  @scala.inline
  def apply(description: String = null, name: String = null, `type`: SchemaQueryParameterType = null): AnonDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

