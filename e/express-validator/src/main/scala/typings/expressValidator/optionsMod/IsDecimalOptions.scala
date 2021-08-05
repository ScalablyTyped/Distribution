package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDecimalOptions extends StObject {
  
  var decimal_digits: js.UndefOr[String] = js.undefined
  
  var force_decimal: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[AlphanumericLocale] = js.undefined
}
object IsDecimalOptions {
  
  inline def apply(): IsDecimalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDecimalOptions]
  }
  
  extension [Self <: IsDecimalOptions](x: Self) {
    
    inline def setDecimal_digits(value: String): Self = StObject.set(x, "decimal_digits", value.asInstanceOf[js.Any])
    
    inline def setDecimal_digitsUndefined: Self = StObject.set(x, "decimal_digits", js.undefined)
    
    inline def setForce_decimal(value: Boolean): Self = StObject.set(x, "force_decimal", value.asInstanceOf[js.Any])
    
    inline def setForce_decimalUndefined: Self = StObject.set(x, "force_decimal", js.undefined)
    
    inline def setLocale(value: AlphanumericLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
