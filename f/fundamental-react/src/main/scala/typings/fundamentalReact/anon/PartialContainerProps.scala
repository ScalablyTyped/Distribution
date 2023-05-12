package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Container/Container.ContainerProps> */
trait PartialContainerProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var noGap: js.UndefOr[Boolean] = js.undefined
}
object PartialContainerProps {
  
  inline def apply(): PartialContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialContainerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setNoGap(value: Boolean): Self = StObject.set(x, "noGap", value.asInstanceOf[js.Any])
    
    inline def setNoGapUndefined: Self = StObject.set(x, "noGap", js.undefined)
  }
}
