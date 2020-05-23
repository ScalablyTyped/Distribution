package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECELLPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTableCellPropertiesCommandArguments")
@js.native
class ASPxClientHtmlEditorTableCellPropertiesCommandArguments protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorTableCellPropertiesCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTableCellPropertiesCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param selectedElement An object containing the currently selected element in the HTML editor.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Gets or sets a value that indicates whether the cell settings should be applied to all cells in the table.
    */
  /* CompleteClass */
  override var applyForAll: Boolean = js.native
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  override var selectedElement: js.Any = js.native
  /**
    * Contains the style settings defining the appearance of the target cell element.
    */
  /* CompleteClass */
  override var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
}

