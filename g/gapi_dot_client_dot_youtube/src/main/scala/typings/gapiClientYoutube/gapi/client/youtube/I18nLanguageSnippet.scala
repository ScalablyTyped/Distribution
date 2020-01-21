package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLanguageSnippet extends js.Object {
  /** A short BCP-47 code that uniquely identifies a language. */
  var hl: js.UndefOr[String] = js.undefined
  /** The human-readable name of the language in the language itself. */
  var name: js.UndefOr[String] = js.undefined
}

object I18nLanguageSnippet {
  @scala.inline
  def apply(hl: String = null, name: String = null): I18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nLanguageSnippet]
  }
}

