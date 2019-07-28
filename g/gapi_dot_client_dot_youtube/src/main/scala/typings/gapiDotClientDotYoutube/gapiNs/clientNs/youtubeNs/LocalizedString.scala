package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedString extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object LocalizedString {
  @scala.inline
  def apply(language: String = null, value: String = null): LocalizedString = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LocalizedString]
  }
}

