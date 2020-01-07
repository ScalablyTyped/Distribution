package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LocalizedString extends js.Object {
  var language: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object Schema$LocalizedString {
  @scala.inline
  def apply(language: String = null, value: String = null): Schema$LocalizedString = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocalizedString]
  }
}

