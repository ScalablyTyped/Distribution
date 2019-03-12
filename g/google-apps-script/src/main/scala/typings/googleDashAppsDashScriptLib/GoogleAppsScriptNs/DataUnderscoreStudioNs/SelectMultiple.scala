package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMultiple extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectMultiple
  def setAllowOverride(allowOverride: scala.Boolean): SelectMultiple
  def setHelpText(helpText: java.lang.String): SelectMultiple
  def setId(id: java.lang.String): SelectMultiple
  def setName(name: java.lang.String): SelectMultiple
}

object SelectMultiple {
  @scala.inline
  def apply(
    addOption: OptionBuilder => SelectMultiple,
    setAllowOverride: scala.Boolean => SelectMultiple,
    setHelpText: java.lang.String => SelectMultiple,
    setId: java.lang.String => SelectMultiple,
    setName: java.lang.String => SelectMultiple
  ): SelectMultiple = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[SelectMultiple]
  }
}

