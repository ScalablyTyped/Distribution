package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  def build(): js.Object
  def newCheckbox(): Checkbox
  def newInfo(): Info
  def newOptionBuilder(): OptionBuilder
  def newSelectMultiple(): SelectMultiple
  def newSelectSingle(): SelectSingle
  def newTextArea(): TextArea
  def newTextInput(): TextInput
  def printJson(): java.lang.String
  def setDateRangeRequired(dateRangeRequired: scala.Boolean): Config
}

object Config {
  @scala.inline
  def apply(
    build: () => js.Object,
    newCheckbox: () => Checkbox,
    newInfo: () => Info,
    newOptionBuilder: () => OptionBuilder,
    newSelectMultiple: () => SelectMultiple,
    newSelectSingle: () => SelectSingle,
    newTextArea: () => TextArea,
    newTextInput: () => TextInput,
    printJson: () => java.lang.String,
    setDateRangeRequired: scala.Boolean => Config
  ): Config = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), newCheckbox = js.Any.fromFunction0(newCheckbox), newInfo = js.Any.fromFunction0(newInfo), newOptionBuilder = js.Any.fromFunction0(newOptionBuilder), newSelectMultiple = js.Any.fromFunction0(newSelectMultiple), newSelectSingle = js.Any.fromFunction0(newSelectSingle), newTextArea = js.Any.fromFunction0(newTextArea), newTextInput = js.Any.fromFunction0(newTextInput), printJson = js.Any.fromFunction0(printJson), setDateRangeRequired = js.Any.fromFunction1(setDateRangeRequired))
  
    __obj.asInstanceOf[Config]
  }
}

