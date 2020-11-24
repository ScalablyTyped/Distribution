package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait TextArea extends js.Object {
  
  def setAllowOverride(allowOverride: Boolean): TextArea = js.native
  
  def setHelpText(helpText: String): TextArea = js.native
  
  def setId(id: String): TextArea = js.native
  
  def setIsDynamic(isDynamic: Boolean): TextArea = js.native
  
  def setName(name: String): TextArea = js.native
  
  def setPlaceholder(placeholder: String): TextArea = js.native
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
  
  @scala.inline
  implicit class TextAreaOps[Self <: TextArea] (val x: Self) extends AnyVal {
    
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
    def setSetAllowOverride(value: Boolean => TextArea): Self = this.set("setAllowOverride", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => TextArea): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetId(value: String => TextArea): Self = this.set("setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsDynamic(value: Boolean => TextArea): Self = this.set("setIsDynamic", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => TextArea): Self = this.set("setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPlaceholder(value: String => TextArea): Self = this.set("setPlaceholder", js.Any.fromFunction1(value))
  }
}
