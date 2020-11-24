package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTYOUTUBEVIDEO_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  
  /**
    * Determines if the target YouTube video can be displayed in fullscreen mode.
    */
  var allowFullscreen: Boolean = js.native
  
  /**
    * Determines if the privacy-enhanced mode is enabled for the target YouTube video.
    */
  var enablePrivacyEnhancedMode: Boolean = js.native
  
  /**
    * Determines if the player controls are displayed for the target YouTube video.
    */
  var showPlayerControls: Boolean = js.native
  
  /**
    * Determines if suggested videos are shown after the target YouTube video finishes.
    */
  var showRelatedVideos: Boolean = js.native
  
  /**
    * Determines if the target YouTube video title and player actions (Watch later, Share) are shown.
    */
  var showVideoInfo: Boolean = js.native
}
object ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments {
  
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    allowFullscreen: Boolean,
    enablePrivacyEnhancedMode: Boolean,
    id: String,
    selectedElement: js.Any,
    showPlayerControls: Boolean,
    showRelatedVideos: Boolean,
    showVideoInfo: Boolean,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align.asInstanceOf[js.Any], allowFullscreen = allowFullscreen.asInstanceOf[js.Any], enablePrivacyEnhancedMode = enablePrivacyEnhancedMode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], showPlayerControls = showPlayerControls.asInstanceOf[js.Any], showRelatedVideos = showRelatedVideos.asInstanceOf[js.Any], showVideoInfo = showVideoInfo.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorInsertYouTubeVideoCommandArgumentsOps[Self <: ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments] (val x: Self) extends AnyVal {
    
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
    def setEnablePrivacyEnhancedMode(value: Boolean): Self = this.set("enablePrivacyEnhancedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPlayerControls(value: Boolean): Self = this.set("showPlayerControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRelatedVideos(value: Boolean): Self = this.set("showRelatedVideos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowVideoInfo(value: Boolean): Self = this.set("showVideoInfo", value.asInstanceOf[js.Any])
  }
}
