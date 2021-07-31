package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.CHANGEIMAGE_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorChangeImageCommandArguments")
@js.native
class ASPxClientHtmlEditorChangeImageCommandArguments protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorInsertImageCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorChangeImageCommandArguments class.
    * @param htmlEditor The html editor in which the target element is located.
    * @param selectedElement The image that is about to be changed.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  
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
  var selectedElement: js.Any = js.native
  
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
