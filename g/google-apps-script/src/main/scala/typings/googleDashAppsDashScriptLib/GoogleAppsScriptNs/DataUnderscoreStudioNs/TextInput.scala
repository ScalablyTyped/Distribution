package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInput extends js.Object {
  def setAllowOverride(allowOverride: scala.Boolean): TextInput
  def setHelpText(helpText: java.lang.String): TextInput
  def setId(id: java.lang.String): TextInput
  def setName(name: java.lang.String): TextInput
  def setPlaceholder(placeholder: java.lang.String): TextInput
}

object TextInput {
  @scala.inline
  def apply(
    setAllowOverride: scala.Boolean => TextInput,
    setHelpText: java.lang.String => TextInput,
    setId: java.lang.String => TextInput,
    setName: java.lang.String => TextInput,
    setPlaceholder: java.lang.String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
  
    __obj.asInstanceOf[TextInput]
  }
}

