package typings.giphyDashApi.giphyDashApiMod

import typings.giphyDashApi.Anon_Count
import typings.giphyDashApi.Anon_Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleResponse extends BaseResponse {
  var data: GIFObject
}

object SingleResponse {
  @scala.inline
  def apply(data: GIFObject, meta: Anon_Msg, pagination: Anon_Count): SingleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingleResponse]
  }
}

