package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTLINK_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertLinkCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertLinkCommandArguments protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorInsertLinkCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorInsertLinkCommandArguments class.
    * @param htmlEditor An HTML editor in which you want to insert an element.
    * @param selectedElement An object containing the currently selected element in the HTML editor. This element will be replaced with the inserted link.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  override var selectedElement: js.Any = js.native
  /**
    * Contains the style settings defining the appearance of the target link element.
    */
  /* CompleteClass */
  override var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Determines where to open the target link.
    */
  /* CompleteClass */
  override var target: String = js.native
  /**
    * Specifiies the text of the target link.
    */
  /* CompleteClass */
  override var text: String = js.native
  /**
    * Defines the title of the target link.
    */
  /* CompleteClass */
  override var title: String = js.native
  /**
    * Specifies the url of the page the target link goes to.
    */
  /* CompleteClass */
  override var url: String = js.native
}

