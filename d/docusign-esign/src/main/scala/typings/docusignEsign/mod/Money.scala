package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Money extends StObject {
  
  /**
    * The total payment amount
    * in the currency's base unit.
    * For example, for USD
    * the base currency is one cent.
    *
    */
  var amountInBaseUnit: js.UndefOr[String] = js.undefined
  
  /**
    * The three-letter
    * [ISO 4217][ISO4217] currency code for the payment.
    *
    * For example:
    *
    * * AUD Australian dollar
    * * CAD Canadian dollar
    * * EUR Euro
    * * GBP Great Britain pound
    * * USD United States dollar
    *
    * This is a read-only property.
    *
    * [ISO4217]:          https://en.wikipedia.org/wiki/ISO_4217
    *
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * The payment amount as displayed
    * in the `currency`.
    *
    * For example, if the payment amount
    * is USD 12.59,
    * the `amountInBaseUnit` is 1259 (cents),
    * and the displayed amount is `$12.59 USD`.
    *
    * This is a read-only property.
    *
    */
  var displayAmount: js.UndefOr[String] = js.undefined
}
object Money {
  
  @scala.inline
  def apply(): Money = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Money]
  }
  
  @scala.inline
  implicit class MoneyMutableBuilder[Self <: Money] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountInBaseUnit(value: String): Self = StObject.set(x, "amountInBaseUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountInBaseUnitUndefined: Self = StObject.set(x, "amountInBaseUnit", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDisplayAmount(value: String): Self = StObject.set(x, "displayAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAmountUndefined: Self = StObject.set(x, "displayAmount", js.undefined)
  }
}
