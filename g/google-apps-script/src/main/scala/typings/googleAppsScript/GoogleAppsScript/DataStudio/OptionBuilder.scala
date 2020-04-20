package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for creating options for SelectSingles and SelectMultiples.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
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
  *       .addOption(option1)
  *       .addOption(option2);
  */
trait OptionBuilder extends js.Object {
  def setLabel(label: String): OptionBuilder
  def setValue(value: String): OptionBuilder
}

object OptionBuilder {
  @scala.inline
  def apply(setLabel: String => OptionBuilder, setValue: String => OptionBuilder): OptionBuilder = {
    val __obj = js.Dynamic.literal(setLabel = js.Any.fromFunction1(setLabel), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[OptionBuilder]
  }
}

