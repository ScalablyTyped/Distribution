package typings
package giphyDashApiLib.giphyDashApiMod.giphyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleResponse
  extends giphyDashApiLib.giphyDashApiMod.BaseResponse {
  var data: GIFObject
}

object SingleResponse {
  @scala.inline
  def apply(data: GIFObject, meta: giphyDashApiLib.Anon_Msg, pagination: giphyDashApiLib.Anon_Count): SingleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("pagination")(pagination)
    __obj.asInstanceOf[SingleResponse]
  }
}

