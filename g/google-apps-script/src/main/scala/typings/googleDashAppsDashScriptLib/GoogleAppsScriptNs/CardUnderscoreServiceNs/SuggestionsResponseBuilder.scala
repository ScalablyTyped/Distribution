package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsResponseBuilder extends js.Object {
  def build(): SuggestionsResponse
  def setSuggestions(suggestions: Suggestions): SuggestionsResponseBuilder
}

object SuggestionsResponseBuilder {
  @scala.inline
  def apply(
    build: js.Function0[SuggestionsResponse],
    setSuggestions: js.Function1[Suggestions, SuggestionsResponseBuilder]
  ): SuggestionsResponseBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("setSuggestions")(setSuggestions)
    __obj.asInstanceOf[SuggestionsResponseBuilder]
  }
}

