package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains select single information for the config. Its properties determine how the select single
  * is displayed in Data Studio.
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectSingle()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .setAllowOverride(true)
  *       .addOption(option1)
  *       .addOption(option2);
  */
@js.native
trait SelectSingle extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectSingle = js.native
  def setAllowOverride(allowOverride: Boolean): SelectSingle = js.native
  def setHelpText(helpText: String): SelectSingle = js.native
  def setId(id: String): SelectSingle = js.native
  def setIsDynamic(isDynamic: Boolean): SelectSingle = js.native
  def setName(name: String): SelectSingle = js.native
}

object SelectSingle {
  @scala.inline
  def apply(
    addOption: OptionBuilder => SelectSingle,
    setAllowOverride: Boolean => SelectSingle,
    setHelpText: String => SelectSingle,
    setId: String => SelectSingle,
    setIsDynamic: Boolean => SelectSingle,
    setName: String => SelectSingle
  ): SelectSingle = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SelectSingle]
  }
  @scala.inline
  implicit class SelectSingleOps[Self <: SelectSingle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddOption(value: OptionBuilder => SelectSingle): Self = this.set("addOption", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAllowOverride(value: Boolean => SelectSingle): Self = this.set("setAllowOverride", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHelpText(value: String => SelectSingle): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetId(value: String => SelectSingle): Self = this.set("setId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIsDynamic(value: Boolean => SelectSingle): Self = this.set("setIsDynamic", js.Any.fromFunction1(value))
    @scala.inline
    def setSetName(value: String => SelectSingle): Self = this.set("setName", js.Any.fromFunction1(value))
  }
  
}

