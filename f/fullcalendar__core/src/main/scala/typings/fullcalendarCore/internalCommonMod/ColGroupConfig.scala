package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColGroupConfig extends StObject {
  
  var cols: js.Array[ColProps]
  
  var width: js.UndefOr[CssDimValue] = js.undefined
}
object ColGroupConfig {
  
  inline def apply(cols: js.Array[ColProps]): ColGroupConfig = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColGroupConfig] (val x: Self) extends AnyVal {
    
    inline def setCols(value: js.Array[ColProps]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsVarargs(value: ColProps*): Self = StObject.set(x, "cols", js.Array(value*))
    
    inline def setWidth(value: CssDimValue): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
