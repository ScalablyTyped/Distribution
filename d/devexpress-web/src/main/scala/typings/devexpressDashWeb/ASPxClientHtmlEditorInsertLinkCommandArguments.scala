package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTLINK_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertLinkCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertLinkCommandArguments protected () extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorInsertLinkCommandArguments class.
    * @param htmlEditor An HTML editor in which you want to insert an element.
    * @param selectedElement An object containing the currently selected element in the HTML editor. This element will be replaced with the inserted link.
    */
  def this(htmlEditor: ASPxClientHtmlEditor, selectedElement: js.Any) = this()
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

