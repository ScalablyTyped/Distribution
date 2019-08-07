package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTYOUTUBEVIDEO_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments protected () extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  def this(htmlEditor: ASPxClientHtmlEditor) = this()
  def this(htmlEditor: ASPxClientHtmlEditor, elementToReplace: js.Any) = this()
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

