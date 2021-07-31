package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.CHANGEFLASH_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorChangeFlashCommandArguments")
@js.native
class ASPxClientHtmlEditorChangeFlashCommandArguments protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorInsertFlashCommandArguments {
  protected def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  
  /**
    * Returns the name of the client-side command corresponding to the parameter.
    */
  /* CompleteClass */
  override def GetCommandName(): String = js.native
  
  /**
    * Determines the position of the target media element.
    */
  /* CompleteClass */
  var align: String = js.native
  
  /**
    * Determines if the target flash element can be displayed in the fullscreen mode.
    */
  /* CompleteClass */
  var allowFullscreen: Boolean = js.native
  
  /**
    * Determines if the target flash element will start playing automatically.
    */
  /* CompleteClass */
  var autoPlay: Boolean = js.native
  
  /**
    * Determines if the flash related items are displayed in the context menu of the target flash element.
    */
  /* CompleteClass */
  var enableFlashMenu: Boolean = js.native
  
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML "id"</a> attribute of the target media element.
    */
  /* CompleteClass */
  var id: String = js.native
  
  /**
    * Defines if the target flash element repeats indefinitely, or stops when it reaches the last frame.
    */
  /* CompleteClass */
  var loop: Boolean = js.native
  
  /**
    * Defines the rendering quality level used for the target flash element.
    */
  /* CompleteClass */
  var quality: String = js.native
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: js.Any = js.native
  
  /**
    * Defines the source of the target media element.
    */
  /* CompleteClass */
  var src: String = js.native
  
  /**
    * Contains the style settings defining the appearance of the target media element.
    */
  /* CompleteClass */
  var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
}
