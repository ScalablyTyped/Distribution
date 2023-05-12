package typings.fixedDataTable2

import typings.fixedDataTable2.fixedDataTable2Strings.auto
import typings.fixedDataTable2.fixedDataTable2Strings.center
import typings.fixedDataTable2.fixedDataTable2Strings.hidden
import typings.fixedDataTable2.fixedDataTable2Strings.left
import typings.fixedDataTable2.fixedDataTable2Strings.right
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fixed-data-table-2", "Cell")
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
  
  @JSImport("fixed-data-table-2", "Column")
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
  
  @JSImport("fixed-data-table-2", "ColumnGroup")
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
  
  @JSImport("fixed-data-table-2", "Table")
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
  
  trait CellProps
    extends StObject
       with HTMLAttributes[Cell] {
    
    /**
      * Optional prop that if specified on the `Column` will be passed to the
      * cell. It can be used to uniquely identify which column is the cell is in.
      */
    var columnKey: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Outer height of the cell.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional prop that represents the rows index in the table.
      * For the 'cell' prop of a Column, this parameter will exist for any
      * cell in a row with a positive index.
      *
      * Below that entry point the user is welcome to consume or
      * pass the prop through at their discretion.
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
  
  trait ColumnCellProps
    extends StObject
       with ColumnHeaderProps {
    
    /** the row index of the cell */
    var rowIndex: Double
  }
  object ColumnCellProps {
    
    inline def apply(height: Double, rowIndex: Double, width: Double): ColumnCellProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnCellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnCellProps] (val x: Self) extends AnyVal {
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnGroupHeaderProps extends StObject {
    
    /* supplied from the groupHeaderHeight */
    var height: Double
    
    /* supplied from the Column */
    var width: Double
  }
  object ColumnGroupHeaderProps {
    
    inline def apply(height: Double, width: Double): ColumnGroupHeaderProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnGroupHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnGroupProps
    extends StObject
       with ClassAttributes[ColumnGroup] {
    
    /**
      * The horizontal alignment of the table cell content.
      */
    var align: js.UndefOr[left | center | right] = js.undefined
    
    /**
      * Extra class for cells in column
      */
    var cellClassName: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Controls if the column group is fixed when scrolling in the X axis.
      *
      * defaultValue: false
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is the header cell for this column group.
      * This can either be a string or a React element. Passing in a string
      * will render a default footer cell with that string. By default, the React
      * element passed in can expect to receive the following props:
      *
      * ```
      * props: {
      *   height: number // (supplied from the groupHeaderHeight)
      *   width: number // (supplied from the Column)
      * }
      * ```
      *
      * Because you are passing in your own React element, you can feel free to
      * pass in whatever props you may want or need.
      *
      * You can also pass in a function that returns a react elemnt, with the
      * props object above passed in as the first parameter.
      */
    var header: js.UndefOr[
        String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement])
      ] = js.undefined
  }
  object ColumnGroupProps {
    
    inline def apply(): ColumnGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnGroupProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCellClassName(value: String): Self = StObject.set(x, "cellClassName", value.asInstanceOf[js.Any])
      
      inline def setCellClassNameUndefined: Self = StObject.set(x, "cellClassName", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setHeader(
        value: String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement])
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction1(value: /* props */ ColumnGroupHeaderProps => String | ReactElement): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  trait ColumnHeaderProps extends StObject {
    
    var columnKey: js.UndefOr[String] = js.undefined
    
    /** supplied from the Table or rowHeightGetter */
    var height: Double
    
    /** supplied from the Column */
    var width: Double
  }
  object ColumnHeaderProps {
    
    inline def apply(height: Double, width: Double): ColumnHeaderProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnProps
    extends StObject
       with ClassAttributes[Column] {
    
    /**
      * The horizontal alignment of the table cell content.
      */
    var align: js.UndefOr[left | center | right] = js.undefined
    
    /**
      * Whether cells in this column can be removed from document when outside
      * of viewport as a result of horizontal scrolling.
      * Setting this property to true allows the table to not render cells in
      * particular column that are outside of viewport for visible rows. This
      * allows to create table with many columns and not have vertical scrolling
      * performance drop.
      * Setting the property to false will keep previous behaviour and keep
      * cell rendered if the row it belongs to is visible.
      *
      * defaultValue: false
      */
    var allowCellsRecycling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is the body cell that will be cloned for this column.
      * This can either be a string a React element, or a function that generates
      * a React Element. Passing in a string will render a default header cell
      * with that string. By default, the React element passed in can expect to
      * receive the following props:
      *
      * ```
      * props: {
      *   rowIndex; number // (the row index of the cell)
      *   columnKey: string // (of the column, if given)
      *   height: number // (supplied from the Table or rowHeightGetter)
      *   width: number // (supplied from the Column)
      * }
      * ```
      *
      * Because you are passing in your own React element, you can feel free to
      * pass in whatever props you may want or need.
      *
      * If you pass in a function, you will receive the same props object as the
      * first argument.
      */
    var cell: js.UndefOr[ElementOrFunc[ColumnCellProps]] = js.undefined
    
    /**
      * Extra class for cells in column
      */
    var cellClassName: js.UndefOr[String] = js.undefined
    
    /**
      * This is used to uniquely identify the column, and is not required unless
      * you a resizing columns. This will be the key given in the
      * `onColumnResizeEndCallback` on the Table.
      */
    var columnKey: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Controls if the column is fixed when scrolling in the X axis.
      *
      * defaultValue: false
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if the column is fixed to the right side of the table
      * when scrolling in the X axis.
      *
      * defaultValue: false
      */
    var fixedRight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The grow factor relative to other columns. Same as the flex-grow API
      * from http://www.w3.org/TR/css3-flexbox/. Basically, take any available
      * extra width and distribute it proportionally according to all columns'
      * flexGrow values. Defaults to zero (no-flexing).
      */
    var flexGrow: js.UndefOr[Double] = js.undefined
    
    /**
      * This is the footer cell for this column.
      * This can either be a string a React element, or a function that generates
      * a React Element. Passing in a string will render a default header cell
      * with that string. By default, the React element passed in can expect to
      * receive the following props:
      *
      * ```
      * props: {
      *   columnKey: string // (of the column, if given)
      *   height: number // (supplied from the Table or rowHeightGetter)
      *   width: number // (supplied from the Column)
      * }
      * ```
      *
      * Because you are passing in your own React element, you can feel free to
      * pass in whatever props you may want or need.
      *
      * If you pass in a function, you will receive the same props object as the
      * first argument.
      */
    var footer: js.UndefOr[ElementOrFunc[ColumnHeaderProps]] = js.undefined
    
    /**
      * The header cell for this column.
      * This can either be a string a React element, or a function that generates
      * a React Element. Passing in a string will render a default header cell
      * with that string. By default, the React element passed in can expect to
      * receive the following props:
      *
      * ```
      * props: {
      *   columnKey: string // (of the column, if given)
      *   height: number // (supplied from the Table or rowHeightGetter)
      *   width: number // (supplied from the Column)
      * }
      * ```
      *
      * Because you are passing in your own React element, you can feel free to
      * pass in whatever props you may want or need.
      *
      * If you pass in a function, you will receive the same props object as the
      * first argument.
      */
    var header: js.UndefOr[ElementOrFunc[ColumnHeaderProps]] = js.undefined
    
    /**
      * Whether the column can be dragged to reorder.
      */
    var isReorderable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the column can be resized with the
      * FixedDataTableColumnResizeHandle. Please note that if a column
      * has a flex grow, once you resize the column this will be set to 0.
      *
      * This property only provides the UI for the column resizing. If this
      * is set to true, you will need to set the onColumnResizeEndCallback table
      * property and render your columns appropriately.
      */
    var isResizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If this is a resizable column this is its maximum pixel width.
      */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * If this is a resizable column this is its minimum pixel width.
      */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Flag to enable performance check when rendering. Stops the component from
      * rendering if none of it's passed in props have changed
      */
    var pureRendering: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllowCellsRecycling(value: Boolean): Self = StObject.set(x, "allowCellsRecycling", value.asInstanceOf[js.Any])
      
      inline def setAllowCellsRecyclingUndefined: Self = StObject.set(x, "allowCellsRecycling", js.undefined)
      
      inline def setCell(value: ElementOrFunc[ColumnCellProps]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellClassName(value: String): Self = StObject.set(x, "cellClassName", value.asInstanceOf[js.Any])
      
      inline def setCellClassNameUndefined: Self = StObject.set(x, "cellClassName", js.undefined)
      
      inline def setCellFunction1(value: ColumnCellProps => String | ReactElement): Self = StObject.set(x, "cell", js.Any.fromFunction1(value))
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnKey(value: String | Double): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedRight(value: Boolean): Self = StObject.set(x, "fixedRight", value.asInstanceOf[js.Any])
      
      inline def setFixedRightUndefined: Self = StObject.set(x, "fixedRight", js.undefined)
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFooter(value: ElementOrFunc[ColumnHeaderProps]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: ColumnHeaderProps => String | ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: ElementOrFunc[ColumnHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction1(value: ColumnHeaderProps => String | ReactElement): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIsReorderable(value: Boolean): Self = StObject.set(x, "isReorderable", value.asInstanceOf[js.Any])
      
      inline def setIsReorderableUndefined: Self = StObject.set(x, "isReorderable", js.undefined)
      
      inline def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
      
      inline def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPureRendering(value: Boolean): Self = StObject.set(x, "pureRendering", value.asInstanceOf[js.Any])
      
      inline def setPureRenderingUndefined: Self = StObject.set(x, "pureRendering", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnReorderEndEvent extends StObject {
    
    /** the column after the new location of this one */
    var columnAfter: js.UndefOr[String] = js.undefined
    
    /** the column before the new location of this one */
    var columnBefore: js.UndefOr[String] = js.undefined
    
    /** the column key that was just reordered */
    var reorderColumn: String
  }
  object ColumnReorderEndEvent {
    
    inline def apply(reorderColumn: String): ColumnReorderEndEvent = {
      val __obj = js.Dynamic.literal(reorderColumn = reorderColumn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnReorderEndEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnReorderEndEvent] (val x: Self) extends AnyVal {
      
      inline def setColumnAfter(value: String): Self = StObject.set(x, "columnAfter", value.asInstanceOf[js.Any])
      
      inline def setColumnAfterUndefined: Self = StObject.set(x, "columnAfter", js.undefined)
      
      inline def setColumnBefore(value: String): Self = StObject.set(x, "columnBefore", value.asInstanceOf[js.Any])
      
      inline def setColumnBeforeUndefined: Self = StObject.set(x, "columnBefore", js.undefined)
      
      inline def setReorderColumn(value: String): Self = StObject.set(x, "reorderColumn", value.asInstanceOf[js.Any])
    }
  }
  
  type ElementOrFunc[P] = String | ReactElement | (js.Function1[/* props */ P, String | ReactElement])
  
  trait RowProps extends StObject {
    
    /** supplied from the Table or rowHeightGetter */
    var height: Double
    
    /** the row index */
    var rowIndex: Double
    
    /** supplied from the Table */
    var width: Double
  }
  object RowProps {
    
    inline def apply(height: Double, rowIndex: Double, width: Double): RowProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableProps
    extends StObject
       with ClassAttributes[Table] {
    
    /**
      * The number of rows outside the viewport to prerender. Defaults to roughly
      * half of the number of visible rows.
      */
    var bufferRowCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel height of fixedDataTableCellGroupLayout/cellGroupWrapper.
      * Default is headerHeight and groupHeaderHeight.
      *
      * This can be used with CSS to make a header cell span both the group & normal header row.
      * Setting this to a value larger than height will cause the content to
      * overflow the height. This is useful when adding a 2nd table as the group
      * header and vertically merging the 2 headers when a column is not part
      * of a group. Here are the necessary CSS changes:
      *
      * Both headers:
      *  - cellGroupWrapper needs overflow-x: hidden and pointer-events: none
      *  - cellGroup needs pointer-events: auto to reenable them on child els
      * Group header:
      *  - Layout/main needs overflow: visible and a higher z-index
      *  - CellLayout/main needs overflow-y: visible
      *  - cellGroup needs overflow: visible
      */
    var cellGroupWrapperHeight: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Class name to be passed into parent container
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Pixel height of footer.
      */
    var footerHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel height of the column group header.
      */
    var groupHeaderHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel height of header.
      */
    var headerHeight: Double
    
    /**
      * Pixel height of table. If all rows do not fit,
      * a vertical scrollbar will appear.
      *
      * Either `height` or `maxHeight` must be specified.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether columns are currently being reordered.
      */
    var isColumnReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether a column is currently being resized.
      */
    var isColumnResizing: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean flags to control if scrolling with keys is enabled */
    var keyboardPageEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean flags to control if scrolling with keys is enabled */
    var keyboardScrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum pixel height of table. If all rows do not fit,
      * a vertical scrollbar will appear.
      *
      * Either `height` or `maxHeight` must be specified.
      */
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback that is called when reordering has been completed
      * and columns need to be updated.
      *
      * ```
      * function(
      *   event {
      *     columnBefore: string|undefined, // the column before the new location of this one
      *     columnAfter: string|undefined,  // the column after the new location of this one
      *     reorderColumn: string,          // the column key that was just reordered
      *   }
      * )
      * ```
      */
    var onColumnReorderEndCallback: js.UndefOr[js.Function1[/* event */ ColumnReorderEndEvent, Unit]] = js.undefined
    
    /**
      * Callback that is called when resizer has been released
      * and column needs to be updated.
      *
      * Required if the isResizable property is true on any column.
      *
      * ```
      * function(
      *   newColumnWidth: number,
      *   columnKey: string,
      * )
      * ```
      */
    var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.undefined
    
    /**
      * Callback that is called when `rowHeightGetter` returns a different height
      * for a row than the `rowHeight` prop. This is necessary because initially
      * table estimates heights of some parts of the content.
      */
    var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.undefined
    
    /**
      * Callback when horizontally scrolling the grid.
      *
      * Return false to stop propagation.
      */
    var onHorizontalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.undefined
    
    /**
      * Callback that is called when a row is clicked.
      */
    var onRowClick: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a contextual-menu event happens on a row.
      */
    var onRowContextMenu: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a row is double clicked.
      */
    var onRowDoubleClick: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a mouse-down event happens on a row.
      */
    var onRowMouseDown: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a mouse-enter event happens on a row.
      */
    var onRowMouseEnter: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a mouse-leave event happens on a row.
      */
    var onRowMouseLeave: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a mouse-up event happens on a row.
      */
    var onRowMouseUp: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a touch-end event happens on a row.
      */
    var onRowTouchEnd: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a touch-move event happens on a row.
      */
    var onRowTouchMove: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when a touch-start event happens on a row.
      */
    var onRowTouchStart: js.UndefOr[TableRowEventHandler] = js.undefined
    
    /**
      * Callback that is called when scrolling ends or stops with new horizontal
      * and vertical scroll values.
      */
    var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
    
    /**
      * Callback that is called when scrolling starts with current horizontal
      * and vertical scroll values.
      */
    var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
    
    /**
      * Callback when vertically scrolling the grid.
      *
      * Return false to stop propagation.
      */
    var onVerticalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.undefined
    
    var overflowX: js.UndefOr[hidden | auto] = js.undefined
    
    var overflowY: js.UndefOr[hidden | auto] = js.undefined
    
    /**
      * Pixel height of table's owner, this is used in a managed scrolling
      * situation when you want to slide the table up from below the fold
      * without having to constantly update the height on every scroll tick.
      * Instead, vary this property on scroll. By using `ownerHeight`, we
      * over-render the table while making sure the footer and horizontal
      * scrollbar of the table are visible when the current space for the table
      * in view is smaller than the final, over-flowing height of table. It
      * allows us to avoid resizing and reflowing table when it is moving in the
      * view.
      *
      * This is used if `ownerHeight < height` (or `maxHeight`).
      */
    var ownerHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * To get any additional CSS classes that should be added to a row,
      * `rowClassNameGetter(index)` is called.
      */
    var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
    
    /**
      * The row expanded for table row.
      * This can either be a React element, or a function that generates
      * a React Element. By default, the React element passed in can expect to
      * receive the following props:
      *
      * ```
      * props: {
      *   rowIndex; number // (the row index)
      *   height: number // (supplied from the Table or rowHeightGetter)
      *   width: number // (supplied from the Table)
      * }
      * ```
      *
      * Because you are passing in your own React element, you can feel free to
      * pass in whatever props you may want or need.
      *
      * If you pass in a function, you will receive the same props object as the
      * first argument.
      */
    var rowExpanded: js.UndefOr[ElementOrFunc[RowProps]] = js.undefined
    
    /**
      * Pixel height of rows unless `rowHeightGetter` is specified and returns
      * different value.
      */
    var rowHeight: Double
    
    /**
      * If specified, `rowHeightGetter(index)` is called for each row and the
      * returned value overrides `rowHeight` for particular row.
      */
    var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    /**
      * If specified, `rowKeyGetter(index)` is called for each row and the
      * returned value overrides `key` for the particular row.
      */
    var rowKeyGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
    
    /**
      * Number of rows in the table.
      */
    var rowsCount: Double
    
    /**
      * Value of horizontal scroll.
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
      */
    var scrollTop: js.UndefOr[Double] = js.undefined
    
    /** Hide the scrollbar but still enable scroll functionality */
    var showScrollbarX: js.UndefOr[Boolean] = js.undefined
    
    /** Hide the scrollbar but still enable scroll functionality */
    var showScrollbarY: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If enabled scroll events will not be propagated outside of the table.
      */
    var stopScrollPropagation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pixel height of sub-row unless `subRowHeightGetter` is specified and returns
      * different value.  Defaults to 0 and no sub-row being displayed.
      */
    var subRowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * If specified, `subRowHeightGetter(index)` is called for each row and the
      * returned value overrides `subRowHeight` for particular row.
      */
    var subRowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    /**
      * Boolean flag indicating of touch scrolling should be enabled
      * This feature is current in beta and may have bugs
      */
    var touchScrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pixel width of table. If all columns do not fit,
      * a horizontal scrollbar will appear.
      */
    var width: Double
  }
  object TableProps {
    
    inline def apply(headerHeight: Double, rowHeight: Double, rowsCount: Double, width: Double): TableProps = {
      val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      inline def setBufferRowCount(value: Double): Self = StObject.set(x, "bufferRowCount", value.asInstanceOf[js.Any])
      
      inline def setBufferRowCountUndefined: Self = StObject.set(x, "bufferRowCount", js.undefined)
      
      inline def setCellGroupWrapperHeight(value: Double): Self = StObject.set(x, "cellGroupWrapperHeight", value.asInstanceOf[js.Any])
      
      inline def setCellGroupWrapperHeightUndefined: Self = StObject.set(x, "cellGroupWrapperHeight", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFooterHeight(value: Double): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      inline def setFooterHeightUndefined: Self = StObject.set(x, "footerHeight", js.undefined)
      
      inline def setGroupHeaderHeight(value: Double): Self = StObject.set(x, "groupHeaderHeight", value.asInstanceOf[js.Any])
      
      inline def setGroupHeaderHeightUndefined: Self = StObject.set(x, "groupHeaderHeight", js.undefined)
      
      inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsColumnReordering(value: Boolean): Self = StObject.set(x, "isColumnReordering", value.asInstanceOf[js.Any])
      
      inline def setIsColumnReorderingUndefined: Self = StObject.set(x, "isColumnReordering", js.undefined)
      
      inline def setIsColumnResizing(value: Boolean): Self = StObject.set(x, "isColumnResizing", value.asInstanceOf[js.Any])
      
      inline def setIsColumnResizingUndefined: Self = StObject.set(x, "isColumnResizing", js.undefined)
      
      inline def setKeyboardPageEnabled(value: Boolean): Self = StObject.set(x, "keyboardPageEnabled", value.asInstanceOf[js.Any])
      
      inline def setKeyboardPageEnabledUndefined: Self = StObject.set(x, "keyboardPageEnabled", js.undefined)
      
      inline def setKeyboardScrollEnabled(value: Boolean): Self = StObject.set(x, "keyboardScrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setKeyboardScrollEnabledUndefined: Self = StObject.set(x, "keyboardScrollEnabled", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setOnColumnReorderEndCallback(value: /* event */ ColumnReorderEndEvent => Unit): Self = StObject.set(x, "onColumnReorderEndCallback", js.Any.fromFunction1(value))
      
      inline def setOnColumnReorderEndCallbackUndefined: Self = StObject.set(x, "onColumnReorderEndCallback", js.undefined)
      
      inline def setOnColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit): Self = StObject.set(x, "onColumnResizeEndCallback", js.Any.fromFunction2(value))
      
      inline def setOnColumnResizeEndCallbackUndefined: Self = StObject.set(x, "onColumnResizeEndCallback", js.undefined)
      
      inline def setOnContentHeightChange(value: /* newHeight */ Double => Unit): Self = StObject.set(x, "onContentHeightChange", js.Any.fromFunction1(value))
      
      inline def setOnContentHeightChangeUndefined: Self = StObject.set(x, "onContentHeightChange", js.undefined)
      
      inline def setOnHorizontalScroll(value: /* scrollPos */ Double => Boolean): Self = StObject.set(x, "onHorizontalScroll", js.Any.fromFunction1(value))
      
      inline def setOnHorizontalScrollUndefined: Self = StObject.set(x, "onHorizontalScroll", js.undefined)
      
      inline def setOnRowClick(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnRowContextMenu(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowContextMenu", js.Any.fromFunction2(value))
      
      inline def setOnRowContextMenuUndefined: Self = StObject.set(x, "onRowContextMenu", js.undefined)
      
      inline def setOnRowDoubleClick(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction2(value))
      
      inline def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
      
      inline def setOnRowMouseDown(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseDown", js.Any.fromFunction2(value))
      
      inline def setOnRowMouseDownUndefined: Self = StObject.set(x, "onRowMouseDown", js.undefined)
      
      inline def setOnRowMouseEnter(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnRowMouseEnterUndefined: Self = StObject.set(x, "onRowMouseEnter", js.undefined)
      
      inline def setOnRowMouseLeave(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnRowMouseLeaveUndefined: Self = StObject.set(x, "onRowMouseLeave", js.undefined)
      
      inline def setOnRowMouseUp(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseUp", js.Any.fromFunction2(value))
      
      inline def setOnRowMouseUpUndefined: Self = StObject.set(x, "onRowMouseUp", js.undefined)
      
      inline def setOnRowTouchEnd(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowTouchEnd", js.Any.fromFunction2(value))
      
      inline def setOnRowTouchEndUndefined: Self = StObject.set(x, "onRowTouchEnd", js.undefined)
      
      inline def setOnRowTouchMove(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowTouchMove", js.Any.fromFunction2(value))
      
      inline def setOnRowTouchMoveUndefined: Self = StObject.set(x, "onRowTouchMove", js.undefined)
      
      inline def setOnRowTouchStart(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowTouchStart", js.Any.fromFunction2(value))
      
      inline def setOnRowTouchStartUndefined: Self = StObject.set(x, "onRowTouchStart", js.undefined)
      
      inline def setOnScrollEnd(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onScrollEnd", js.Any.fromFunction2(value))
      
      inline def setOnScrollEndUndefined: Self = StObject.set(x, "onScrollEnd", js.undefined)
      
      inline def setOnScrollStart(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onScrollStart", js.Any.fromFunction2(value))
      
      inline def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
      
      inline def setOnVerticalScroll(value: /* scrollPos */ Double => Boolean): Self = StObject.set(x, "onVerticalScroll", js.Any.fromFunction1(value))
      
      inline def setOnVerticalScrollUndefined: Self = StObject.set(x, "onVerticalScroll", js.undefined)
      
      inline def setOverflowX(value: hidden | auto): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowY(value: hidden | auto): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOwnerHeight(value: Double): Self = StObject.set(x, "ownerHeight", value.asInstanceOf[js.Any])
      
      inline def setOwnerHeightUndefined: Self = StObject.set(x, "ownerHeight", js.undefined)
      
      inline def setRowClassNameGetter(value: /* index */ Double => String): Self = StObject.set(x, "rowClassNameGetter", js.Any.fromFunction1(value))
      
      inline def setRowClassNameGetterUndefined: Self = StObject.set(x, "rowClassNameGetter", js.undefined)
      
      inline def setRowExpanded(value: ElementOrFunc[RowProps]): Self = StObject.set(x, "rowExpanded", value.asInstanceOf[js.Any])
      
      inline def setRowExpandedFunction1(value: RowProps => String | ReactElement): Self = StObject.set(x, "rowExpanded", js.Any.fromFunction1(value))
      
      inline def setRowExpandedUndefined: Self = StObject.set(x, "rowExpanded", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightGetter(value: /* index */ Double => Double): Self = StObject.set(x, "rowHeightGetter", js.Any.fromFunction1(value))
      
      inline def setRowHeightGetterUndefined: Self = StObject.set(x, "rowHeightGetter", js.undefined)
      
      inline def setRowKeyGetter(value: /* index */ Double => String): Self = StObject.set(x, "rowKeyGetter", js.Any.fromFunction1(value))
      
      inline def setRowKeyGetterUndefined: Self = StObject.set(x, "rowKeyGetter", js.undefined)
      
      inline def setRowsCount(value: Double): Self = StObject.set(x, "rowsCount", value.asInstanceOf[js.Any])
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      inline def setScrollToColumn(value: Double): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
      
      inline def setScrollToColumnUndefined: Self = StObject.set(x, "scrollToColumn", js.undefined)
      
      inline def setScrollToRow(value: Double): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
      
      inline def setScrollToRowUndefined: Self = StObject.set(x, "scrollToRow", js.undefined)
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setShowScrollbarX(value: Boolean): Self = StObject.set(x, "showScrollbarX", value.asInstanceOf[js.Any])
      
      inline def setShowScrollbarXUndefined: Self = StObject.set(x, "showScrollbarX", js.undefined)
      
      inline def setShowScrollbarY(value: Boolean): Self = StObject.set(x, "showScrollbarY", value.asInstanceOf[js.Any])
      
      inline def setShowScrollbarYUndefined: Self = StObject.set(x, "showScrollbarY", js.undefined)
      
      inline def setStopScrollPropagation(value: Boolean): Self = StObject.set(x, "stopScrollPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopScrollPropagationUndefined: Self = StObject.set(x, "stopScrollPropagation", js.undefined)
      
      inline def setSubRowHeight(value: Double): Self = StObject.set(x, "subRowHeight", value.asInstanceOf[js.Any])
      
      inline def setSubRowHeightGetter(value: /* index */ Double => Double): Self = StObject.set(x, "subRowHeightGetter", js.Any.fromFunction1(value))
      
      inline def setSubRowHeightGetterUndefined: Self = StObject.set(x, "subRowHeightGetter", js.undefined)
      
      inline def setSubRowHeightUndefined: Self = StObject.set(x, "subRowHeight", js.undefined)
      
      inline def setTouchScrollEnabled(value: Boolean): Self = StObject.set(x, "touchScrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setTouchScrollEnabledUndefined: Self = StObject.set(x, "touchScrollEnabled", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TableRowEventHandler = js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
}
