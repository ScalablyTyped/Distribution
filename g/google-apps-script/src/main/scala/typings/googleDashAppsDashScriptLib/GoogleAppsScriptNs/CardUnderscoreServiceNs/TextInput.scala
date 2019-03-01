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
    setFieldName: js.Function1[java.lang.String, TextInput],
    setHint: js.Function1[java.lang.String, TextInput],
    setMultiline: js.Function1[scala.Boolean, TextInput],
    setOnChangeAction: js.Function1[Action, TextInput],
    setSuggestions: js.Function1[Suggestions, TextInput],
    setSuggestionsAction: js.Function1[Action, TextInput],
    setTitle: js.Function1[java.lang.String, TextInput],
    setValue: js.Function1[java.lang.String, TextInput]
  ): TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFieldName")(setFieldName)
    __obj.updateDynamic("setHint")(setHint)
    __obj.updateDynamic("setMultiline")(setMultiline)
    __obj.updateDynamic("setOnChangeAction")(setOnChangeAction)
    __obj.updateDynamic("setSuggestions")(setSuggestions)
    __obj.updateDynamic("setSuggestionsAction")(setSuggestionsAction)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[TextInput]
  }
}

