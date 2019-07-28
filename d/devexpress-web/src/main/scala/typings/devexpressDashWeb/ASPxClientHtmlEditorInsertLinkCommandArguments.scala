package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the INSERTLINK_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertLinkCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings defining the appearance of the target link element.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings defining the appearance of the target link element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Determines where to open the target link.
    * Value: A string that specifies where to open the target link <a href="http://www.w3schools.com/tags/att_a_target.asp">in any correct format</a>.
    */
  var target: String
  /**
    * Specifiies the text of the target link.
    * Value: A string value specifying the text of the target link.
    */
  var text: String
  /**
    * Defines the title of the target link.
    * Value: A string value defining the title of the target link.
    */
  var title: String
  /**
    * Specifies the url of the page the target link goes to.
    * Value: A string value specifying the target link url.
    */
  var url: String
}

object ASPxClientHtmlEditorInsertLinkCommandArguments {
  @scala.inline
  def apply(
    selectedElement: js.Object,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    target: String,
    text: String,
    title: String,
    url: String
  ): ASPxClientHtmlEditorInsertLinkCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement, styleSettings = styleSettings, target = target, text = text, title = title, url = url)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertLinkCommandArguments]
  }
}

