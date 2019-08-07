package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTTABLE_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertTableCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertTableCommandArguments protected () extends ASPxClientHtmlEditorTablePropertiesCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorInsertTableCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param elementToReplace The element that will be replaced by the inserted table element.
    */
  def this(htmlEditor: ASPxClientHtmlEditor, elementToReplace: js.Any) = this()
  /**
    * Gets or sets the count of columns in the table.
    */
  var columns: Double = js.native
  /**
    * Gets or sets a value indicating whether all table columns should have equal width.
    */
  var isEqualColumnWidth: Boolean = js.native
  /**
    * Gets or sets the count of rows in the table.
    */
  var rows: Double = js.native
}

