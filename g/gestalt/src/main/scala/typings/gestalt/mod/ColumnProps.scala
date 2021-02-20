package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var lgSpan: js.UndefOr[UnsignedUpTo12] = js.native
  
  var mdSpan: js.UndefOr[UnsignedUpTo12] = js.native
  
  var smSpan: js.UndefOr[UnsignedUpTo12] = js.native
  
  var span: UnsignedUpTo12 = js.native
}
object ColumnProps {
  
  @scala.inline
  def apply(span: UnsignedUpTo12): ColumnProps = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
  
  @scala.inline
  implicit class ColumnPropsMutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setLgSpan(value: UnsignedUpTo12): Self = StObject.set(x, "lgSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLgSpanUndefined: Self = StObject.set(x, "lgSpan", js.undefined)
    
    @scala.inline
    def setMdSpan(value: UnsignedUpTo12): Self = StObject.set(x, "mdSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdSpanUndefined: Self = StObject.set(x, "mdSpan", js.undefined)
    
    @scala.inline
    def setSmSpan(value: UnsignedUpTo12): Self = StObject.set(x, "smSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmSpanUndefined: Self = StObject.set(x, "smSpan", js.undefined)
    
    @scala.inline
    def setSpan(value: UnsignedUpTo12): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
