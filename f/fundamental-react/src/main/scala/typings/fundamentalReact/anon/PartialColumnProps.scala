package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.after
import typings.fundamentalReact.fundamentalReactStrings.before
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Column/Column.ColumnProps> */
trait PartialColumnProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var full: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var offsetPosition: js.UndefOr[before | after] = js.undefined
  
  var span: js.UndefOr[Double] = js.undefined
}
object PartialColumnProps {
  
  inline def apply(): PartialColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColumnProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialColumnProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetPosition(value: before | after): Self = StObject.set(x, "offsetPosition", value.asInstanceOf[js.Any])
    
    inline def setOffsetPositionUndefined: Self = StObject.set(x, "offsetPosition", js.undefined)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
