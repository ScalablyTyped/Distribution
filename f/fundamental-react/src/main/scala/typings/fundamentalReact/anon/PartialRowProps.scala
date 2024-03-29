package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Row/Row.RowProps> */
trait PartialRowProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
}
object PartialRowProps {
  
  inline def apply(): PartialRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRowProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRowProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
