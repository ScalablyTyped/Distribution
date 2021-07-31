package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
}
object TableCellProps {
  
  @scala.inline
  def apply(): TableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellProps]
  }
  
  @scala.inline
  implicit class TableCellPropsMutableBuilder[Self <: TableCellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}
