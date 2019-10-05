package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestions extends js.Object {
  def addSuggestion(suggestion: String): Suggestions
  def addSuggestions(suggestions: js.Array[String]): Suggestions
}

object Suggestions {
  @scala.inline
  def apply(addSuggestion: String => Suggestions, addSuggestions: js.Array[String] => Suggestions): Suggestions = {
    val __obj = js.Dynamic.literal(addSuggestion = js.Any.fromFunction1(addSuggestion), addSuggestions = js.Any.fromFunction1(addSuggestions))
  
    __obj.asInstanceOf[Suggestions]
  }
}

