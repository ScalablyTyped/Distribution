package typings.giphyApi.mod

import typings.giphyApi.AnonCount
import typings.giphyApi.AnonMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse extends js.Object {
  var meta: AnonMsg
  var pagination: AnonCount
}

object BaseResponse {
  @scala.inline
  def apply(meta: AnonMsg, pagination: AnonCount): BaseResponse = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse]
  }
}

