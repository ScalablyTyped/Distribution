package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.PartialTableProps
import typings.fundamentalReact.anon.RowData
import typings.fundamentalReact.anon.WeakValidationMapTablePro
import typings.fundamentalReact.fundamentalReactStrings.Table
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTableTableMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Table/Table.TableProps> & {  displayName :'Table'} */
  object default {
    
    inline def apply(props: TableProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: TableProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/Table/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Table/Table", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Table/Table", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTableProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTableProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Table/Table", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String | Table] = js.native
    inline def displayName_=(x: js.UndefOr[String | Table]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Table/Table", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTablePro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTablePro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait TableProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.Array[String | ReactNode]
    
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
  object TableProps {
    
    inline def apply(headers: js.Array[String | ReactNode]): TableProps = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setHeaders(value: js.Array[String | ReactNode]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
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
}
