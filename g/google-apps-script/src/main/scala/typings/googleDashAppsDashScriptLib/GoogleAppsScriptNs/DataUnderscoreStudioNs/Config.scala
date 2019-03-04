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
    build: js.Function0[js.Object],
    newCheckbox: js.Function0[Checkbox],
    newInfo: js.Function0[Info],
    newOptionBuilder: js.Function0[OptionBuilder],
    newSelectMultiple: js.Function0[SelectMultiple],
    newSelectSingle: js.Function0[SelectSingle],
    newTextArea: js.Function0[TextArea],
    newTextInput: js.Function0[TextInput],
    printJson: js.Function0[java.lang.String],
    setDateRangeRequired: js.Function1[scala.Boolean, Config]
  ): Config = {
    val __obj = js.Dynamic.literal(build = build, newCheckbox = newCheckbox, newInfo = newInfo, newOptionBuilder = newOptionBuilder, newSelectMultiple = newSelectMultiple, newSelectSingle = newSelectSingle, newTextArea = newTextArea, newTextInput = newTextInput, printJson = printJson, setDateRangeRequired = setDateRangeRequired)
  
    __obj.asInstanceOf[Config]
  }
}

