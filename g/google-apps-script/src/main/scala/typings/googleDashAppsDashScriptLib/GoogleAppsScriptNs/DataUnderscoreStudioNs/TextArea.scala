package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextArea extends js.Object {
  def setAllowOverride(allowOverride: scala.Boolean): TextArea
  def setHelpText(helpText: java.lang.String): TextArea
  def setId(id: java.lang.String): TextArea
  def setName(name: java.lang.String): TextArea
  def setPlaceholder(placeholder: java.lang.String): TextArea
}

object TextArea {
  @scala.inline
  def apply(
    setAllowOverride: js.Function1[scala.Boolean, TextArea],
    setHelpText: js.Function1[java.lang.String, TextArea],
    setId: js.Function1[java.lang.String, TextArea],
    setName: js.Function1[java.lang.String, TextArea],
    setPlaceholder: js.Function1[java.lang.String, TextArea]
  ): TextArea = {
    val __obj = js.Dynamic.literal(setAllowOverride = setAllowOverride, setHelpText = setHelpText, setId = setId, setName = setName, setPlaceholder = setPlaceholder)
  
    __obj.asInstanceOf[TextArea]
  }
}

