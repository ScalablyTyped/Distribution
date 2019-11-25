package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorage extends js.Object {
  var data: js.UndefOr[CreateStorageData] = js.undefined
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}

object CreateStorage {
  @scala.inline
  def apply(data: CreateStorageData = null, jsonapi: JsonApiVersionJsonapi = null): CreateStorage = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (jsonapi != null) __obj.updateDynamic("jsonapi")(jsonapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorage]
  }
}

