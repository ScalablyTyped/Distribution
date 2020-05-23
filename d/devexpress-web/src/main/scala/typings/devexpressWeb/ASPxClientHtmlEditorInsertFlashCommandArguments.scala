package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTFLASH_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertFlashCommandArguments extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
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
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    allowFullscreen: Boolean,
    autoPlay: Boolean,
    enableFlashMenu: Boolean,
    id: String,
    loop: Boolean,
    quality: String,
    selectedElement: js.Any,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertFlashCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align.asInstanceOf[js.Any], allowFullscreen = allowFullscreen.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], enableFlashMenu = enableFlashMenu.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertFlashCommandArguments]
  }
}

