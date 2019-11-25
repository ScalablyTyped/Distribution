package typings.giphyDashApi.giphyDashApiMod

import typings.giphyDashApi.Anon_Count
import typings.giphyDashApi.Anon_Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiResponse extends BaseResponse {
  var data: js.Array[GIFObject]
}

object MultiResponse {
  @scala.inline
  def apply(data: js.Array[GIFObject], meta: Anon_Msg, pagination: Anon_Count): MultiResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiResponse]
  }
}

