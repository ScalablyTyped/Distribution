package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Lang extends js.Object {
  var lang: js.UndefOr[String] = js.native
  var previewImageUrl: js.UndefOr[String] = js.native
  var snippet: js.UndefOr[String] = js.native
  var snippetUrl: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Anon_Lang {
  @scala.inline
  def apply(
    lang: String = null,
    previewImageUrl: String = null,
    snippet: String = null,
    snippetUrl: String = null,
    title: String = null
  ): Anon_Lang = {
    val __obj = js.Dynamic.literal()
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (previewImageUrl != null) __obj.updateDynamic("previewImageUrl")(previewImageUrl.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (snippetUrl != null) __obj.updateDynamic("snippetUrl")(snippetUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Lang]
  }
}

