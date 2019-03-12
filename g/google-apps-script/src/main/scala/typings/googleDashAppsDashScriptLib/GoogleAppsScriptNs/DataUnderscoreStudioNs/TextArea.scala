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
    setAllowOverride: scala.Boolean => TextArea,
    setHelpText: java.lang.String => TextArea,
    setId: java.lang.String => TextArea,
    setName: java.lang.String => TextArea,
    setPlaceholder: java.lang.String => TextArea
  ): TextArea = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
  
    __obj.asInstanceOf[TextArea]
  }
}

