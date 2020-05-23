package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTLINK_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertLinkCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings defining the appearance of the target link element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Determines where to open the target link.
    */
  var target: String
  /**
    * Specifiies the text of the target link.
    */
  var text: String
  /**
    * Defines the title of the target link.
    */
  var title: String
  /**
    * Specifies the url of the page the target link goes to.
    */
  var url: String
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
}

