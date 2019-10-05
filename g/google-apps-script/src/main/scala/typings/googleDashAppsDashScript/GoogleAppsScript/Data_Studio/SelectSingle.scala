package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectSingle extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectSingle
  def setAllowOverride(allowOverride: Boolean): SelectSingle
  def setHelpText(helpText: String): SelectSingle
  def setId(id: String): SelectSingle
  def setName(name: String): SelectSingle
}

object SelectSingle {
  @scala.inline
  def apply(
    addOption: OptionBuilder => SelectSingle,
    setAllowOverride: Boolean => SelectSingle,
    setHelpText: String => SelectSingle,
    setId: String => SelectSingle,
    setName: String => SelectSingle
  ): SelectSingle = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[SelectSingle]
  }
}

