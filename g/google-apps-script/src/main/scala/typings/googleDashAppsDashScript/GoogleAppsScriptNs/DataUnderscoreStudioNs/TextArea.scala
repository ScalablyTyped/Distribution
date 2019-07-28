package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextArea extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextArea
  def setHelpText(helpText: String): TextArea
  def setId(id: String): TextArea
  def setName(name: String): TextArea
  def setPlaceholder(placeholder: String): TextArea
}

object TextArea {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => TextArea,
    setHelpText: String => TextArea,
    setId: String => TextArea,
    setName: String => TextArea,
    setPlaceholder: String => TextArea
  ): TextArea = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
  
    __obj.asInstanceOf[TextArea]
  }
}

