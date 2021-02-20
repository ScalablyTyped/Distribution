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
import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fixed-data-table-2", "Cell")
  @js.native
  class Cell protected ()
    extends Component[CellProps, js.Object, js.Any] {
    def this(props: CellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CellProps, context: js.Any) = this()
  }
  
  @JSImport("fixed-data-table-2", "Column")
  @js.native
  class Column protected ()
    extends Component[ColumnProps, js.Object, js.Any] {
    def this(props: ColumnProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnProps, context: js.Any) = this()
  }
  
  @JSImport("fixed-data-table-2", "ColumnGroup")
  @js.native
  class ColumnGroup protected ()
    extends Component[ColumnGroupProps, js.Object, js.Any] {
    def this(props: ColumnGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnGroupProps, context: js.Any) = this()
  }
  
  @JSImport("fixed-data-table-2", "Table")
  @js.native
  class Table protected ()
    extends Component[TableProps, js.Object, js.Any] {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: js.Any) = this()
  }
  
  @js.native
  trait CellProps extends HTMLAttributes[Cell] {
    
    /**
      * Optional prop that if specified on the `Column` will be passed to the
      * cell. It can be used to uniquely identify which column is the cell is in.
      */
    var columnKey: js.UndefOr[String | Double] = js.native
    
    /**
      * Outer height of the cell.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Optional prop that represents the rows index in the table.
      * For the 'cell' prop of a Column, this parameter will exist for any
      * cell in a row with a positive index.
      *
      * Below that entry point the user is welcome to consume or
      * pass the prop through at their discretion.
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    /**
      * Outer width of the cell.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CellProps {
    
    @scala.inline
    def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit class CellPropsMutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnKey(value: String | Double): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ColumnCellProps extends ColumnHeaderProps {
    
    /** the row index of the cell */
    var rowIndex: Double = js.native
  }
  object ColumnCellProps {
    
    @scala.inline
    def apply(height: Double, rowIndex: Double, width: Double): ColumnCellProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnCellProps]
    }
    
    @scala.inline
    implicit class ColumnCellPropsMutableBuilder[Self <: ColumnCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColumnGroupHeaderProps extends StObject {
    
    /* supplied from the groupHeaderHeight */
    var height: Double = js.native
    
    /* supplied from the Column */
    var width: Double = js.native
  }
  object ColumnGroupHeaderProps {
    
    @scala.inline
    def apply(height: Double, width: Double): ColumnGroupHeaderProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupHeaderProps]
    }
    
    @scala.inline
    implicit class ColumnGroupHeaderPropsMutableBuilder[Self <: ColumnGroupHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColumnGroupProps extends ClassAttributes[ColumnGroup] {
    
    /**
      * The horizontal alignment of the table cell content.
      */
    var align: js.UndefOr[left | center | right] = js.native
    
    /**
      * Controls if the column group is fixed when scrolling in the X axis.
      *
      * defaultValue: false
      */
    var fixed: js.UndefOr[Boolean] = js.native
    
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
      ] = js.native
  }
  object ColumnGroupProps {
    
    @scala.inline
    def apply(): ColumnGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupProps]
    }
    
    @scala.inline
    implicit class ColumnGroupPropsMutableBuilder[Self <: ColumnGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setHeader(
        value: String | ReactElement | (js.Function1[/* props */ ColumnGroupHeaderProps, String | ReactElement])
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction1(value: /* props */ ColumnGroupHeaderProps => String | ReactElement): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  @js.native
  trait ColumnHeaderProps extends StObject {
    
    var columnKey: js.UndefOr[String] = js.native
    
    /** supplied from the Table or rowHeightGetter */
    var height: Double = js.native
    
    /** supplied from the Column */
    var width: Double = js.native
  }
  object ColumnHeaderProps {
    
    @scala.inline
    def apply(height: Double, width: Double): ColumnHeaderProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnHeaderProps]
    }
    
    @scala.inline
    implicit class ColumnHeaderPropsMutableBuilder[Self <: ColumnHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColumnProps extends ClassAttributes[Column] {
    
    /**
      * The horizontal alignment of the table cell content.
      */
    var align: js.UndefOr[left | center | right] = js.native
    
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
    var allowCellsRecycling: js.UndefOr[Boolean] = js.native
    
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
    var cell: js.UndefOr[ElementOrFunc[ColumnCellProps]] = js.native
    
    /**
      * This is used to uniquely identify the column, and is not required unless
      * you a resizing columns. This will be the key given in the
      * `onColumnResizeEndCallback` on the Table.
      */
    var columnKey: js.UndefOr[String | Double] = js.native
    
    /**
      * Controls if the column is fixed when scrolling in the X axis.
      *
      * defaultValue: false
      */
    var fixed: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if the column is fixed to the right side of the table
      * when scrolling in the X axis.
      *
      * defaultValue: false
      */
    var fixedRight: js.UndefOr[Boolean] = js.native
    
    /**
      * The grow factor relative to other columns. Same as the flex-grow API
      * from http://www.w3.org/TR/css3-flexbox/. Basically, take any available
      * extra width and distribute it proportionally according to all columns'
      * flexGrow values. Defaults to zero (no-flexing).
      */
    var flexGrow: js.UndefOr[Double] = js.native
    
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
    var footer: js.UndefOr[ElementOrFunc[ColumnHeaderProps]] = js.native
    
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
    var header: js.UndefOr[ElementOrFunc[ColumnHeaderProps]] = js.native
    
    /**
      * Whether the column can be dragged to reorder.
      */
    var isReorderable: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the column can be resized with the
      * FixedDataTableColumnResizeHandle. Please note that if a column
      * has a flex grow, once you resize the column this will be set to 0.
      *
      * This property only provides the UI for the column resizing. If this
      * is set to true, you will need to set the onColumnResizeEndCallback table
      * property and render your columns appropriately.
      */
    var isResizable: js.UndefOr[Boolean] = js.native
    
    /**
      * If this is a resizable column this is its maximum pixel width.
      */
    var maxWidth: js.UndefOr[Double] = js.native
    
    /**
      * If this is a resizable column this is its minimum pixel width.
      */
    var minWidth: js.UndefOr[Double] = js.native
    
    /**
      * Flag to enable performance check when rendering. Stops the component from
      * rendering if none of it's passed in props have changed
      */
    var pureRendering: js.UndefOr[Boolean] = js.native
    
    /**
      * The pixel width of the column.
      */
    var width: Double = js.native
  }
  object ColumnProps {
    
    @scala.inline
    def apply(width: Double): ColumnProps = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnProps]
    }
    
    @scala.inline
    implicit class ColumnPropsMutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAllowCellsRecycling(value: Boolean): Self = StObject.set(x, "allowCellsRecycling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCellsRecyclingUndefined: Self = StObject.set(x, "allowCellsRecycling", js.undefined)
      
      @scala.inline
      def setCell(value: ElementOrFunc[ColumnCellProps]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellFunction1(value: ColumnCellProps => String | ReactElement): Self = StObject.set(x, "cell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setColumnKey(value: String | Double): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedRight(value: Boolean): Self = StObject.set(x, "fixedRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedRightUndefined: Self = StObject.set(x, "fixedRight", js.undefined)
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      @scala.inline
      def setFooter(value: ElementOrFunc[ColumnHeaderProps]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterFunction1(value: ColumnHeaderProps => String | ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: ElementOrFunc[ColumnHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction1(value: ColumnHeaderProps => String | ReactElement): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIsReorderable(value: Boolean): Self = StObject.set(x, "isReorderable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReorderableUndefined: Self = StObject.set(x, "isReorderable", js.undefined)
      
      @scala.inline
      def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setPureRendering(value: Boolean): Self = StObject.set(x, "pureRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureRenderingUndefined: Self = StObject.set(x, "pureRendering", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColumnReorderEndEvent extends StObject {
    
    /** the column after the new location of this one */
    var columnAfter: js.UndefOr[String] = js.native
    
    /** the column before the new location of this one */
    var columnBefore: js.UndefOr[String] = js.native
    
    /** the column key that was just reordered */
    var reorderColumn: String = js.native
  }
  object ColumnReorderEndEvent {
    
    @scala.inline
    def apply(reorderColumn: String): ColumnReorderEndEvent = {
      val __obj = js.Dynamic.literal(reorderColumn = reorderColumn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnReorderEndEvent]
    }
    
    @scala.inline
    implicit class ColumnReorderEndEventMutableBuilder[Self <: ColumnReorderEndEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnAfter(value: String): Self = StObject.set(x, "columnAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnAfterUndefined: Self = StObject.set(x, "columnAfter", js.undefined)
      
      @scala.inline
      def setColumnBefore(value: String): Self = StObject.set(x, "columnBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnBeforeUndefined: Self = StObject.set(x, "columnBefore", js.undefined)
      
      @scala.inline
      def setReorderColumn(value: String): Self = StObject.set(x, "reorderColumn", value.asInstanceOf[js.Any])
    }
  }
  
  type ElementOrFunc[P] = String | ReactElement | (js.Function1[/* props */ P, String | ReactElement])
  
  @js.native
  trait RowProps extends StObject {
    
    /** supplied from the Table or rowHeightGetter */
    var height: Double = js.native
    
    /** the row index */
    var rowIndex: Double = js.native
    
    /** supplied from the Table */
    var width: Double = js.native
  }
  object RowProps {
    
    @scala.inline
    def apply(height: Double, rowIndex: Double, width: Double): RowProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowProps]
    }
    
    @scala.inline
    implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableProps extends ClassAttributes[Table] {
    
    /**
      * The number of rows outside the viewport to prerender. Defaults to roughly
      * half of the number of visible rows.
      */
    var bufferRowCount: js.UndefOr[Double] = js.native
    
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
    var cellGroupWrapperHeight: js.UndefOr[Double] = js.native
    
    /**
      * Class name to be passed into parent container
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Pixel height of footer.
      */
    var footerHeight: js.UndefOr[Double] = js.native
    
    /**
      * Pixel height of the column group header.
      */
    var groupHeaderHeight: js.UndefOr[Double] = js.native
    
    /**
      * Pixel height of header.
      */
    var headerHeight: Double = js.native
    
    /**
      * Pixel height of table. If all rows do not fit,
      * a vertical scrollbar will appear.
      *
      * Either `height` or `maxHeight` must be specified.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Whether columns are currently being reordered.
      */
    var isColumnReordering: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether a column is currently being resized.
      */
    var isColumnResizing: js.UndefOr[Boolean] = js.native
    
    /** Boolean flags to control if scrolling with keys is enabled */
    var keyboardPageEnabled: js.UndefOr[Boolean] = js.native
    
    /** Boolean flags to control if scrolling with keys is enabled */
    var keyboardScrollEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Maximum pixel height of table. If all rows do not fit,
      * a vertical scrollbar will appear.
      *
      * Either `height` or `maxHeight` must be specified.
      */
    var maxHeight: js.UndefOr[Double] = js.native
    
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
    var onColumnReorderEndCallback: js.UndefOr[js.Function1[/* event */ ColumnReorderEndEvent, Unit]] = js.native
    
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
    var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.native
    
    /**
      * Callback that is called when `rowHeightGetter` returns a different height
      * for a row than the `rowHeight` prop. This is necessary because initially
      * table estimates heights of some parts of the content.
      */
    var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.native
    
    /**
      * Callback when horizontally scrolling the grid.
      *
      * Return false to stop propagation.
      */
    var onHorizontalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.native
    
    /**
      * Callback that is called when a row is clicked.
      */
    var onRowClick: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when a row is double clicked.
      */
    var onRowDoubleClick: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when a mouse-down event happens on a row.
      */
    var onRowMouseDown: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when a mouse-enter event happens on a row.
      */
    var onRowMouseEnter: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when a mouse-leave event happens on a row.
      */
    var onRowMouseLeave: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when a mouse-up event happens on a row.
      */
    var onRowMouseUp: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when a touch-end event happens on a row.
      */
    var onRowTouchEnd: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when a touch-move event happens on a row.
      */
    var onRowTouchMove: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when a touch-start event happens on a row.
      */
    var onRowTouchStart: js.UndefOr[TableRowEventHandler] = js.native
    
    /**
      * Callback that is called when scrolling ends or stops with new horizontal
      * and vertical scroll values.
      */
    var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
    
    /**
      * Callback that is called when scrolling starts with current horizontal
      * and vertical scroll values.
      */
    var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
    
    /**
      * Callback when vertically scrolling the grid.
      *
      * Return false to stop propagation.
      */
    var onVerticalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.native
    
    var overflowX: js.UndefOr[hidden | auto] = js.native
    
    var overflowY: js.UndefOr[hidden | auto] = js.native
    
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
    var ownerHeight: js.UndefOr[Double] = js.native
    
    /**
      * To get any additional CSS classes that should be added to a row,
      * `rowClassNameGetter(index)` is called.
      */
    var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
    
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
    var rowExpanded: js.UndefOr[ElementOrFunc[RowProps]] = js.native
    
    /**
      * Pixel height of rows unless `rowHeightGetter` is specified and returns
      * different value.
      */
    var rowHeight: Double = js.native
    
    /**
      * If specified, `rowHeightGetter(index)` is called for each row and the
      * returned value overrides `rowHeight` for particular row.
      */
    var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
    
    /**
      * If specified, `rowKeyGetter(index)` is called for each row and the
      * returned value overrides `key` for the particular row.
      */
    var rowKeyGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
    
    /**
      * Number of rows in the table.
      */
    var rowsCount: Double = js.native
    
    /**
      * Value of horizontal scroll.
      */
    var scrollLeft: js.UndefOr[Double] = js.native
    
    /**
      * Index of column to scroll to.
      */
    var scrollToColumn: js.UndefOr[Double] = js.native
    
    /**
      * Index of row to scroll to.
      */
    var scrollToRow: js.UndefOr[Double] = js.native
    
    /**
      * Value of vertical scroll.
      */
    var scrollTop: js.UndefOr[Double] = js.native
    
    /** Hide the scrollbar but still enable scroll functionality */
    var showScrollbarX: js.UndefOr[Boolean] = js.native
    
    /** Hide the scrollbar but still enable scroll functionality */
    var showScrollbarY: js.UndefOr[Boolean] = js.native
    
    /**
      * If enabled scroll events will not be propagated outside of the table.
      */
    var stopScrollPropagation: js.UndefOr[Boolean] = js.native
    
    /**
      * Pixel height of sub-row unless `subRowHeightGetter` is specified and returns
      * different value.  Defaults to 0 and no sub-row being displayed.
      */
    var subRowHeight: js.UndefOr[Double] = js.native
    
    /**
      * If specified, `subRowHeightGetter(index)` is called for each row and the
      * returned value overrides `subRowHeight` for particular row.
      */
    var subRowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
    
    /**
      * Boolean flag indicating of touch scrolling should be enabled
      * This feature is current in beta and may have bugs
      */
    var touchScrollEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Pixel width of table. If all columns do not fit,
      * a horizontal scrollbar will appear.
      */
    var width: Double = js.native
  }
  object TableProps {
    
    @scala.inline
    def apply(headerHeight: Double, rowHeight: Double, rowsCount: Double, width: Double): TableProps = {
      val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferRowCount(value: Double): Self = StObject.set(x, "bufferRowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferRowCountUndefined: Self = StObject.set(x, "bufferRowCount", js.undefined)
      
      @scala.inline
      def setCellGroupWrapperHeight(value: Double): Self = StObject.set(x, "cellGroupWrapperHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellGroupWrapperHeightUndefined: Self = StObject.set(x, "cellGroupWrapperHeight", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFooterHeight(value: Double): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterHeightUndefined: Self = StObject.set(x, "footerHeight", js.undefined)
      
      @scala.inline
      def setGroupHeaderHeight(value: Double): Self = StObject.set(x, "groupHeaderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderHeightUndefined: Self = StObject.set(x, "groupHeaderHeight", js.undefined)
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsColumnReordering(value: Boolean): Self = StObject.set(x, "isColumnReordering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColumnReorderingUndefined: Self = StObject.set(x, "isColumnReordering", js.undefined)
      
      @scala.inline
      def setIsColumnResizing(value: Boolean): Self = StObject.set(x, "isColumnResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColumnResizingUndefined: Self = StObject.set(x, "isColumnResizing", js.undefined)
      
      @scala.inline
      def setKeyboardPageEnabled(value: Boolean): Self = StObject.set(x, "keyboardPageEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardPageEnabledUndefined: Self = StObject.set(x, "keyboardPageEnabled", js.undefined)
      
      @scala.inline
      def setKeyboardScrollEnabled(value: Boolean): Self = StObject.set(x, "keyboardScrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardScrollEnabledUndefined: Self = StObject.set(x, "keyboardScrollEnabled", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setOnColumnReorderEndCallback(value: /* event */ ColumnReorderEndEvent => Unit): Self = StObject.set(x, "onColumnReorderEndCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnReorderEndCallbackUndefined: Self = StObject.set(x, "onColumnReorderEndCallback", js.undefined)
      
      @scala.inline
      def setOnColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit): Self = StObject.set(x, "onColumnResizeEndCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnColumnResizeEndCallbackUndefined: Self = StObject.set(x, "onColumnResizeEndCallback", js.undefined)
      
      @scala.inline
      def setOnContentHeightChange(value: /* newHeight */ Double => Unit): Self = StObject.set(x, "onContentHeightChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentHeightChangeUndefined: Self = StObject.set(x, "onContentHeightChange", js.undefined)
      
      @scala.inline
      def setOnHorizontalScroll(value: /* scrollPos */ Double => Boolean): Self = StObject.set(x, "onHorizontalScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHorizontalScrollUndefined: Self = StObject.set(x, "onHorizontalScroll", js.undefined)
      
      @scala.inline
      def setOnRowClick(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      @scala.inline
      def setOnRowDoubleClick(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
      
      @scala.inline
      def setOnRowMouseDown(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowMouseDownUndefined: Self = StObject.set(x, "onRowMouseDown", js.undefined)
      
      @scala.inline
      def setOnRowMouseEnter(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowMouseEnterUndefined: Self = StObject.set(x, "onRowMouseEnter", js.undefined)
      
      @scala.inline
      def setOnRowMouseLeave(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowMouseLeaveUndefined: Self = StObject.set(x, "onRowMouseLeave", js.undefined)
      
      @scala.inline
      def setOnRowMouseUp(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowMouseUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowMouseUpUndefined: Self = StObject.set(x, "onRowMouseUp", js.undefined)
      
      @scala.inline
      def setOnRowTouchEnd(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowTouchEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowTouchEndUndefined: Self = StObject.set(x, "onRowTouchEnd", js.undefined)
      
      @scala.inline
      def setOnRowTouchMove(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowTouchMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowTouchMoveUndefined: Self = StObject.set(x, "onRowTouchMove", js.undefined)
      
      @scala.inline
      def setOnRowTouchStart(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onRowTouchStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowTouchStartUndefined: Self = StObject.set(x, "onRowTouchStart", js.undefined)
      
      @scala.inline
      def setOnScrollEnd(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onScrollEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollEndUndefined: Self = StObject.set(x, "onScrollEnd", js.undefined)
      
      @scala.inline
      def setOnScrollStart(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onScrollStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
      
      @scala.inline
      def setOnVerticalScroll(value: /* scrollPos */ Double => Boolean): Self = StObject.set(x, "onVerticalScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVerticalScrollUndefined: Self = StObject.set(x, "onVerticalScroll", js.undefined)
      
      @scala.inline
      def setOverflowX(value: hidden | auto): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      @scala.inline
      def setOverflowY(value: hidden | auto): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      @scala.inline
      def setOwnerHeight(value: Double): Self = StObject.set(x, "ownerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerHeightUndefined: Self = StObject.set(x, "ownerHeight", js.undefined)
      
      @scala.inline
      def setRowClassNameGetter(value: /* index */ Double => String): Self = StObject.set(x, "rowClassNameGetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowClassNameGetterUndefined: Self = StObject.set(x, "rowClassNameGetter", js.undefined)
      
      @scala.inline
      def setRowExpanded(value: ElementOrFunc[RowProps]): Self = StObject.set(x, "rowExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowExpandedFunction1(value: RowProps => String | ReactElement): Self = StObject.set(x, "rowExpanded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowExpandedUndefined: Self = StObject.set(x, "rowExpanded", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightGetter(value: /* index */ Double => Double): Self = StObject.set(x, "rowHeightGetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowHeightGetterUndefined: Self = StObject.set(x, "rowHeightGetter", js.undefined)
      
      @scala.inline
      def setRowKeyGetter(value: /* index */ Double => String): Self = StObject.set(x, "rowKeyGetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowKeyGetterUndefined: Self = StObject.set(x, "rowKeyGetter", js.undefined)
      
      @scala.inline
      def setRowsCount(value: Double): Self = StObject.set(x, "rowsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      @scala.inline
      def setScrollToColumn(value: Double): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToColumnUndefined: Self = StObject.set(x, "scrollToColumn", js.undefined)
      
      @scala.inline
      def setScrollToRow(value: Double): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToRowUndefined: Self = StObject.set(x, "scrollToRow", js.undefined)
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      @scala.inline
      def setShowScrollbarX(value: Boolean): Self = StObject.set(x, "showScrollbarX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowScrollbarXUndefined: Self = StObject.set(x, "showScrollbarX", js.undefined)
      
      @scala.inline
      def setShowScrollbarY(value: Boolean): Self = StObject.set(x, "showScrollbarY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowScrollbarYUndefined: Self = StObject.set(x, "showScrollbarY", js.undefined)
      
      @scala.inline
      def setStopScrollPropagation(value: Boolean): Self = StObject.set(x, "stopScrollPropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopScrollPropagationUndefined: Self = StObject.set(x, "stopScrollPropagation", js.undefined)
      
      @scala.inline
      def setSubRowHeight(value: Double): Self = StObject.set(x, "subRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubRowHeightGetter(value: /* index */ Double => Double): Self = StObject.set(x, "subRowHeightGetter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubRowHeightGetterUndefined: Self = StObject.set(x, "subRowHeightGetter", js.undefined)
      
      @scala.inline
      def setSubRowHeightUndefined: Self = StObject.set(x, "subRowHeight", js.undefined)
      
      @scala.inline
      def setTouchScrollEnabled(value: Boolean): Self = StObject.set(x, "touchScrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchScrollEnabledUndefined: Self = StObject.set(x, "touchScrollEnabled", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TableRowEventHandler = js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
}
