package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageTag extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object LanguageTag {
  @scala.inline
  def apply(value: String = null): LanguageTag = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageTag]
  }
}

