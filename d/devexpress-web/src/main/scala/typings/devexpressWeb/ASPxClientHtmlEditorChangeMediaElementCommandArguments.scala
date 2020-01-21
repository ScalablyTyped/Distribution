package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters related to inserting or changing media elements in the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorChangeMediaElementCommandArguments")
@js.native
class ASPxClientHtmlEditorChangeMediaElementCommandArguments protected () extends ASPxClientHtmlEditorCommandArguments {
  protected def this(htmlEditor: ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Determines the position of the target media element.
    */
  var align: String = js.native
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML &quot;id&quot;</a> attribute of the target media element.
    */
  var id: String = js.native
  /**
    * Defines the source of the target media element.
    */
  var src: String = js.native
  /**
    * Contains the style settings defining the appearance of the target media element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Returns the name of the client-side command corresponding to the parameter.
    */
  def GetCommandName(): String = js.native
}

