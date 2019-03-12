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
  def apply(addSuggestion: java.lang.String => Suggestions, addSuggestions: js.Array[js.Object] => Suggestions): Suggestions = {
    val __obj = js.Dynamic.literal(addSuggestion = js.Any.fromFunction1(addSuggestion), addSuggestions = js.Any.fromFunction1(addSuggestions))
  
    __obj.asInstanceOf[Suggestions]
  }
}

