package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLanguageSnippet extends js.Object {
  var hl: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object I18nLanguageSnippet {
  @scala.inline
  def apply(hl: java.lang.String = null, name: java.lang.String = null): I18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    if (hl != null) __obj.updateDynamic("hl")(hl)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[I18nLanguageSnippet]
  }
}

