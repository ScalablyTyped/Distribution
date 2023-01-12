package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Table/Table.TableProps> */
trait PartialTableProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Array[String | ReactNode]] = js.undefined
  
  var tableBodyClassName: js.UndefOr[String] = js.undefined
  
  var tableBodyProps: js.UndefOr[Any] = js.undefined
  
  var tableBodyRowProps: js.UndefOr[
    StringDictionary[Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
  ] = js.undefined
  
  var tableCellClassName: js.UndefOr[String] = js.undefined
  
  var tableData: js.UndefOr[js.Array[RowData]] = js.undefined
  
  var tableHeaderClassName: js.UndefOr[String] = js.undefined
  
  var tableHeaderProps: js.UndefOr[Any] = js.undefined
  
  var tableHeaderRowClassName: js.UndefOr[String] = js.undefined
  
  var tableHeaderRowProps: js.UndefOr[Any] = js.undefined
  
  var tableRowClassName: js.UndefOr[String] = js.undefined
}
object PartialTableProps {
  
  inline def apply(): PartialTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTableProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    inline def setHeaders(value: js.Array[String | ReactNode]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (String | ReactNode)*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setTableBodyClassName(value: String): Self = StObject.set(x, "tableBodyClassName", value.asInstanceOf[js.Any])
    
    inline def setTableBodyClassNameUndefined: Self = StObject.set(x, "tableBodyClassName", js.undefined)
    
    inline def setTableBodyProps(value: Any): Self = StObject.set(x, "tableBodyProps", value.asInstanceOf[js.Any])
    
    inline def setTableBodyPropsUndefined: Self = StObject.set(x, "tableBodyProps", js.undefined)
    
    inline def setTableBodyRowProps(
      value: StringDictionary[Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
    ): Self = StObject.set(x, "tableBodyRowProps", value.asInstanceOf[js.Any])
    
    inline def setTableBodyRowPropsFunction2(value: (/* rowData */ js.Array[String], /* index */ Double) => Unit): Self = StObject.set(x, "tableBodyRowProps", js.Any.fromFunction2(value))
    
    inline def setTableBodyRowPropsUndefined: Self = StObject.set(x, "tableBodyRowProps", js.undefined)
    
    inline def setTableCellClassName(value: String): Self = StObject.set(x, "tableCellClassName", value.asInstanceOf[js.Any])
    
    inline def setTableCellClassNameUndefined: Self = StObject.set(x, "tableCellClassName", js.undefined)
    
    inline def setTableData(value: js.Array[RowData]): Self = StObject.set(x, "tableData", value.asInstanceOf[js.Any])
    
    inline def setTableDataUndefined: Self = StObject.set(x, "tableData", js.undefined)
    
    inline def setTableDataVarargs(value: RowData*): Self = StObject.set(x, "tableData", js.Array(value*))
    
    inline def setTableHeaderClassName(value: String): Self = StObject.set(x, "tableHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderClassNameUndefined: Self = StObject.set(x, "tableHeaderClassName", js.undefined)
    
    inline def setTableHeaderProps(value: Any): Self = StObject.set(x, "tableHeaderProps", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderPropsUndefined: Self = StObject.set(x, "tableHeaderProps", js.undefined)
    
    inline def setTableHeaderRowClassName(value: String): Self = StObject.set(x, "tableHeaderRowClassName", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderRowClassNameUndefined: Self = StObject.set(x, "tableHeaderRowClassName", js.undefined)
    
    inline def setTableHeaderRowProps(value: Any): Self = StObject.set(x, "tableHeaderRowProps", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderRowPropsUndefined: Self = StObject.set(x, "tableHeaderRowProps", js.undefined)
    
    inline def setTableRowClassName(value: String): Self = StObject.set(x, "tableRowClassName", value.asInstanceOf[js.Any])
    
    inline def setTableRowClassNameUndefined: Self = StObject.set(x, "tableRowClassName", js.undefined)
  }
}
