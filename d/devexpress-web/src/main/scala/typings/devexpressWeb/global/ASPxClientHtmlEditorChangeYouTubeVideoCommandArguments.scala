package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.CHANGEYOUTUBEVIDEO_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorChangeYouTubeVideoCommandArguments")
@js.native
open class ASPxClientHtmlEditorChangeYouTubeVideoCommandArguments protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments {
  /* private */ def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: Any) = this()
  
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
    * Determines if the target YouTube video can be displayed in fullscreen mode.
    */
  /* CompleteClass */
  var allowFullscreen: Boolean = js.native
  
  /**
    * Determines if the privacy-enhanced mode is enabled for the target YouTube video.
    */
  /* CompleteClass */
  var enablePrivacyEnhancedMode: Boolean = js.native
  
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML "id"</a> attribute of the target media element.
    */
  /* CompleteClass */
  var id: String = js.native
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: Any = js.native
  
  /**
    * Determines if the player controls are displayed for the target YouTube video.
    */
  /* CompleteClass */
  var showPlayerControls: Boolean = js.native
  
  /**
    * Determines if suggested videos are shown after the target YouTube video finishes.
    */
  /* CompleteClass */
  var showRelatedVideos: Boolean = js.native
  
  /**
    * Determines if the target YouTube video title and player actions (Watch later, Share) are shown.
    */
  /* CompleteClass */
  var showVideoInfo: Boolean = js.native
  
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
