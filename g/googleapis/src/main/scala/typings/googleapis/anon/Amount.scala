package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amount extends StObject {
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var currencyCode: js.UndefOr[String] = js.undefined
}
object Amount {
  
  @scala.inline
  def apply(): Amount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amount]
  }
  
  @scala.inline
  implicit class AmountMutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
  }
}
