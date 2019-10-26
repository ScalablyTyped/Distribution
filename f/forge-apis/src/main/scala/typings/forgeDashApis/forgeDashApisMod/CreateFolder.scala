package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolder extends js.Object {
  var data: js.UndefOr[CreateFolderData] = js.undefined
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}

object CreateFolder {
  @scala.inline
  def apply(data: CreateFolderData = null, jsonapi: JsonApiVersionJsonapi = null): CreateFolder = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (jsonapi != null) __obj.updateDynamic("jsonapi")(jsonapi)
    __obj.asInstanceOf[CreateFolder]
  }
}

