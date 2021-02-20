package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTTABLE_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorInsertTableCommandArguments extends ASPxClientHtmlEditorTablePropertiesCommandArguments {
  
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
object ASPxClientHtmlEditorInsertTableCommandArguments {
  
  @scala.inline
  def apply(
    align: String,
    caption: String,
    cellPadding: Double,
    cellSpacing: Double,
    columns: Double,
    headers: String,
    isEqualColumnWidth: Boolean,
    rows: Double,
    selectedElement: js.Any,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    summary: String
  ): ASPxClientHtmlEditorInsertTableCommandArguments = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], cellPadding = cellPadding.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isEqualColumnWidth = isEqualColumnWidth.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertTableCommandArguments]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorInsertTableCommandArgumentsMutableBuilder[Self <: ASPxClientHtmlEditorInsertTableCommandArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqualColumnWidth(value: Boolean): Self = StObject.set(x, "isEqualColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
