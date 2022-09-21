package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTFLASH_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertFlashCommandArguments
  extends StObject
     with ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  
  /**
    * Determines if the target flash element can be displayed in the fullscreen mode.
    */
  var allowFullscreen: Boolean
  
  /**
    * Determines if the target flash element will start playing automatically.
    */
  var autoPlay: Boolean
  
  /**
    * Determines if the flash related items are displayed in the context menu of the target flash element.
    */
  var enableFlashMenu: Boolean
  
  /**
    * Defines if the target flash element repeats indefinitely, or stops when it reaches the last frame.
    */
  var loop: Boolean
  
  /**
    * Defines the rendering quality level used for the target flash element.
    */
  var quality: String
}
object ASPxClientHtmlEditorInsertFlashCommandArguments {
  
  inline def apply(
    GetCommandName: () => String,
    align: String,
    allowFullscreen: Boolean,
    autoPlay: Boolean,
    enableFlashMenu: Boolean,
    id: String,
    loop: Boolean,
    quality: String,
    selectedElement: Any,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertFlashCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align.asInstanceOf[js.Any], allowFullscreen = allowFullscreen.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], enableFlashMenu = enableFlashMenu.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertFlashCommandArguments]
  }
  
  extension [Self <: ASPxClientHtmlEditorInsertFlashCommandArguments](x: Self) {
    
    inline def setAllowFullscreen(value: Boolean): Self = StObject.set(x, "allowFullscreen", value.asInstanceOf[js.Any])
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setEnableFlashMenu(value: Boolean): Self = StObject.set(x, "enableFlashMenu", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
  }
}
