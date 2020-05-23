package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTVIDEO_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertVideoCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertVideoCommandArguments protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorInsertVideoCommandArguments {
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor) = this()
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, elementToReplace: js.Any) = this()
  /**
    * Determines the position of the target media element.
    */
  /* CompleteClass */
  override var align: String = js.native
  /**
    * Determines if a media file will start playing automatically.
    */
  /* CompleteClass */
  override var autoPlay: Boolean = js.native
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML &quot;id&quot;</a> attribute of the target media element.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * Determines if a media file repeats indefinitely, or stops when it reaches the last frame.
    */
  /* CompleteClass */
  override var loop: Boolean = js.native
  /**
    * Defines the URL of an image that is shown while the video file is downloading, or until an end-user clicks the play button.
    */
  /* CompleteClass */
  override var posterUrl: String = js.native
  /**
    * Determines how a media file should be loaded when the page loads.
    */
  /* CompleteClass */
  override var preloadMode: String = js.native
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  override var selectedElement: js.Any = js.native
  /**
    * Determines if the media player controls should be displayed.
    */
  /* CompleteClass */
  override var showPlayerControls: Boolean = js.native
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

