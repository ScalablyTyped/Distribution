package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTIMAGE_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertImageCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertImageCommandArguments protected () extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorInsertImageCommandArguments class.
    * @param htmlEditor An HTML editor in which you want to insert an element.
    * @param elementToReplace An object containing the currently selected element in the HTML editor. This element will be replaced with the inserted image.
    */
  def this(htmlEditor: ASPxClientHtmlEditor, elementToReplace: js.Any) = this()
  /**
    * Determines the position of the target image.
    */
  var align: String = js.native
  /**
    * Creates an alternate text for the target image.
    */
  var alt: String = js.native
  /**
    * Specifies the source of the target image.
    */
  var src: String = js.native
  /**
    * Contains the style settings specifying the appearance of the target image.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Determines if the target image is wrapped with text.
    */
  var useFloat: Boolean = js.native
}

