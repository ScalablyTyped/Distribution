package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTIMAGE_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertImageCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertImageCommandArguments protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorInsertImageCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorInsertImageCommandArguments class.
    * @param htmlEditor An HTML editor in which you want to insert an element.
    * @param elementToReplace An object containing the currently selected element in the HTML editor. This element will be replaced with the inserted image.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, elementToReplace: js.Any) = this()
  /**
    * Determines the position of the target image.
    */
  /* CompleteClass */
  override var align: String = js.native
  /**
    * Creates an alternate text for the target image.
    */
  /* CompleteClass */
  override var alt: String = js.native
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  override var selectedElement: js.Any = js.native
  /**
    * Specifies the source of the target image.
    */
  /* CompleteClass */
  override var src: String = js.native
  /**
    * Contains the style settings specifying the appearance of the target image.
    */
  /* CompleteClass */
  override var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Determines if the target image is wrapped with text.
    */
  /* CompleteClass */
  override var useFloat: Boolean = js.native
}

