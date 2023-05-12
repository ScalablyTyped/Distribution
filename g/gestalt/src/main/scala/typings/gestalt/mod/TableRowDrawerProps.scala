package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowDrawerProps extends StObject {
  
  var children: Node
  
  var drawerContents: Node
  
  var id: String
}
object TableRowDrawerProps {
  
  inline def apply(id: String): TableRowDrawerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowDrawerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRowDrawerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDrawerContents(value: Node): Self = StObject.set(x, "drawerContents", value.asInstanceOf[js.Any])
    
    inline def setDrawerContentsUndefined: Self = StObject.set(x, "drawerContents", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
