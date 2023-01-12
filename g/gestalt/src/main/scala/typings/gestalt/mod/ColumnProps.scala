package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var lgSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var mdSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var smSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var span: UnsignedUpTo12
}
object ColumnProps {
  
  inline def apply(span: UnsignedUpTo12): ColumnProps = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLgSpan(value: UnsignedUpTo12): Self = StObject.set(x, "lgSpan", value.asInstanceOf[js.Any])
    
    inline def setLgSpanUndefined: Self = StObject.set(x, "lgSpan", js.undefined)
    
    inline def setMdSpan(value: UnsignedUpTo12): Self = StObject.set(x, "mdSpan", value.asInstanceOf[js.Any])
    
    inline def setMdSpanUndefined: Self = StObject.set(x, "mdSpan", js.undefined)
    
    inline def setSmSpan(value: UnsignedUpTo12): Self = StObject.set(x, "smSpan", value.asInstanceOf[js.Any])
    
    inline def setSmSpanUndefined: Self = StObject.set(x, "smSpan", js.undefined)
    
    inline def setSpan(value: UnsignedUpTo12): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
