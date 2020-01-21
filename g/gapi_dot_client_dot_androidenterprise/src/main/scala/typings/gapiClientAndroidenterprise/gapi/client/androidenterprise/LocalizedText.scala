package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedText extends js.Object {
  /** The BCP47 tag for a locale. (e.g. "en-US", "de"). */
  var locale: js.UndefOr[String] = js.undefined
  /** The text localized in the associated locale. */
  var text: js.UndefOr[String] = js.undefined
}

object LocalizedText {
  @scala.inline
  def apply(locale: String = null, text: String = null): LocalizedText = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedText]
  }
}

