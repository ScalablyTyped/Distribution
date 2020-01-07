package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LocalizedProperty extends js.Object {
  var default: js.UndefOr[String] = js.native
  /**
    * The language of the default property.
    */
  var defaultLanguage: js.UndefOr[Schema$LanguageTag] = js.native
  var localized: js.UndefOr[js.Array[Schema$LocalizedString]] = js.native
}

object Schema$LocalizedProperty {
  @scala.inline
  def apply(
    default: String = null,
    defaultLanguage: Schema$LanguageTag = null,
    localized: js.Array[Schema$LocalizedString] = null
  ): Schema$LocalizedProperty = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocalizedProperty]
  }
}

