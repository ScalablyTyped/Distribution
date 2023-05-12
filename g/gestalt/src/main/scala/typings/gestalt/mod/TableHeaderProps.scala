package typings.gestalt.mod

import typings.gestalt.gestaltStrings.tableHeaderGroup
import typings.gestalt.gestaltStrings.visuallyHidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHeaderProps extends StObject {
  
  var children: Node
  
  var display: js.UndefOr[tableHeaderGroup | visuallyHidden] = js.undefined
  
  var sticky: js.UndefOr[Boolean] = js.undefined
}
object TableHeaderProps {
  
  inline def apply(): TableHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisplay(value: tableHeaderGroup | visuallyHidden): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
