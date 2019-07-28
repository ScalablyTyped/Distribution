package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the INSERTYOUTUBEVIDEO_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  /**
    * Determines if the target YouTube video can be displayed in fullscreen mode.
    * Value: true, if the fullscreen mode is allowed; otherwise, false.
    */
  var allowFullscreen: Boolean
  /**
    * Determines if the privacy-enhanced mode is enabled for the target YouTube video.
    * Value: true, if the privace-enhanced mode is enabled; otherwise, false
    */
  var enablePrivacyEnhancedMode: Boolean
  /**
    * Determines if the player controls are displayed for the target YouTube video.
    * Value: true, if the player controls are displayed; otherwise, false.
    */
  var showPlayerControls: Boolean
  /**
    * Determines if suggested videos are shown after the target YouTube video finishes.
    * Value: true, to show suggested videos; otherwise, false
    */
  var showRelatedVideos: Boolean
  /**
    * Determines if the target YouTube video title and player actions (Watch later, Share) are shown.
    * Value: true, to display the title and player actions; otherwise, false.
    */
  var showVideoInfo: Boolean
}

object ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments {
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    allowFullscreen: Boolean,
    enablePrivacyEnhancedMode: Boolean,
    id: String,
    selectedElement: js.Object,
    showPlayerControls: Boolean,
    showRelatedVideos: Boolean,
    showVideoInfo: Boolean,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align, allowFullscreen = allowFullscreen, enablePrivacyEnhancedMode = enablePrivacyEnhancedMode, id = id, selectedElement = selectedElement, showPlayerControls = showPlayerControls, showRelatedVideos = showRelatedVideos, showVideoInfo = showVideoInfo, src = src, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments]
  }
}

