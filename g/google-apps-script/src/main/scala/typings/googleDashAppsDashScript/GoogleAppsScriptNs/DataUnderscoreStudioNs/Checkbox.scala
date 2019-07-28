package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkbox extends js.Object {
  def setAllowOverride(allowOverride: Boolean): Checkbox
  def setHelpText(helpText: String): Checkbox
  def setId(id: String): Checkbox
  def setName(name: String): Checkbox
}

object Checkbox {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => Checkbox,
    setHelpText: String => Checkbox,
    setId: String => Checkbox,
    setName: String => Checkbox
  ): Checkbox = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[Checkbox]
  }
}

