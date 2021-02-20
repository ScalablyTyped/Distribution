package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsDecimalOptions extends StObject {
  
  var decimal_digits: js.UndefOr[String] = js.native
  
  var force_decimal: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[AlphanumericLocale] = js.native
}
object IsDecimalOptions {
  
  @scala.inline
  def apply(): IsDecimalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDecimalOptions]
  }
  
  @scala.inline
  implicit class IsDecimalOptionsMutableBuilder[Self <: IsDecimalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimal_digits(value: String): Self = StObject.set(x, "decimal_digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimal_digitsUndefined: Self = StObject.set(x, "decimal_digits", js.undefined)
    
    @scala.inline
    def setForce_decimal(value: Boolean): Self = StObject.set(x, "force_decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce_decimalUndefined: Self = StObject.set(x, "force_decimal", js.undefined)
    
    @scala.inline
    def setLocale(value: AlphanumericLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
