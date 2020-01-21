package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLang extends js.Object {
  /** The language of the information url and description. */
  var lang: js.UndefOr[String] = js.undefined
  /** The URL for the preview image information. */
  var previewImageUrl: js.UndefOr[String] = js.undefined
  /** The description for this location. */
  var snippet: js.UndefOr[String] = js.undefined
  /** The URL for information for this location. Ex: wikipedia link. */
  var snippetUrl: js.UndefOr[String] = js.undefined
  /** The display title and localized canonical name to use when searching for this entity on Google search. */
  var title: js.UndefOr[String] = js.undefined
}

object AnonLang {
  @scala.inline
  def apply(
    lang: String = null,
    previewImageUrl: String = null,
    snippet: String = null,
    snippetUrl: String = null,
    title: String = null
  ): AnonLang = {
    val __obj = js.Dynamic.literal()
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (previewImageUrl != null) __obj.updateDynamic("previewImageUrl")(previewImageUrl.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (snippetUrl != null) __obj.updateDynamic("snippetUrl")(snippetUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLang]
  }
}

