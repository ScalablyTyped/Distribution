package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkbox extends js.Object {
  def setAllowOverride(allowOverride: scala.Boolean): Checkbox
  def setHelpText(helpText: java.lang.String): Checkbox
  def setId(id: java.lang.String): Checkbox
  def setName(name: java.lang.String): Checkbox
}

object Checkbox {
  @scala.inline
  def apply(
    setAllowOverride: scala.Boolean => Checkbox,
    setHelpText: java.lang.String => Checkbox,
    setId: java.lang.String => Checkbox,
    setName: java.lang.String => Checkbox
  ): Checkbox = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[Checkbox]
  }
}

