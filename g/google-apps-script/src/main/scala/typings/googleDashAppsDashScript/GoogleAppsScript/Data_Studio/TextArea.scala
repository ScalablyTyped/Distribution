package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text area information for the config. Its properties determine how the text input is
  * displayed in Data Studio.
  *
  * Usage:
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var textArea1 = config.newTextArea()
  *       .setId("textArea1")
  *       .setName("Search")
  *       .setHelpText("for example, Coldplay")
  *       .setAllowOverride(true)
  *       .setPlaceholder("Search for an artist for all songs.");
  */
trait TextArea extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextArea
  def setHelpText(helpText: String): TextArea
  def setId(id: String): TextArea
  def setIsDynamic(isDynamic: Boolean): TextArea
  def setName(name: String): TextArea
  def setPlaceholder(placeholder: String): TextArea
}

object TextArea {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => TextArea,
    setHelpText: String => TextArea,
    setId: String => TextArea,
    setIsDynamic: Boolean => TextArea,
    setName: String => TextArea,
    setPlaceholder: String => TextArea
  ): TextArea = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
  
    __obj.asInstanceOf[TextArea]
  }
}

