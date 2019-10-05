package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInput extends js.Object {
  def setFieldName(fieldName: String): TextInput
  def setHint(hint: String): TextInput
  def setMultiline(multiline: Boolean): TextInput
  def setOnChangeAction(action: Action): TextInput
  def setSuggestions(suggestions: Suggestions): TextInput
  def setSuggestionsAction(suggestionsAction: Action): TextInput
  def setTitle(title: String): TextInput
  def setValue(value: String): TextInput
}

object TextInput {
  @scala.inline
  def apply(
    setFieldName: String => TextInput,
    setHint: String => TextInput,
    setMultiline: Boolean => TextInput,
    setOnChangeAction: Action => TextInput,
    setSuggestions: Suggestions => TextInput,
    setSuggestionsAction: Action => TextInput,
    setTitle: String => TextInput,
    setValue: String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setFieldName = js.Any.fromFunction1(setFieldName), setHint = js.Any.fromFunction1(setHint), setMultiline = js.Any.fromFunction1(setMultiline), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setSuggestions = js.Any.fromFunction1(setSuggestions), setSuggestionsAction = js.Any.fromFunction1(setSuggestionsAction), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[TextInput]
  }
}

