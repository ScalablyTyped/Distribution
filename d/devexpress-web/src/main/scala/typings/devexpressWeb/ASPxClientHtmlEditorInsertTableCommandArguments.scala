package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTTABLE_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertTableCommandArguments
  extends StObject
     with ASPxClientHtmlEditorTablePropertiesCommandArguments {
  
  /**
    * Gets or sets the count of columns in the table.
    */
  var columns: Double
  
  /**
    * Gets or sets a value indicating whether all table columns should have equal width.
    */
  var isEqualColumnWidth: Boolean
  
  /**
    * Gets or sets the count of rows in the table.
    */
  var rows: Double
}
object ASPxClientHtmlEditorInsertTableCommandArguments {
  
  inline def apply(
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
  
  extension [Self <: ASPxClientHtmlEditorInsertTableCommandArguments](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setIsEqualColumnWidth(value: Boolean): Self = StObject.set(x, "isEqualColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
