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
    setAllowOverride: js.Function1[scala.Boolean, Checkbox],
    setHelpText: js.Function1[java.lang.String, Checkbox],
    setId: js.Function1[java.lang.String, Checkbox],
    setName: js.Function1[java.lang.String, Checkbox]
  ): Checkbox = {
    val __obj = js.Dynamic.literal(setAllowOverride = setAllowOverride, setHelpText = setHelpText, setId = setId, setName = setName)
  
    __obj.asInstanceOf[Checkbox]
  }
}

