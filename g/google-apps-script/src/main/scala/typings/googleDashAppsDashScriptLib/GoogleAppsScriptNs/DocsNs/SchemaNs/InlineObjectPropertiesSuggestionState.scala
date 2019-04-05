package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineObjectPropertiesSuggestionState extends js.Object {
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.undefined
}

object InlineObjectPropertiesSuggestionState {
  @scala.inline
  def apply(embeddedObjectSuggestionState: EmbeddedObjectSuggestionState = null): InlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (embeddedObjectSuggestionState != null) __obj.updateDynamic("embeddedObjectSuggestionState")(embeddedObjectSuggestionState)
    __obj.asInstanceOf[InlineObjectPropertiesSuggestionState]
  }
}

