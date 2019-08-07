package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTFLASH_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertFlashCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertFlashCommandArguments protected () extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  def this(htmlEditor: ASPxClientHtmlEditor) = this()
  def this(htmlEditor: ASPxClientHtmlEditor, elementToReplace: js.Any) = this()
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

