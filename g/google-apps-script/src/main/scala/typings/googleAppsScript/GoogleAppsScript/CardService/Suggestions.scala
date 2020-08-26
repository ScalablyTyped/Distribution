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
@js.native
trait Suggestions extends js.Object {
  def addSuggestion(suggestion: String): Suggestions = js.native
  def addSuggestions(suggestions: js.Array[String]): Suggestions = js.native
}

object Suggestions {
  @scala.inline
  def apply(addSuggestion: String => Suggestions, addSuggestions: js.Array[String] => Suggestions): Suggestions = {
    val __obj = js.Dynamic.literal(addSuggestion = js.Any.fromFunction1(addSuggestion), addSuggestions = js.Any.fromFunction1(addSuggestions))
    __obj.asInstanceOf[Suggestions]
  }
  @scala.inline
  implicit class SuggestionsOps[Self <: Suggestions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddSuggestion(value: String => Suggestions): Self = this.set("addSuggestion", js.Any.fromFunction1(value))
    @scala.inline
    def setAddSuggestions(value: js.Array[String] => Suggestions): Self = this.set("addSuggestions", js.Any.fromFunction1(value))
  }
  
}

