package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedNamedStyles extends js.Object {
  var namedStyles: js.UndefOr[NamedStyles] = js.undefined
  var namedStylesSuggestionState: js.UndefOr[NamedStylesSuggestionState] = js.undefined
}

object SuggestedNamedStyles {
  @scala.inline
  def apply(namedStyles: NamedStyles = null, namedStylesSuggestionState: NamedStylesSuggestionState = null): SuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    if (namedStyles != null) __obj.updateDynamic("namedStyles")(namedStyles)
    if (namedStylesSuggestionState != null) __obj.updateDynamic("namedStylesSuggestionState")(namedStylesSuggestionState)
    __obj.asInstanceOf[SuggestedNamedStyles]
  }
}

