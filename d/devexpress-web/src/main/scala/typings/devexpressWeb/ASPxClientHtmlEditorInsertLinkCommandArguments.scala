package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTLINK_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorInsertLinkCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings defining the appearance of the target link element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Determines where to open the target link.
    */
  var target: String = js.native
  /**
    * Specifiies the text of the target link.
    */
  var text: String = js.native
  /**
    * Defines the title of the target link.
    */
  var title: String = js.native
  /**
    * Specifies the url of the page the target link goes to.
    */
  var url: String = js.native
}

object ASPxClientHtmlEditorInsertLinkCommandArguments {
  @scala.inline
  def apply(
    selectedElement: js.Any,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    target: String,
    text: String,
    title: String,
    url: String
  ): ASPxClientHtmlEditorInsertLinkCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertLinkCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorInsertLinkCommandArgumentsOps[Self <: ASPxClientHtmlEditorInsertLinkCommandArguments] (val x: Self) extends AnyVal {
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
    def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = this.set("styleSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

