package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Autocomplete suggestions to supplement a TextInput widget.
  *
  *     var textInput = CardService.newTextInput()
  *         .setSuggestions(CardService.newSuggestions()
  *             .addSuggestion("First suggestion")
  *             .addSuggestion("Second suggestion"))
  */
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

