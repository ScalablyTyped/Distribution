package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the configuration entries for a connector. These configuration entries define what
  * questions are asked when adding a new connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info_entry = config.newInfo()
  *       .setId("info_id")
  *       .setHelpText("This connector can connect to multiple data endpoints.");
  */
trait Config extends js.Object {
  def build(): Config
  def newCheckbox(): Checkbox
  def newInfo(): Info
  def newOptionBuilder(): OptionBuilder
  def newSelectMultiple(): SelectMultiple
  def newSelectSingle(): SelectSingle
  def newTextArea(): TextArea
  def newTextInput(): TextInput
  def printJson(): String
  def setDateRangeRequired(dateRangeRequired: Boolean): Config
  def setIsSteppedConfig(isSteppedConfig: Boolean): Config
}

object Config {
  @scala.inline
  def apply(
    build: () => Config,
    newCheckbox: () => Checkbox,
    newInfo: () => Info,
    newOptionBuilder: () => OptionBuilder,
    newSelectMultiple: () => SelectMultiple,
    newSelectSingle: () => SelectSingle,
    newTextArea: () => TextArea,
    newTextInput: () => TextInput,
    printJson: () => String,
    setDateRangeRequired: Boolean => Config,
    setIsSteppedConfig: Boolean => Config
  ): Config = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), newCheckbox = js.Any.fromFunction0(newCheckbox), newInfo = js.Any.fromFunction0(newInfo), newOptionBuilder = js.Any.fromFunction0(newOptionBuilder), newSelectMultiple = js.Any.fromFunction0(newSelectMultiple), newSelectSingle = js.Any.fromFunction0(newSelectSingle), newTextArea = js.Any.fromFunction0(newTextArea), newTextInput = js.Any.fromFunction0(newTextInput), printJson = js.Any.fromFunction0(printJson), setDateRangeRequired = js.Any.fromFunction1(setDateRangeRequired), setIsSteppedConfig = js.Any.fromFunction1(setIsSteppedConfig))
  
    __obj.asInstanceOf[Config]
  }
}

