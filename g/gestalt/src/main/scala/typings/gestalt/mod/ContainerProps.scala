package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
}
object ContainerProps {
  
  inline def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
