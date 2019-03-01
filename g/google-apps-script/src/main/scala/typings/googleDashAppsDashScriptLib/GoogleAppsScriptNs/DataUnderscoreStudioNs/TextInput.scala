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
    setAllowOverride: js.Function1[scala.Boolean, TextInput],
    setHelpText: js.Function1[java.lang.String, TextInput],
    setId: js.Function1[java.lang.String, TextInput],
    setName: js.Function1[java.lang.String, TextInput],
    setPlaceholder: js.Function1[java.lang.String, TextInput]
  ): TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAllowOverride")(setAllowOverride)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPlaceholder")(setPlaceholder)
    __obj.asInstanceOf[TextInput]
  }
}

