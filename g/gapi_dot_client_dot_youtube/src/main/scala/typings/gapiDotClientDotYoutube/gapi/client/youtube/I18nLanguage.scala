package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLanguage extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the i18n language. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#i18nLanguage". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the i18n language, such as language code and human-readable name. */
  var snippet: js.UndefOr[I18nLanguageSnippet] = js.undefined
}

object I18nLanguage {
  @scala.inline
  def apply(etag: String = null, id: String = null, kind: String = null, snippet: I18nLanguageSnippet = null): I18nLanguage = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[I18nLanguage]
  }
}

