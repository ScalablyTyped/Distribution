package typings.gestalt.mod

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSubCompnents extends StObject {
  
  var Body: FC[TableBodyProps]
  
  var Cell: FC[TableCellProps]
  
  var Footer: FC[TableFooterProps]
  
  var Header: FC[TableHeaderProps]
  
  var HeaderCell: FC[TableHeaderCellProps]
  
  var Row: FC[TableRowProps]
  
  var RowExpandable: FC[TableRowExpandableProps]
  
  var SortableHeaderCell: FC[TableSortableHeaderCellProps]
}
object TableSubCompnents {
  
  inline def apply(
    Body: FC[TableBodyProps],
    Cell: FC[TableCellProps],
    Footer: FC[TableFooterProps],
    Header: FC[TableHeaderProps],
    HeaderCell: FC[TableHeaderCellProps],
    Row: FC[TableRowProps],
    RowExpandable: FC[TableRowExpandableProps],
    SortableHeaderCell: FC[TableSortableHeaderCellProps]
  ): TableSubCompnents = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Cell = Cell.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], HeaderCell = HeaderCell.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], RowExpandable = RowExpandable.asInstanceOf[js.Any], SortableHeaderCell = SortableHeaderCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSubCompnents]
  }
  
  extension [Self <: TableSubCompnents](x: Self) {
    
    inline def setBody(value: FC[TableBodyProps]): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setCell(value: FC[TableCellProps]): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: FC[TableFooterProps]): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: FC[TableHeaderProps]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderCell(value: FC[TableHeaderCellProps]): Self = StObject.set(x, "HeaderCell", value.asInstanceOf[js.Any])
    
    inline def setRow(value: FC[TableRowProps]): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    inline def setRowExpandable(value: FC[TableRowExpandableProps]): Self = StObject.set(x, "RowExpandable", value.asInstanceOf[js.Any])
    
    inline def setSortableHeaderCell(value: FC[TableSortableHeaderCellProps]): Self = StObject.set(x, "SortableHeaderCell", value.asInstanceOf[js.Any])
  }
}
