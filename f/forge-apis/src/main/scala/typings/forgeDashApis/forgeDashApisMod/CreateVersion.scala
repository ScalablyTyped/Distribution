package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVersion extends js.Object {
  var data: js.UndefOr[CreateVersionData] = js.undefined
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}

object CreateVersion {
  @scala.inline
  def apply(data: CreateVersionData = null, jsonapi: JsonApiVersionJsonapi = null): CreateVersion = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (jsonapi != null) __obj.updateDynamic("jsonapi")(jsonapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVersion]
  }
}

