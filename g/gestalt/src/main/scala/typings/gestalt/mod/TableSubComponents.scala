package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSubComponents extends StObject {
  
  var Body: FunctionComponent[TableBodyProps]
  
  var Cell: FunctionComponent[TableCellProps]
  
  var Footer: FunctionComponent[TableFooterProps]
  
  var Header: FunctionComponent[TableHeaderProps]
  
  var HeaderCell: FunctionComponent[TableHeaderCellProps]
  
  var Row: FunctionComponent[TableRowProps]
  
  var RowDrawer: FunctionComponent[TableRowDrawerProps]
  
  var RowExpandable: FunctionComponent[TableRowExpandableProps]
  
  var SortableHeaderCell: FunctionComponent[TableSortableHeaderCellProps]
}
object TableSubComponents {
  
  inline def apply(
    Body: FunctionComponent[TableBodyProps],
    Cell: FunctionComponent[TableCellProps],
    Footer: FunctionComponent[TableFooterProps],
    Header: FunctionComponent[TableHeaderProps],
    HeaderCell: FunctionComponent[TableHeaderCellProps],
    Row: FunctionComponent[TableRowProps],
    RowDrawer: FunctionComponent[TableRowDrawerProps],
    RowExpandable: FunctionComponent[TableRowExpandableProps],
    SortableHeaderCell: FunctionComponent[TableSortableHeaderCellProps]
  ): TableSubComponents = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Cell = Cell.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], HeaderCell = HeaderCell.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], RowDrawer = RowDrawer.asInstanceOf[js.Any], RowExpandable = RowExpandable.asInstanceOf[js.Any], SortableHeaderCell = SortableHeaderCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableSubComponents] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FunctionComponent[TableBodyProps]): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setCell(value: FunctionComponent[TableCellProps]): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: FunctionComponent[TableFooterProps]): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: FunctionComponent[TableHeaderProps]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderCell(value: FunctionComponent[TableHeaderCellProps]): Self = StObject.set(x, "HeaderCell", value.asInstanceOf[js.Any])
    
    inline def setRow(value: FunctionComponent[TableRowProps]): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    inline def setRowDrawer(value: FunctionComponent[TableRowDrawerProps]): Self = StObject.set(x, "RowDrawer", value.asInstanceOf[js.Any])
    
    inline def setRowExpandable(value: FunctionComponent[TableRowExpandableProps]): Self = StObject.set(x, "RowExpandable", value.asInstanceOf[js.Any])
    
    inline def setSortableHeaderCell(value: FunctionComponent[TableSortableHeaderCellProps]): Self = StObject.set(x, "SortableHeaderCell", value.asInstanceOf[js.Any])
  }
}
