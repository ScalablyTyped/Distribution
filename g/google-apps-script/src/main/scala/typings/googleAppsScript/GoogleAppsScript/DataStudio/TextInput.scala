package typings.googleAppsScript.GoogleAppsScript.DataStudio

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
@js.native
trait TextInput extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextInput = js.native
  def setHelpText(helpText: String): TextInput = js.native
  def setId(id: String): TextInput = js.native
  def setIsDynamic(isDynamic: Boolean): TextInput = js.native
  def setName(name: String): TextInput = js.native
  def setPlaceholder(placeholder: String): TextInput = js.native
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
  @scala.inline
  implicit class TextInputOps[Self <: TextInput] (val x: Self) extends AnyVal {
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
    def setSetAllowOverride(value: Boolean => TextInput): Self = this.set("setAllowOverride", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHelpText(value: String => TextInput): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetId(value: String => TextInput): Self = this.set("setId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIsDynamic(value: Boolean => TextInput): Self = this.set("setIsDynamic", js.Any.fromFunction1(value))
    @scala.inline
    def setSetName(value: String => TextInput): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPlaceholder(value: String => TextInput): Self = this.set("setPlaceholder", js.Any.fromFunction1(value))
  }
  
}

