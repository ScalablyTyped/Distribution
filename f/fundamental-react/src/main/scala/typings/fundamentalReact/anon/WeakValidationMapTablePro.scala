package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Table/Table.TableProps> */
@js.native
trait WeakValidationMapTablePro extends js.Object {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var headers: js.UndefOr[Validator[js.UndefOr[(js.Array[ReactNode | String]) | Null]]] = js.native
  
  var tableBodyClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var tableBodyProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  
  var tableBodyRowProps: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) | Null | StringDictionary[_]
      ]
    ]
  ] = js.native
  
  var tableCellClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var tableData: js.UndefOr[Validator[js.UndefOr[js.Array[RowData] | Null]]] = js.native
  
  var tableHeaderClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var tableHeaderProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  
  var tableHeaderRowClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var tableHeaderRowProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  
  var tableRowClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}
object WeakValidationMapTablePro {
  
  @scala.inline
  def apply(): WeakValidationMapTablePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTablePro]
  }
  
  @scala.inline
  implicit class WeakValidationMapTableProOps[Self <: WeakValidationMapTablePro] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setHeaders(value: Validator[js.UndefOr[(js.Array[ReactNode | String]) | Null]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setTableBodyClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("tableBodyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyClassName: Self = this.set("tableBodyClassName", js.undefined)
    
    @scala.inline
    def setTableBodyProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("tableBodyProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyProps: Self = this.set("tableBodyProps", js.undefined)
    
    @scala.inline
    def setTableBodyRowProps(
      value: Validator[
          js.UndefOr[
            (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) | Null | StringDictionary[_]
          ]
        ]
    ): Self = this.set("tableBodyRowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyRowProps: Self = this.set("tableBodyRowProps", js.undefined)
    
    @scala.inline
    def setTableCellClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("tableCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellClassName: Self = this.set("tableCellClassName", js.undefined)
    
    @scala.inline
    def setTableData(value: Validator[js.UndefOr[js.Array[RowData] | Null]]): Self = this.set("tableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableData: Self = this.set("tableData", js.undefined)
    
    @scala.inline
    def setTableHeaderClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("tableHeaderClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderClassName: Self = this.set("tableHeaderClassName", js.undefined)
    
    @scala.inline
    def setTableHeaderProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("tableHeaderProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderProps: Self = this.set("tableHeaderProps", js.undefined)
    
    @scala.inline
    def setTableHeaderRowClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("tableHeaderRowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderRowClassName: Self = this.set("tableHeaderRowClassName", js.undefined)
    
    @scala.inline
    def setTableHeaderRowProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("tableHeaderRowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderRowProps: Self = this.set("tableHeaderRowProps", js.undefined)
    
    @scala.inline
    def setTableRowClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("tableRowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowClassName: Self = this.set("tableRowClassName", js.undefined)
  }
}
