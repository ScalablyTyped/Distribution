package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedProperty extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  /** The language of the default property. */
  var defaultLanguage: js.UndefOr[LanguageTag] = js.undefined
  var localized: js.UndefOr[js.Array[LocalizedString]] = js.undefined
}

object LocalizedProperty {
  @scala.inline
  def apply(
    default: String = null,
    defaultLanguage: LanguageTag = null,
    localized: js.Array[LocalizedString] = null
  ): LocalizedProperty = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedProperty]
  }
}

