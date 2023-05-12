package typings.fixedDataTable

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.LegacyRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fixed-data-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fixed-data-table", "Cell")
  @js.native
  open class Cell protected ()
    extends Component[CellProps, js.Object, Any] {
    def this(props: CellProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CellProps, context: Any) = this()
  }
  
  @JSImport("fixed-data-table", "Column")
  @js.native
  open class Column protected ()
    extends Component[ColumnProps, js.Object, Any] {
    def this(props: ColumnProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnProps, context: Any) = this()
  }
  
  @JSImport("fixed-data-table", "ColumnGroup")
  @js.native
  open class ColumnGroup protected ()
    extends Component[ColumnGroupProps, js.Object, Any] {
    def this(props: ColumnGroupProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnGroupProps, context: Any) = this()
  }
  
  @JSImport("fixed-data-table", "Table")
  @js.native
  open class Table protected ()
    extends Component[TableProps, js.Object, Any] {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: Any) = this()
  }
  
  @JSImport("fixed-data-table", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  trait CellProps
    extends StObject
       with HTMLAttributes[Cell] {
    
    /**
      * Optional prop that if specified on the Column will be
      * passed to the cell. It can be used to uniquely identify
      * which column is the cell is in.
      */
    var columnKey: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Outer height of the cell.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The row index of the cell.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Outer width of the cell.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CellProps {
    
    inline def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      inline def setColumnKey(value: String | Double): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColumnGroupProps extends StObject {
    
    /**
      * The horizontal alignment of the table cell content.
      * 'left', 'center', 'right'
      */
    var align: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Controls if the column group is fixed when scrolling in the X
      * axis.
      *
      * defaultValue: false
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The header cell for this column group. This can either be
      * a string. a React element, or a function that generates a
      * React Element. Passing in a string will render a default
      * header cell with that string. By default, the React
      * element passed in can expect to receive the following
      * props:
      *
      * props: {
      *   height: number // (supplied from the groupHeaderHeight)
      *   width: number // (supplied from the Column)
      * }
      *
      * Because you are passing in your own React element, you
      * can feel free to pass in whatever props you may want or
      * need.
      *
      * If you pass in a function, you will receive the same props
      * object as the first argument.
      */
    var header: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])
    
    var ref: js.UndefOr[LegacyRef[ColumnGroup]] = js.undefined
  }
  object ColumnGroupProps {
    
    inline def apply(header: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): ColumnGroupProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnGroupProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setHeader(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction1(value: /* props */ CellProps => String | ReactElement): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setRef(value: LegacyRef[ColumnGroup]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ColumnGroup | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /**
    * Component that defines the attributes of table column.
    */
  trait ColumnProps extends StObject {
    
    /**
      * The horizontal alignment of the table cell content.
      *
      * 'left'|'center'|'right'
      */
    var align: js.UndefOr[String] = js.undefined
    
    /**
      * Whether cells in this column can be removed from document
      * when outside of viewport as a result of horizontal
      * scrolling. Setting this property to true allows the table
      * to not render cells in particular column that are outside
      * of viewport for visible rows. This allows to create table
      * with many columns and not have vertical scrolling
      * performance drop. Setting the property to false will keep
      * previous behaviour and keep cell rendered if the row it
      * belongs to is visible.
      *
      * defaultValue: false
      */
    var allowCellsRecycling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is the body cell that will be cloned for this
      * column. This can either be a string a React element,
      * or a function that generates a React Element. Passing
      * in a string will render a default cell with that
      * string. By default, the React element passed in can
      * expect to receive the following props:
      *
      * props: {
      *   rowIndex; number // (the row index of the cell)
      *   columnKey: string // (of the column, if given)
      *   height: number // (supplied from the Table or rowHeightGetter)
      *   width: number // (supplied from the Column)
      * }
      *
      * Because you are passing in your own React element, you
      * can feel free to pass in whatever props you may want or
      * need.
      *
      * If you pass in a function, you will receive the same
      * props object as the first argument.
      */
    var cell: js.UndefOr[
        String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])
      ] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * This is used to uniquely identify the column, and is not
      * required unless you a resizing columns. This will be the
      * key given in the onColumnResizeEndCallback on the Table.
      */
    var columnKey: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Controls if the column is fixed when scrolling in the X
      * axis.
      *
      * defaultValue: false
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The grow factor relative to other columns. Same as the
      * flex-grow API from http://www.w3.org/TR/css3-flexbox/.
      * Basically, take any available extra width and distribute
      * it proportionally according to all columns' flexGrow
      * values. Defaults to zero (no-flexing).
      */
    var flexGrow: js.UndefOr[Double] = js.undefined
    
    /**
      * The footer cell for this column. This can either be a
      * string. a React element, or a function that generates a
      * React Element. Passing in a string will render a default
      * header cell with that string. By default, the React
      * element passed in can expect to receive the following
      * props:
      *
      * props: {
      *   columnKey: string // (of the column, if given)
      *   height: number // (supplied from the Table or rowHeightGetter)
      *   width: number // (supplied from the Column)
      * }
      *
      * Because you are passing in your own React element, you
      * can feel free to pass in whatever props you may want or
      * need.
      *
      * If you pass in a function, you will receive the same
      * props object as the first argument.
      */
    var footer: js.UndefOr[
        String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])
      ] = js.undefined
    
    /**
      * The header cell for this column. This can either be a
      * string. a React element, or a function that generates a
      * React Element. Passing in a string will render a default
      * header cell with that string. By default, the React
      * element passed in can expect to receive the following
      * props:
      *
      * props: {
      *   columnKey: string // (of the column, if given)
      *   height: number // (supplied from the Table or rowHeightGetter)
      *   width: number // (supplied from the Column)
      * }
      *
      * Because you are passing in your own React element, you
      * can feel free to pass in whatever props you may want or need.
      *
      * If you pass in a function, you will receive the same props object as the first argument.
      */
    var header: js.UndefOr[
        String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])
      ] = js.undefined
    
    /**
      * Whether the column can be resized with the
      * FixedDataTableColumnResizeHandle. Please note that if a
      * column has a flex grow, once you resize the column this
      * will be set to 0.
      *
      * This property only provides the UI for the column
      * resizing. If this is set to true, you will need to set the
      * onColumnResizeEndCallback table property and render your
      * columns appropriately.
      */
    var isResizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If this is a resizable column this is its maximum pixel
      * width.
      */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * If this is a resizable column this is its minimum pixel
      * width.
      */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Column]] = js.undefined
    
    /**
      * The pixel width of the column.
      */
    var width: Double
  }
  object ColumnProps {
    
    inline def apply(width: Double): ColumnProps = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllowCellsRecycling(value: Boolean): Self = StObject.set(x, "allowCellsRecycling", value.asInstanceOf[js.Any])
      
      inline def setAllowCellsRecyclingUndefined: Self = StObject.set(x, "allowCellsRecycling", js.undefined)
      
      inline def setCell(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellFunction1(value: /* props */ CellProps => String | ReactElement): Self = StObject.set(x, "cell", js.Any.fromFunction1(value))
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColumnKey(value: String | Double): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFooter(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: /* props */ CellProps => String | ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction1(value: /* props */ CellProps => String | ReactElement): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
      
      inline def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setRef(value: LegacyRef[Column]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Column | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Pixel height of the footer.
      *
      * defaultValue: 0
      */
    var footerHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel height of the column group header.
      *
      * defaultValue: 0
      */
    var groupHeaderHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel height of the header.
      *
      * defaultValue: 0
      */
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel height of table. If all rows do not fit, a
      * vertical scrollbar will appear.
      *
      * Either height or maxHeight must be specified.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether a column is currently being resized.
      */
    var isColumnResizing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum pixel height of table. If all rows do not fit,
      * a vertical scrollbar will appear.
      *
      * Either height or maxHeight must be specified.
      */
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback that is called when resizer has been released
      * and column needs to be updated.
      *
      * Required if the isResizable property is true on any
      * column.
      */
    var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.undefined
    
    /**
      * Callback that is called when rowHeightGetter returns a
      * different height for a row than the rowHeight prop. This
      *  is necessary because initially table estimates heights
      * of some parts of the content.
      */
    var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.undefined
    
    /**
      * Callback that is called when a row is clicked.
      */
    var onRowClick: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
      ] = js.undefined
    
    /**
      * Callback that is called when a row is double clicked.
      */
    var onRowDoubleClick: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
      ] = js.undefined
    
    /**
      * Callback that is called when a mouse-down event happens
      * on a row.
      */
    var onRowMouseDown: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
      ] = js.undefined
    
    /**
      * Callback that is called when a mouse-enter event happens
      * on a row.
      */
    var onRowMouseEnter: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
      ] = js.undefined
    
    /**
      * Callback that is called when a mouse-leave event happens
      * on a row.
      */
    var onRowMouseLeave: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
      ] = js.undefined
    
    /**
      * Callback that is called when scrolling ends or stops with
      * new horizontal and vertical scroll values.
      */
    var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
    
    /**
      * Callback that is called when scrolling starts with
      * current horizontal and vertical scroll values.
      */
    var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
    
    /**
      * 'hidden'|'auto'
      */
    var overflowX: js.UndefOr[String] = js.undefined
    
    /**
      * 'hidden'|'auto'
      */
    var overflowY: js.UndefOr[String] = js.undefined
    
    /**
      * Pixel height of table's owner, this is used in a managed
      * scrolling situation when you want to slide the table up
      * from below the fold without having to constantly update
      * the height on every scroll tick. Instead, vary this
      * property on scroll. By using ownerHeight, we over-render
      * the table while making sure the footer and horizontal
      * scrollbar of the table are visible when the current space
      * for the table in view is smaller than the final,
      * over-flowing height of table. It allows us to avoid
      * resizing and reflowing table when it is moving in the
      * view.
      *
      * This is used if ownerHeight < height (or maxHeight).
      */
    var ownerHeight: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Table]] = js.undefined
    
    /**
      * To get any additional CSS classes that should be added to
      *  a row, rowClassNameGetter(index) is called.
      */
    var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
    
    /**
      * Pixel height of rows unless rowHeightGetter is specified
      * and returns different value.
      */
    var rowHeight: Double
    
    /**
      * If specified, rowHeightGetter(index) is called for each
      * row and the returned value overrides rowHeight for
      * particular row.
      */
    var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    /**
      * Number of rows in the table.
      */
    var rowsCount: Double
    
    /**
      * Value of horizontal scroll.
      *
      * defaultValue: 0
      */
    var scrollLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Index of column to scroll to.
      */
    var scrollToColumn: js.UndefOr[Double] = js.undefined
    
    /**
      * Index of row to scroll to.
      */
    var scrollToRow: js.UndefOr[Double] = js.undefined
    
    /**
      * Value of vertical scroll.
      *
      * defaultValue: 0
      */
    var scrollTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel width of table. If all columns do not fit, a
      * horizontal scrollbar will appear.
      */
    var width: Double
  }
  object TableProps {
    
    inline def apply(rowHeight: Double, rowsCount: Double, width: Double): TableProps = {
      val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFooterHeight(value: Double): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      inline def setFooterHeightUndefined: Self = StObject.set(x, "footerHeight", js.undefined)
      
      inline def setGroupHeaderHeight(value: Double): Self = StObject.set(x, "groupHeaderHeight", value.asInstanceOf[js.Any])
      
      inline def setGroupHeaderHeightUndefined: Self = StObject.set(x, "groupHeaderHeight", js.undefined)
      
      inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsColumnResizing(value: Boolean): Self = StObject.set(x, "isColumnResizing", value.asInstanceOf[js.Any])
      
      inline def setIsColumnResizingUndefined: Self = StObject.set(x, "isColumnResizing", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setOnColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit): Self = StObject.set(x, "onColumnResizeEndCallback", js.Any.fromFunction2(value))
      
      inline def setOnColumnResizeEndCallbackUndefined: Self = StObject.set(x, "onColumnResizeEndCallback", js.undefined)
      
      inline def setOnContentHeightChange(value: /* newHeight */ Double => Unit): Self = StObject.set(x, "onContentHeightChange", js.Any.fromFunction1(value))
      
      inline def setOnContentHeightChangeUndefined: Self = StObject.set(x, "onContentHeightChange", js.undefined)
      
      inline def setOnRowClick(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnRowDoubleClick(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction2(value))
      
      inline def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
      
      inline def setOnRowMouseDown(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseDown", js.Any.fromFunction2(value))
      
      inline def setOnRowMouseDownUndefined: Self = StObject.set(x, "onRowMouseDown", js.undefined)
      
      inline def setOnRowMouseEnter(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnRowMouseEnterUndefined: Self = StObject.set(x, "onRowMouseEnter", js.undefined)
      
      inline def setOnRowMouseLeave(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnRowMouseLeaveUndefined: Self = StObject.set(x, "onRowMouseLeave", js.undefined)
      
      inline def setOnScrollEnd(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onScrollEnd", js.Any.fromFunction2(value))
      
      inline def setOnScrollEndUndefined: Self = StObject.set(x, "onScrollEnd", js.undefined)
      
      inline def setOnScrollStart(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onScrollStart", js.Any.fromFunction2(value))
      
      inline def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
      
      inline def setOverflowX(value: String): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOwnerHeight(value: Double): Self = StObject.set(x, "ownerHeight", value.asInstanceOf[js.Any])
      
      inline def setOwnerHeightUndefined: Self = StObject.set(x, "ownerHeight", js.undefined)
      
      inline def setRef(value: LegacyRef[Table]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Table | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRowClassNameGetter(value: /* index */ Double => String): Self = StObject.set(x, "rowClassNameGetter", js.Any.fromFunction1(value))
      
      inline def setRowClassNameGetterUndefined: Self = StObject.set(x, "rowClassNameGetter", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightGetter(value: /* index */ Double => Double): Self = StObject.set(x, "rowHeightGetter", js.Any.fromFunction1(value))
      
      inline def setRowHeightGetterUndefined: Self = StObject.set(x, "rowHeightGetter", js.undefined)
      
      inline def setRowsCount(value: Double): Self = StObject.set(x, "rowsCount", value.asInstanceOf[js.Any])
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      inline def setScrollToColumn(value: Double): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
      
      inline def setScrollToColumnUndefined: Self = StObject.set(x, "scrollToColumn", js.undefined)
      
      inline def setScrollToRow(value: Double): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
      
      inline def setScrollToRowUndefined: Self = StObject.set(x, "scrollToRow", js.undefined)
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
