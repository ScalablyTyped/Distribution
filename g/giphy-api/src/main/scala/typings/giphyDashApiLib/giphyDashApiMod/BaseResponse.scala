package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse extends js.Object {
  var meta: giphyDashApiLib.Anon_Msg
  var pagination: giphyDashApiLib.Anon_Count
}

object BaseResponse {
  @scala.inline
  def apply(meta: giphyDashApiLib.Anon_Msg, pagination: giphyDashApiLib.Anon_Count): BaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("pagination")(pagination)
    __obj.asInstanceOf[BaseResponse]
  }
}

