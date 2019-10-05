package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMultiple extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectMultiple
  def setAllowOverride(allowOverride: Boolean): SelectMultiple
  def setHelpText(helpText: String): SelectMultiple
  def setId(id: String): SelectMultiple
  def setName(name: String): SelectMultiple
}

object SelectMultiple {
  @scala.inline
  def apply(
    addOption: OptionBuilder => SelectMultiple,
    setAllowOverride: Boolean => SelectMultiple,
    setHelpText: String => SelectMultiple,
    setId: String => SelectMultiple,
    setName: String => SelectMultiple
  ): SelectMultiple = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[SelectMultiple]
  }
}

