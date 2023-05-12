package typings.expressValidator.srcOptionsMod

import typings.expressValidator.expressValidatorStrings.amex
import typings.expressValidator.expressValidatorStrings.dinersclub
import typings.expressValidator.expressValidatorStrings.discover
import typings.expressValidator.expressValidatorStrings.jcb
import typings.expressValidator.expressValidatorStrings.mastercard
import typings.expressValidator.expressValidatorStrings.unionpay
import typings.expressValidator.expressValidatorStrings.visa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCreditCard extends StObject {
  
  var provider: js.UndefOr[amex | dinersclub | discover | jcb | mastercard | unionpay | visa] = js.undefined
}
object IsCreditCard {
  
  inline def apply(): IsCreditCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCreditCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsCreditCard] (val x: Self) extends AnyVal {
    
    inline def setProvider(value: amex | dinersclub | discover | jcb | mastercard | unionpay | visa): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
