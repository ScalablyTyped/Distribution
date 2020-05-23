package typings.giphyApi.mod

import typings.giphyApi.anon.Count
import typings.giphyApi.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiResponse extends BaseResponse {
  var data: js.Array[GIFObject]
}

object MultiResponse {
  @scala.inline
  def apply(data: js.Array[GIFObject], meta: Msg, pagination: Count): MultiResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiResponse]
  }
}

