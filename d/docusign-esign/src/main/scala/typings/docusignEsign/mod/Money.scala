package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Money extends js.Object {
  
  /**
    * The total payment amount
    * in the currency's base unit.
    * For example, for USD
    * the base currency is one cent.
    *
    */
  var amountInBaseUnit: js.UndefOr[String] = js.native
  
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
  var currency: js.UndefOr[String] = js.native
  
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
  var displayAmount: js.UndefOr[String] = js.native
}
object Money {
  
  @scala.inline
  def apply(): Money = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Money]
  }
  
  @scala.inline
  implicit class MoneyOps[Self <: Money] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmountInBaseUnit(value: String): Self = this.set("amountInBaseUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmountInBaseUnit: Self = this.set("amountInBaseUnit", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDisplayAmount(value: String): Self = this.set("displayAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAmount: Self = this.set("displayAmount", js.undefined)
  }
}
