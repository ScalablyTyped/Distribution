package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.CHANGEYOUTUBEVIDEO_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorChangeYouTubeVideoCommandArguments")
@js.native
class ASPxClientHtmlEditorChangeYouTubeVideoCommandArguments protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments {
  protected def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Determines the position of the target media element.
    */
  /* CompleteClass */
  override var align: String = js.native
  /**
    * Determines if the target YouTube video can be displayed in fullscreen mode.
    */
  /* CompleteClass */
  override var allowFullscreen: Boolean = js.native
  /**
    * Determines if the privacy-enhanced mode is enabled for the target YouTube video.
    */
  /* CompleteClass */
  override var enablePrivacyEnhancedMode: Boolean = js.native
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML &quot;id&quot;</a> attribute of the target media element.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  override var selectedElement: js.Any = js.native
  /**
    * Determines if the player controls are displayed for the target YouTube video.
    */
  /* CompleteClass */
  override var showPlayerControls: Boolean = js.native
  /**
    * Determines if suggested videos are shown after the target YouTube video finishes.
    */
  /* CompleteClass */
  override var showRelatedVideos: Boolean = js.native
  /**
    * Determines if the target YouTube video title and player actions (Watch later, Share) are shown.
    */
  /* CompleteClass */
  override var showVideoInfo: Boolean = js.native
  /**
    * Defines the source of the target media element.
    */
  /* CompleteClass */
  override var src: String = js.native
  /**
    * Contains the style settings defining the appearance of the target media element.
    */
  /* CompleteClass */
  override var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Returns the name of the client-side command corresponding to the parameter.
    */
  /* CompleteClass */
  override def GetCommandName(): String = js.native
}

