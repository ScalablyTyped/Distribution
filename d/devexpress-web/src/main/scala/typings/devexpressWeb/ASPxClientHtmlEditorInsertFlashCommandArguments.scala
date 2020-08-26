package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTFLASH_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorInsertFlashCommandArguments extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  /**
    * Determines if the target flash element can be displayed in the fullscreen mode.
    */
  var allowFullscreen: Boolean = js.native
  /**
    * Determines if the target flash element will start playing automatically.
    */
  var autoPlay: Boolean = js.native
  /**
    * Determines if the flash related items are displayed in the context menu of the target flash element.
    */
  var enableFlashMenu: Boolean = js.native
  /**
    * Defines if the target flash element repeats indefinitely, or stops when it reaches the last frame.
    */
  var loop: Boolean = js.native
  /**
    * Defines the rendering quality level used for the target flash element.
    */
  var quality: String = js.native
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
  @scala.inline
  implicit class ASPxClientHtmlEditorInsertFlashCommandArgumentsOps[Self <: ASPxClientHtmlEditorInsertFlashCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowFullscreen(value: Boolean): Self = this.set("allowFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableFlashMenu(value: Boolean): Self = this.set("enableFlashMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
  }
  
}

