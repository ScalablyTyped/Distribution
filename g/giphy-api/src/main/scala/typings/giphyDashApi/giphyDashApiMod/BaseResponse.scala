package typings.giphyDashApi.giphyDashApiMod

import typings.giphyDashApi.Anon_Count
import typings.giphyDashApi.Anon_Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse extends js.Object {
  var meta: Anon_Msg
  var pagination: Anon_Count
}

object BaseResponse {
  @scala.inline
  def apply(meta: Anon_Msg, pagination: Anon_Count): BaseResponse = {
    val __obj = js.Dynamic.literal(meta = meta, pagination = pagination)
  
    __obj.asInstanceOf[BaseResponse]
  }
}

