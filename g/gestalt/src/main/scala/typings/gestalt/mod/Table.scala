package typings.gestalt.mod

import typings.react.mod.Component
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gestalt", "Table")
@js.native
class Table protected ()
  extends Component[TableProps, js.Any, js.Any] {
  def this(props: TableProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TableProps, context: js.Any) = this()
}
/* static members */
object Table {
  
  @JSImport("gestalt", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gestalt", "Table.Body")
  @js.native
  def Body: FC[TableBodyProps] = js.native
  inline def Body_=(x: FC[TableBodyProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.Cell")
  @js.native
  def Cell: FC[TableCellProps] = js.native
  inline def Cell_=(x: FC[TableCellProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.Footer")
  @js.native
  def Footer: FC[TableFooterProps] = js.native
  inline def Footer_=(x: FC[TableFooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.Header")
  @js.native
  def Header: FC[TableHeaderProps] = js.native
  
  @JSImport("gestalt", "Table.HeaderCell")
  @js.native
  def HeaderCell: FC[TableHeaderCellProps] = js.native
  inline def HeaderCell_=(x: FC[TableHeaderCellProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderCell")(x.asInstanceOf[js.Any])
  
  inline def Header_=(x: FC[TableHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.Row")
  @js.native
  def Row: FC[TableRowProps] = js.native
  
  @JSImport("gestalt", "Table.RowExpandable")
  @js.native
  def RowExpandable: FC[TableRowExpandableProps] = js.native
  inline def RowExpandable_=(x: FC[TableRowExpandableProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowExpandable")(x.asInstanceOf[js.Any])
  
  inline def Row_=(x: FC[TableRowProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  
  @JSImport("gestalt", "Table.SortableHeaderCell")
  @js.native
  def SortableHeaderCell: FC[TableSortableHeaderCellProps] = js.native
  inline def SortableHeaderCell_=(x: FC[TableSortableHeaderCellProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SortableHeaderCell")(x.asInstanceOf[js.Any])
}
