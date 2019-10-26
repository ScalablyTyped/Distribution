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
    if (data != null) __obj.updateDynamic("data")(data)
    if (jsonapi != null) __obj.updateDynamic("jsonapi")(jsonapi)
    __obj.asInstanceOf[CreateStorage]
  }
}

