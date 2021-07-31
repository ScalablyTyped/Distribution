package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
}
object TableRowProps {
  
  @scala.inline
  def apply(): TableRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowProps]
  }
  
  @scala.inline
  implicit class TableRowPropsMutableBuilder[Self <: TableRowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
