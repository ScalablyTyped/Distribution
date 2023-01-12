package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColProps extends StObject {
  
  var minWidth: js.UndefOr[CssDimValue] = js.undefined
  
  var span: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[CssDimValue] = js.undefined
}
object ColProps {
  
  inline def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColProps] (val x: Self) extends AnyVal {
    
    inline def setMinWidth(value: CssDimValue): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setWidth(value: CssDimValue): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
