package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListBylineProps> */
trait PartialListBylineProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var cssNamespace: js.UndefOr[String] = js.undefined
  
  var twoColumns: js.UndefOr[Boolean] = js.undefined
}
object PartialListBylineProps {
  
  inline def apply(): PartialListBylineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListBylineProps]
  }
  
  extension [Self <: PartialListBylineProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCssNamespace(value: String): Self = StObject.set(x, "cssNamespace", value.asInstanceOf[js.Any])
    
    inline def setCssNamespaceUndefined: Self = StObject.set(x, "cssNamespace", js.undefined)
    
    inline def setTwoColumns(value: Boolean): Self = StObject.set(x, "twoColumns", value.asInstanceOf[js.Any])
    
    inline def setTwoColumnsUndefined: Self = StObject.set(x, "twoColumns", js.undefined)
  }
}
