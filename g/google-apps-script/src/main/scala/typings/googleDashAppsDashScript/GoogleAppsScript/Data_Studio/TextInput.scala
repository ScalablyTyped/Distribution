package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInput extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextInput
  def setHelpText(helpText: String): TextInput
  def setId(id: String): TextInput
  def setName(name: String): TextInput
  def setPlaceholder(placeholder: String): TextInput
}

object TextInput {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => TextInput,
    setHelpText: String => TextInput,
    setId: String => TextInput,
    setName: String => TextInput,
    setPlaceholder: String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
  
    __obj.asInstanceOf[TextInput]
  }
}

