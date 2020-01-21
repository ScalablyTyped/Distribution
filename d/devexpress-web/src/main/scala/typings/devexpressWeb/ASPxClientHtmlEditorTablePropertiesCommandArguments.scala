package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTablePropertiesCommandArguments")
@js.native
class ASPxClientHtmlEditorTablePropertiesCommandArguments protected () extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTablePropertiesCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param selectedElement An object containing the currently selected element in the HTML editor.
    */
  def this(htmlEditor: ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Determines the position of the target table element.
    */
  var align: String = js.native
  /**
    * Gets or sets a value that is the table caption.
    */
  var caption: String = js.native
  /**
    * Gets or sets a table cell padding.
    */
  var cellPadding: Double = js.native
  /**
    * Gets or sets the table cell spacing.
    */
  var cellSpacing: Double = js.native
  /**
    * Gets or sets a value indicating whether the first row/column serves as the table's header.
    */
  var headers: String = js.native
  /**
    * Contains the style settings defining the appearance of the target table element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Gets or sets the table's summary.
    */
  var summary: String = js.native
}

