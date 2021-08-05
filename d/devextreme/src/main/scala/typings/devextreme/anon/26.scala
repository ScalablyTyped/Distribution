package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var value: js.UndefOr[typings.std.Date | Double] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setValue(value: typings.std.Date | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
