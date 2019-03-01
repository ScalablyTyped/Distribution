package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestions extends js.Object {
  def addSuggestion(suggestion: java.lang.String): Suggestions
  def addSuggestions(suggestions: js.Array[js.Object]): Suggestions
}

object Suggestions {
  @scala.inline
  def apply(
    addSuggestion: js.Function1[java.lang.String, Suggestions],
    addSuggestions: js.Function1[js.Array[js.Object], Suggestions]
  ): Suggestions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSuggestion")(addSuggestion)
    __obj.updateDynamic("addSuggestions")(addSuggestions)
    __obj.asInstanceOf[Suggestions]
  }
}

