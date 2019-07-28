package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters related to inserting or changing media elements in the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorChangeMediaElementCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target media element.
    * Value: A string value indicating the position of the target media element.
    */
  var align: String
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML "id"</a> attribute of the target media element.
    * Value: A string value which is a unique identifier for the element.
    */
  var id: String
  /**
    * Defines the source of the target media element.
    * Value: A string defining the source of the target media element.
    */
  var src: String
  /**
    * Contains the style settings defining the appearance of the target media element.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings defining the appearance of the target media element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Returns the name of the client-side command corresponding to the parameter.
    */
  def GetCommandName(): String
}

object ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    id: String,
    selectedElement: js.Object,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorChangeMediaElementCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align, id = id, selectedElement = selectedElement, src = src, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorChangeMediaElementCommandArguments]
  }
}

