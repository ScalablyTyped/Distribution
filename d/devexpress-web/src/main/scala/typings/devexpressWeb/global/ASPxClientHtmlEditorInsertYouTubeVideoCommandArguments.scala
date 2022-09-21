package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTYOUTUBEVIDEO_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments")
@js.native
open class ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorInsertYouTubeVideoCommandArguments {
  /**
    * Initializes a new instance of the object.
    * @param htmlEditor The Html Editor.
    * @param elementToReplace The element that should be inserted.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor) = this()
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, elementToReplace: Any) = this()
  
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
