package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Table/Table.TableProps> */
trait WeakValidationMapTablePro extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var headers: js.UndefOr[Validator[js.UndefOr[(js.Array[ReactNode | String]) | Null]]] = js.undefined
  
  var tableBodyClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var tableBodyProps: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var tableBodyRowProps: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) | Null | StringDictionary[Any]
      ]
    ]
  ] = js.undefined
  
  var tableCellClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var tableData: js.UndefOr[Validator[js.UndefOr[js.Array[RowData] | Null]]] = js.undefined
  
  var tableHeaderClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var tableHeaderProps: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var tableHeaderRowClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var tableHeaderRowProps: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var tableRowClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}
object WeakValidationMapTablePro {
  
  inline def apply(): WeakValidationMapTablePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTablePro]
  }
  
  extension [Self <: WeakValidationMapTablePro](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    inline def setHeaders(value: Validator[js.UndefOr[(js.Array[ReactNode | String]) | Null]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setTableBodyClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "tableBodyClassName", value.asInstanceOf[js.Any])
    
    inline def setTableBodyClassNameUndefined: Self = StObject.set(x, "tableBodyClassName", js.undefined)
    
    inline def setTableBodyProps(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "tableBodyProps", value.asInstanceOf[js.Any])
    
    inline def setTableBodyPropsUndefined: Self = StObject.set(x, "tableBodyProps", js.undefined)
    
    inline def setTableBodyRowProps(
      value: Validator[
          js.UndefOr[
            (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit]) | Null | StringDictionary[Any]
          ]
        ]
    ): Self = StObject.set(x, "tableBodyRowProps", value.asInstanceOf[js.Any])
    
    inline def setTableBodyRowPropsUndefined: Self = StObject.set(x, "tableBodyRowProps", js.undefined)
    
    inline def setTableCellClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "tableCellClassName", value.asInstanceOf[js.Any])
    
    inline def setTableCellClassNameUndefined: Self = StObject.set(x, "tableCellClassName", js.undefined)
    
    inline def setTableData(value: Validator[js.UndefOr[js.Array[RowData] | Null]]): Self = StObject.set(x, "tableData", value.asInstanceOf[js.Any])
    
    inline def setTableDataUndefined: Self = StObject.set(x, "tableData", js.undefined)
    
    inline def setTableHeaderClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "tableHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderClassNameUndefined: Self = StObject.set(x, "tableHeaderClassName", js.undefined)
    
    inline def setTableHeaderProps(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "tableHeaderProps", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderPropsUndefined: Self = StObject.set(x, "tableHeaderProps", js.undefined)
    
    inline def setTableHeaderRowClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "tableHeaderRowClassName", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderRowClassNameUndefined: Self = StObject.set(x, "tableHeaderRowClassName", js.undefined)
    
    inline def setTableHeaderRowProps(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "tableHeaderRowProps", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderRowPropsUndefined: Self = StObject.set(x, "tableHeaderRowProps", js.undefined)
    
    inline def setTableRowClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "tableRowClassName", value.asInstanceOf[js.Any])
    
    inline def setTableRowClassNameUndefined: Self = StObject.set(x, "tableRowClassName", js.undefined)
  }
}
