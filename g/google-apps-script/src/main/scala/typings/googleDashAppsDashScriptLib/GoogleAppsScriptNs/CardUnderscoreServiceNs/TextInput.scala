package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInput extends js.Object {
  def setFieldName(fieldName: java.lang.String): TextInput
  def setHint(hint: java.lang.String): TextInput
  def setMultiline(multiline: scala.Boolean): TextInput
  def setOnChangeAction(action: Action): TextInput
  def setSuggestions(suggestions: Suggestions): TextInput
  def setSuggestionsAction(suggestionsAction: Action): TextInput
  def setTitle(title: java.lang.String): TextInput
  def setValue(value: java.lang.String): TextInput
}

object TextInput {
  @scala.inline
  def apply(
    setFieldName: java.lang.String => TextInput,
    setHint: java.lang.String => TextInput,
    setMultiline: scala.Boolean => TextInput,
    setOnChangeAction: Action => TextInput,
    setSuggestions: Suggestions => TextInput,
    setSuggestionsAction: Action => TextInput,
    setTitle: java.lang.String => TextInput,
    setValue: java.lang.String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setFieldName = js.Any.fromFunction1(setFieldName), setHint = js.Any.fromFunction1(setHint), setMultiline = js.Any.fromFunction1(setMultiline), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setSuggestions = js.Any.fromFunction1(setSuggestions), setSuggestionsAction = js.Any.fromFunction1(setSuggestionsAction), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[TextInput]
  }
}

