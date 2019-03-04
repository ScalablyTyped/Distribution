package typings
package devexpressDashWebLib

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
  var target: java.lang.String
  /**
    * Specifiies the text of the target link.
    * Value: A string value specifying the text of the target link.
    */
  var text: java.lang.String
  /**
    * Defines the title of the target link.
    * Value: A string value defining the title of the target link.
    */
  var title: java.lang.String
  /**
    * Specifies the url of the page the target link goes to.
    * Value: A string value specifying the target link url.
    */
  var url: java.lang.String
}

object ASPxClientHtmlEditorInsertLinkCommandArguments {
  @scala.inline
  def apply(
    selectedElement: js.Object,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    target: java.lang.String,
    text: java.lang.String,
    title: java.lang.String,
    url: java.lang.String
  ): ASPxClientHtmlEditorInsertLinkCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement, styleSettings = styleSettings, target = target, text = text, title = title, url = url)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertLinkCommandArguments]
  }
}

