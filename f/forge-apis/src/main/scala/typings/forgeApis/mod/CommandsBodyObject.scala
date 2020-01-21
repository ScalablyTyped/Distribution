package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandsBodyObject extends js.Object {
  var data: CommandsBodyObjectData
  var included: js.UndefOr[js.Object] = js.undefined
  var jsonapi: JsonApiVersionJsonapi
}

object CommandsBodyObject {
  @scala.inline
  def apply(data: CommandsBodyObjectData, jsonapi: JsonApiVersionJsonapi, included: js.Object = null): CommandsBodyObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any])
    if (included != null) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsBodyObject]
  }
}

