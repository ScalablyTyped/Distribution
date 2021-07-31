package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableProperties extends StObject {
  
  /**
  	 * Column definitions
  	 */
  var columns: js.Array[TableColumnProperties]
  
  /**
  	 * The display name of the table
  	 */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
  	 * Show headers at top of table
  	 * @default true
  	 */
  var headerRow: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The name of the table
  	 */
  var name: String
  
  /**
  	 * Top left cell of the table
  	 */
  var ref: String
  
  /**
  	 * Rows of data
  	 */
  var rows: js.Array[js.Array[js.Any]]
  
  /**
  	 * Extra style properties
  	 * @default {}
  	 */
  var style: js.UndefOr[TableStyleProperties] = js.undefined
  
  /**
  	 * Show totals at bottom of table
  	 * @default false
  	 */
  var totalsRow: js.UndefOr[Boolean] = js.undefined
}
object TableProperties {
  
  @scala.inline
  def apply(
    columns: js.Array[TableColumnProperties],
    name: String,
    ref: String,
    rows: js.Array[js.Array[js.Any]]
  ): TableProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProperties]
  }
  
  @scala.inline
  implicit class TablePropertiesMutableBuilder[Self <: TableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[TableColumnProperties]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: TableColumnProperties*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setHeaderRow(value: Boolean): Self = StObject.set(x, "headerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowUndefined: Self = StObject.set(x, "headerRow", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: TableStyleProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTotalsRow(value: Boolean): Self = StObject.set(x, "totalsRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsRowUndefined: Self = StObject.set(x, "totalsRow", js.undefined)
  }
}
