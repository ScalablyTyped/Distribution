package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text input information for the config. Its properties determine how the text input is
  * displayed in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info1 = config.newTextInput()
  *       .setId("info1")
  *       .setName("Search")
  *       .setHelpText("for example, Coldplay")
  *       .setAllowOverride(true)
  *       .setPlaceholder("Search for an artist for all songs.");
  */
trait TextInput extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextInput
  def setHelpText(helpText: String): TextInput
  def setId(id: String): TextInput
  def setIsDynamic(isDynamic: Boolean): TextInput
  def setName(name: String): TextInput
  def setPlaceholder(placeholder: String): TextInput
}

object TextInput {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => TextInput,
    setHelpText: String => TextInput,
    setId: String => TextInput,
    setIsDynamic: Boolean => TextInput,
    setName: String => TextInput,
    setPlaceholder: String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
  
    __obj.asInstanceOf[TextInput]
  }
}

