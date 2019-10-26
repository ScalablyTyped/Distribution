package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAttributesExtensionObject extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var schema: JsonApiLink
  var `type`: String
  var version: String
}

object BaseAttributesExtensionObject {
  @scala.inline
  def apply(schema: JsonApiLink, `type`: String, version: String, data: js.Object = null): BaseAttributesExtensionObject = {
    val __obj = js.Dynamic.literal(schema = schema, version = version)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[BaseAttributesExtensionObject]
  }
}

