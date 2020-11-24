package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Table/Table.TableProps> */
@js.native
trait PartialTableProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[js.Array[String | ReactNode]] = js.native
  
  var tableBodyClassName: js.UndefOr[String] = js.native
  
  var tableBodyProps: js.UndefOr[js.Any] = js.native
  
  var tableBodyRowProps: js.UndefOr[
    StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
  ] = js.native
  
  var tableCellClassName: js.UndefOr[String] = js.native
  
  var tableData: js.UndefOr[js.Array[RowData]] = js.native
  
  var tableHeaderClassName: js.UndefOr[String] = js.native
  
  var tableHeaderProps: js.UndefOr[js.Any] = js.native
  
  var tableHeaderRowClassName: js.UndefOr[String] = js.native
  
  var tableHeaderRowProps: js.UndefOr[js.Any] = js.native
  
  var tableRowClassName: js.UndefOr[String] = js.native
}
object PartialTableProps {
  
  @scala.inline
  def apply(): PartialTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableProps]
  }
  
  @scala.inline
  implicit class PartialTablePropsOps[Self <: PartialTableProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: (String | ReactNode)*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String | ReactNode]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setTableBodyClassName(value: String): Self = this.set("tableBodyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyClassName: Self = this.set("tableBodyClassName", js.undefined)
    
    @scala.inline
    def setTableBodyProps(value: js.Any): Self = this.set("tableBodyProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyProps: Self = this.set("tableBodyProps", js.undefined)
    
    @scala.inline
    def setTableBodyRowPropsFunction2(value: (/* rowData */ js.Array[String], /* index */ Double) => Unit): Self = this.set("tableBodyRowProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTableBodyRowProps(
      value: StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
    ): Self = this.set("tableBodyRowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyRowProps: Self = this.set("tableBodyRowProps", js.undefined)
    
    @scala.inline
    def setTableCellClassName(value: String): Self = this.set("tableCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellClassName: Self = this.set("tableCellClassName", js.undefined)
    
    @scala.inline
    def setTableDataVarargs(value: RowData*): Self = this.set("tableData", js.Array(value :_*))
    
    @scala.inline
    def setTableData(value: js.Array[RowData]): Self = this.set("tableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableData: Self = this.set("tableData", js.undefined)
    
    @scala.inline
    def setTableHeaderClassName(value: String): Self = this.set("tableHeaderClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderClassName: Self = this.set("tableHeaderClassName", js.undefined)
    
    @scala.inline
    def setTableHeaderProps(value: js.Any): Self = this.set("tableHeaderProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderProps: Self = this.set("tableHeaderProps", js.undefined)
    
    @scala.inline
    def setTableHeaderRowClassName(value: String): Self = this.set("tableHeaderRowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderRowClassName: Self = this.set("tableHeaderRowClassName", js.undefined)
    
    @scala.inline
    def setTableHeaderRowProps(value: js.Any): Self = this.set("tableHeaderRowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderRowProps: Self = this.set("tableHeaderRowProps", js.undefined)
    
    @scala.inline
    def setTableRowClassName(value: String): Self = this.set("tableRowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowClassName: Self = this.set("tableRowClassName", js.undefined)
  }
}
