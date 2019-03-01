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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAllowOverride")(setAllowOverride)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setName")(setName)
    __obj.asInstanceOf[Checkbox]
  }
}

