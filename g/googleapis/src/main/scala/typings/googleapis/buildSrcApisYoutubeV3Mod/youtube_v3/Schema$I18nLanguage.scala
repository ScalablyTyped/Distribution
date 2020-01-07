package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An i18nLanguage resource identifies a UI language currently supported by
  * YouTube.
  */
@js.native
trait Schema$I18nLanguage extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the i18n language.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#i18nLanguage&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the i18n language, such
    * as language code and human-readable name.
    */
  var snippet: js.UndefOr[Schema$I18nLanguageSnippet] = js.native
}

object Schema$I18nLanguage {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$I18nLanguageSnippet = null
  ): Schema$I18nLanguage = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$I18nLanguage]
  }
}

