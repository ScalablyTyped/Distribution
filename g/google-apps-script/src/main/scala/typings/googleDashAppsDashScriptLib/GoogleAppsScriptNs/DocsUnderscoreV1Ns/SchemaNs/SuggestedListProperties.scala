package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedListProperties extends js.Object {
  var listProperties: js.UndefOr[ListProperties] = js.undefined
  var listPropertiesSuggestionState: js.UndefOr[ListPropertiesSuggestionState] = js.undefined
}

object SuggestedListProperties {
  @scala.inline
  def apply(
    listProperties: ListProperties = null,
    listPropertiesSuggestionState: ListPropertiesSuggestionState = null
  ): SuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    if (listProperties != null) __obj.updateDynamic("listProperties")(listProperties)
    if (listPropertiesSuggestionState != null) __obj.updateDynamic("listPropertiesSuggestionState")(listPropertiesSuggestionState)
    __obj.asInstanceOf[SuggestedListProperties]
  }
}

