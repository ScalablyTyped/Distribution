package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTTABLE_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertTableCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertTableCommandArguments protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorInsertTableCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorInsertTableCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param elementToReplace The element that will be replaced by the inserted table element.
    */
  def this(htmlEditor: typings.devexpressWeb.ASPxClientHtmlEditor, elementToReplace: js.Any) = this()
  /**
    * Determines the position of the target table element.
    */
  /* CompleteClass */
  override var align: String = js.native
  /**
    * Gets or sets a value that is the table caption.
    */
  /* CompleteClass */
  override var caption: String = js.native
  /**
    * Gets or sets a table cell padding.
    */
  /* CompleteClass */
  override var cellPadding: Double = js.native
  /**
    * Gets or sets the table cell spacing.
    */
  /* CompleteClass */
  override var cellSpacing: Double = js.native
  /**
    * Gets or sets the count of columns in the table.
    */
  /* CompleteClass */
  override var columns: Double = js.native
  /**
    * Gets or sets a value indicating whether the first row/column serves as the table's header.
    */
  /* CompleteClass */
  override var headers: String = js.native
  /**
    * Gets or sets a value indicating whether all table columns should have equal width.
    */
  /* CompleteClass */
  override var isEqualColumnWidth: Boolean = js.native
  /**
    * Gets or sets the count of rows in the table.
    */
  /* CompleteClass */
  override var rows: Double = js.native
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  override var selectedElement: js.Any = js.native
  /**
    * Contains the style settings defining the appearance of the target table element.
    */
  /* CompleteClass */
  override var styleSettings: typings.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Gets or sets the table's summary.
    */
  /* CompleteClass */
  override var summary: String = js.native
}

