package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectSingle extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectSingle
  def setAllowOverride(allowOverride: scala.Boolean): SelectSingle
  def setHelpText(helpText: java.lang.String): SelectSingle
  def setId(id: java.lang.String): SelectSingle
  def setName(name: java.lang.String): SelectSingle
}

object SelectSingle {
  @scala.inline
  def apply(
    addOption: js.Function1[OptionBuilder, SelectSingle],
    setAllowOverride: js.Function1[scala.Boolean, SelectSingle],
    setHelpText: js.Function1[java.lang.String, SelectSingle],
    setId: js.Function1[java.lang.String, SelectSingle],
    setName: js.Function1[java.lang.String, SelectSingle]
  ): SelectSingle = {
    val __obj = js.Dynamic.literal(addOption = addOption, setAllowOverride = setAllowOverride, setHelpText = setHelpText, setId = setId, setName = setName)
  
    __obj.asInstanceOf[SelectSingle]
  }
}

