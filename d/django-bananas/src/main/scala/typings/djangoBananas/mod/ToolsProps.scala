package typings.djangoBananas.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolsProps extends StObject {
  
  var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
}
object ToolsProps {
  
  inline def apply(): ToolsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolsProps]
  }
  
  extension [Self <: ToolsProps](x: Self) {
    
    inline def setChildren(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
