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
    addOption: js.Function1[OptionBuilder, SelectMultiple],
    setAllowOverride: js.Function1[scala.Boolean, SelectMultiple],
    setHelpText: js.Function1[java.lang.String, SelectMultiple],
    setId: js.Function1[java.lang.String, SelectMultiple],
    setName: js.Function1[java.lang.String, SelectMultiple]
  ): SelectMultiple = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addOption")(addOption)
    __obj.updateDynamic("setAllowOverride")(setAllowOverride)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setName")(setName)
    __obj.asInstanceOf[SelectMultiple]
  }
}

