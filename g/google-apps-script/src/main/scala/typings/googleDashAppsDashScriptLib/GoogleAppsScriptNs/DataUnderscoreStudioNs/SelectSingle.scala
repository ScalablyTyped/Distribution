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
    addOption: OptionBuilder => SelectSingle,
    setAllowOverride: scala.Boolean => SelectSingle,
    setHelpText: java.lang.String => SelectSingle,
    setId: java.lang.String => SelectSingle,
    setName: java.lang.String => SelectSingle
  ): SelectSingle = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[SelectSingle]
  }
}

