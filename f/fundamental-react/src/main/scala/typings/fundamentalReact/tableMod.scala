package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.PartialTableProps
import typings.fundamentalReact.anon.RowData
import typings.fundamentalReact.anon.WeakValidationMapTablePro
import typings.fundamentalReact.fundamentalReactStrings.Table
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Table/Table.TableProps> & {  displayName :'Table'} */
  object default {
    
    @scala.inline
    def apply(props: PropsWithChildren[TableProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    @scala.inline
    def apply(props: PropsWithChildren[TableProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/Table/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Table/Table", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Table/Table", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTableProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialTableProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Table/Table", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String | Table] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String | Table]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Table/Table", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTablePro] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapTablePro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait TableProps
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.Array[String | ReactNode]
    
    var tableBodyClassName: js.UndefOr[String] = js.undefined
    
    var tableBodyProps: js.UndefOr[js.Any] = js.undefined
    
    var tableBodyRowProps: js.UndefOr[
        StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
      ] = js.undefined
    
    var tableCellClassName: js.UndefOr[String] = js.undefined
    
    var tableData: js.UndefOr[js.Array[RowData]] = js.undefined
    
    var tableHeaderClassName: js.UndefOr[String] = js.undefined
    
    var tableHeaderProps: js.UndefOr[js.Any] = js.undefined
    
    var tableHeaderRowClassName: js.UndefOr[String] = js.undefined
    
    var tableHeaderRowProps: js.UndefOr[js.Any] = js.undefined
    
    var tableRowClassName: js.UndefOr[String] = js.undefined
  }
  object TableProps {
    
    @scala.inline
    def apply(headers: js.Array[String | ReactNode]): TableProps = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[String | ReactNode]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: (String | ReactNode)*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setTableBodyClassName(value: String): Self = StObject.set(x, "tableBodyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyClassNameUndefined: Self = StObject.set(x, "tableBodyClassName", js.undefined)
      
      @scala.inline
      def setTableBodyProps(value: js.Any): Self = StObject.set(x, "tableBodyProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyPropsUndefined: Self = StObject.set(x, "tableBodyProps", js.undefined)
      
      @scala.inline
      def setTableBodyRowProps(
        value: StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
      ): Self = StObject.set(x, "tableBodyRowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyRowPropsFunction2(value: (/* rowData */ js.Array[String], /* index */ Double) => Unit): Self = StObject.set(x, "tableBodyRowProps", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTableBodyRowPropsUndefined: Self = StObject.set(x, "tableBodyRowProps", js.undefined)
      
      @scala.inline
      def setTableCellClassName(value: String): Self = StObject.set(x, "tableCellClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableCellClassNameUndefined: Self = StObject.set(x, "tableCellClassName", js.undefined)
      
      @scala.inline
      def setTableData(value: js.Array[RowData]): Self = StObject.set(x, "tableData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDataUndefined: Self = StObject.set(x, "tableData", js.undefined)
      
      @scala.inline
      def setTableDataVarargs(value: RowData*): Self = StObject.set(x, "tableData", js.Array(value :_*))
      
      @scala.inline
      def setTableHeaderClassName(value: String): Self = StObject.set(x, "tableHeaderClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderClassNameUndefined: Self = StObject.set(x, "tableHeaderClassName", js.undefined)
      
      @scala.inline
      def setTableHeaderProps(value: js.Any): Self = StObject.set(x, "tableHeaderProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderPropsUndefined: Self = StObject.set(x, "tableHeaderProps", js.undefined)
      
      @scala.inline
      def setTableHeaderRowClassName(value: String): Self = StObject.set(x, "tableHeaderRowClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderRowClassNameUndefined: Self = StObject.set(x, "tableHeaderRowClassName", js.undefined)
      
      @scala.inline
      def setTableHeaderRowProps(value: js.Any): Self = StObject.set(x, "tableHeaderRowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderRowPropsUndefined: Self = StObject.set(x, "tableHeaderRowProps", js.undefined)
      
      @scala.inline
      def setTableRowClassName(value: String): Self = StObject.set(x, "tableRowClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableRowClassNameUndefined: Self = StObject.set(x, "tableRowClassName", js.undefined)
    }
  }
}
