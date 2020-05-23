package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters related to inserting or changing media elements in the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorChangeMediaElementCommandArguments")
@js.native
class ASPxClientHtmlEditorChangeMediaElementCommandArguments protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  protected def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Determines the position of the target media element.
    */
  /* CompleteClass */
  override var align: String = js.native
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

