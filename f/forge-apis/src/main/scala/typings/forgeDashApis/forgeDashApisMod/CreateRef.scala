package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRef extends js.Object {
  var data: js.UndefOr[CreateRefData] = js.undefined
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}

object CreateRef {
  @scala.inline
  def apply(data: CreateRefData = null, jsonapi: JsonApiVersionJsonapi = null): CreateRef = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (jsonapi != null) __obj.updateDynamic("jsonapi")(jsonapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRef]
  }
}

