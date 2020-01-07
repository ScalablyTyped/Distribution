package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LanguageTag extends js.Object {
  var value: js.UndefOr[String] = js.native
}

object Schema$LanguageTag {
  @scala.inline
  def apply(value: String = null): Schema$LanguageTag = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LanguageTag]
  }
}

