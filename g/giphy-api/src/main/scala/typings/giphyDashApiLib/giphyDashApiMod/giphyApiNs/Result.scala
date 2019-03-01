package typings
package giphyDashApiLib.giphyDashApiMod.giphyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var data: js.Array[giphyDashApiLib.Anon_Bitlyurl]
  var meta: giphyDashApiLib.Anon_Msg
  var pagination: giphyDashApiLib.Anon_Count
}

object Result {
  @scala.inline
  def apply(
    data: js.Array[giphyDashApiLib.Anon_Bitlyurl],
    meta: giphyDashApiLib.Anon_Msg,
    pagination: giphyDashApiLib.Anon_Count
  ): Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("pagination")(pagination)
    __obj.asInstanceOf[Result]
  }
}

