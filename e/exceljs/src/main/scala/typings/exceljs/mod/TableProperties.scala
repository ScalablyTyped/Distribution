package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProperties extends js.Object {
  
  /**
  	 * Column definitions
  	 */
  var columns: js.Array[TableColumnProperties] = js.native
  
  /**
  	 * The display name of the table
  	 */
  var displayName: js.UndefOr[String] = js.native
  
  /**
  	 * Show headers at top of table
  	 * @default true
  	 */
  var headerRow: js.UndefOr[Boolean] = js.native
  
  /**
  	 * The name of the table
  	 */
  var name: String = js.native
  
  /**
  	 * Top left cell of the table
  	 */
  var ref: String = js.native
  
  /**
  	 * Rows of data
  	 */
  var rows: js.Array[js.Array[_]] = js.native
  
  /**
  	 * Extra style properties
  	 * @default {}
  	 */
  var style: js.UndefOr[TableStyleProperties] = js.native
  
  /**
  	 * Show totals at bottom of table
  	 * @default false
  	 */
  var totalsRow: js.UndefOr[Boolean] = js.native
}
object TableProperties {
  
  @scala.inline
  def apply(columns: js.Array[TableColumnProperties], name: String, ref: String, rows: js.Array[js.Array[_]]): TableProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProperties]
  }
  
  @scala.inline
  implicit class TablePropertiesOps[Self <: TableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnsVarargs(value: TableColumnProperties*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[TableColumnProperties]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setHeaderRow(value: Boolean): Self = this.set("headerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRow: Self = this.set("headerRow", js.undefined)
    
    @scala.inline
    def setStyle(value: TableStyleProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTotalsRow(value: Boolean): Self = this.set("totalsRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalsRow: Self = this.set("totalsRow", js.undefined)
  }
}
