package typings
package devexpressDashWebLib

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
  var allowFullscreen: scala.Boolean
  /**
    * Determines if the privacy-enhanced mode is enabled for the target YouTube video.
    * Value: true, if the privace-enhanced mode is enabled; otherwise, false
    */
  var enablePrivacyEnhancedMode: scala.Boolean
  /**
    * Determines if the player controls are displayed for the target YouTube video.
    * Value: true, if the player controls are displayed; otherwise, false.
    */
  var showPlayerControls: scala.Boolean
  /**
    * Determines if suggested videos are shown after the target YouTube video finishes.
    * Value: true, to show suggested videos; otherwise, false
    */
  var showRelatedVideos: scala.Boolean
  /**
    * Determines if the target YouTube video title and player actions (Watch later, Share) are shown.
    * Value: true, to display the title and player actions; otherwise, false.
    */
  var showVideoInfo: scala.Boolean
}

