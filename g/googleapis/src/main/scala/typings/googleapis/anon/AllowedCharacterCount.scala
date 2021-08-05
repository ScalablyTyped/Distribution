package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedCharacterCount extends StObject {
  
  var allowedCharacterCount: js.UndefOr[Double] = js.undefined
  
  var limitType: js.UndefOr[String] = js.undefined
  
  var remainingCharacterCount: js.UndefOr[Double] = js.undefined
}
object AllowedCharacterCount {
  
  inline def apply(): AllowedCharacterCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedCharacterCount]
  }
  
  extension [Self <: AllowedCharacterCount](x: Self) {
    
    inline def setAllowedCharacterCount(value: Double): Self = StObject.set(x, "allowedCharacterCount", value.asInstanceOf[js.Any])
    
    inline def setAllowedCharacterCountUndefined: Self = StObject.set(x, "allowedCharacterCount", js.undefined)
    
    inline def setLimitType(value: String): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
    
    inline def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
    
    inline def setRemainingCharacterCount(value: Double): Self = StObject.set(x, "remainingCharacterCount", value.asInstanceOf[js.Any])
    
    inline def setRemainingCharacterCountUndefined: Self = StObject.set(x, "remainingCharacterCount", js.undefined)
  }
}
