package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters related to inserting or changing HTML5 media elements (Audio and Video) in the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments")
@js.native
class ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments protected () extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  protected def this(htmlEditor: ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Determines if a media file will start playing automatically.
    */
  var autoPlay: Boolean = js.native
  /**
    * Determines if a media file repeats indefinitely, or stops when it reaches the last frame.
    */
  var loop: Boolean = js.native
  /**
    * Determines how a media file should be loaded when the page loads.
    */
  var preloadMode: String = js.native
  /**
    * Determines if the media player controls should be displayed.
    */
  var showPlayerControls: Boolean = js.native
}

