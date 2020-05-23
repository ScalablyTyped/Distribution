package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.CHANGEFLASH_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorChangeFlashCommandArguments")
@js.native
class ASPxClientHtmlEditorChangeFlashCommandArguments protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorInsertFlashCommandArguments {
  protected def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Determines the position of the target media element.
    */
  /* CompleteClass */
  override var align: String = js.native
  /**
    * Determines if the target flash element can be displayed in the fullscreen mode.
    */
  /* CompleteClass */
  override var allowFullscreen: Boolean = js.native
  /**
    * Determines if the target flash element will start playing automatically.
    */
  /* CompleteClass */
  override var autoPlay: Boolean = js.native
  /**
    * Determines if the flash related items are displayed in the context menu of the target flash element.
    */
  /* CompleteClass */
  override var enableFlashMenu: Boolean = js.native
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML &quot;id&quot;</a> attribute of the target media element.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * Defines if the target flash element repeats indefinitely, or stops when it reaches the last frame.
    */
  /* CompleteClass */
  override var loop: Boolean = js.native
  /**
    * Defines the rendering quality level used for the target flash element.
    */
  /* CompleteClass */
  override var quality: String = js.native
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  override var selectedElement: js.Any = js.native
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

