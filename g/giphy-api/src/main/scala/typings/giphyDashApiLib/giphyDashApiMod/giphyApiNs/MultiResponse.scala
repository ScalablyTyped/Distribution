package typings
package giphyDashApiLib.giphyDashApiMod.giphyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiResponse
  extends giphyDashApiLib.giphyDashApiMod.BaseResponse {
  var data: js.Array[GIFObject]
}

object MultiResponse {
  @scala.inline
  def apply(data: js.Array[GIFObject], meta: giphyDashApiLib.Anon_Msg, pagination: giphyDashApiLib.Anon_Count): MultiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("pagination")(pagination)
    __obj.asInstanceOf[MultiResponse]
  }
}

