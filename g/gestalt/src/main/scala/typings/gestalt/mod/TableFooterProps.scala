package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFooterProps extends StObject {
  
  var children: Node
  
  var sticky: js.UndefOr[Boolean] = js.undefined
}
object TableFooterProps {
  
  inline def apply(): TableFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFooterProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFooterProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
