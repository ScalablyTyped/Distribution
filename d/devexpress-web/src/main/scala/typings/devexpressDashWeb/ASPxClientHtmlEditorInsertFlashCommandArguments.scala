package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the INSERTFLASH_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertFlashCommandArguments extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  /**
    * Determines if the target flash element can be displayed in the fullscreen mode.
    * Value: true, if the fullscreen mode is allowed; otherwise, false.
    */
  var allowFullscreen: Boolean
  /**
    * Determines if the target flash element will start playing automatically.
    * Value: true, if autoplay is enabled; otherwise, false.
    */
  var autoPlay: Boolean
  /**
    * Determines if the flash related items are displayed in the context menu of the target flash element.
    * Value: true, if the specific context menu items are displayed; otherwise, false
    */
  var enableFlashMenu: Boolean
  /**
    * Defines if the target flash element repeats indefinitely, or stops when it reaches the last frame.
    * Value: true, to loop playback; otherwise, false.
    */
  var loop: Boolean
  /**
    * Defines the rendering quality level used for the target flash element.
    * Value: A string value that specifies the target flash element rendering quality.
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
    selectedElement: js.Object,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertFlashCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align, allowFullscreen = allowFullscreen, autoPlay = autoPlay, enableFlashMenu = enableFlashMenu, id = id, loop = loop, quality = quality, selectedElement = selectedElement, src = src, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertFlashCommandArguments]
  }
}

