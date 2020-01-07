package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NonprofitId extends js.Object {
  var value: js.UndefOr[String] = js.native
}

object Schema$NonprofitId {
  @scala.inline
  def apply(value: String = null): Schema$NonprofitId = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NonprofitId]
  }
}

