package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHeaderProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var sticky: js.UndefOr[Boolean] = js.undefined
}
object TableHeaderProps {
  
  inline def apply(): TableHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderProps]
  }
  
  extension [Self <: TableHeaderProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
