package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTIMAGE_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertImageCommandArguments")
@js.native
open class ASPxClientHtmlEditorInsertImageCommandArguments protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorInsertImageCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorInsertImageCommandArguments class.
    * @param htmlEditor An HTML editor in which you want to insert an element.
    * @param elementToReplace An object containing the currently selected element in the HTML editor. This element will be replaced with the inserted image.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, elementToReplace: Any) = this()
  
  /**
    * Determines the position of the target image.
    */
  /* CompleteClass */
  var align: String = js.native
  
  /**
    * Creates an alternate text for the target image.
    */
  /* CompleteClass */
  var alt: String = js.native
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: Any = js.native
  
  /**
    * Specifies the source of the target image.
    */
  /* CompleteClass */
  var src: String = js.native
  
  /**
    * Contains the style settings specifying the appearance of the target image.
    */
  /* CompleteClass */
  var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
  
  /**
    * Determines if the target image is wrapped with text.
    */
  /* CompleteClass */
  var useFloat: Boolean = js.native
}
