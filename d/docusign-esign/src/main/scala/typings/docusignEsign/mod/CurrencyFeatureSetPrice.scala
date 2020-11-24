package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyFeatureSetPrice extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var currencySymbol: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var envelopeFee: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var fixedFee: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var seatFee: js.UndefOr[String] = js.native
}
object CurrencyFeatureSetPrice {
  
  @scala.inline
  def apply(): CurrencyFeatureSetPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyFeatureSetPrice]
  }
  
  @scala.inline
  implicit class CurrencyFeatureSetPriceOps[Self <: CurrencyFeatureSetPrice] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setCurrencySymbol(value: String): Self = this.set("currencySymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencySymbol: Self = this.set("currencySymbol", js.undefined)
    
    @scala.inline
    def setEnvelopeFee(value: String): Self = this.set("envelopeFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeFee: Self = this.set("envelopeFee", js.undefined)
    
    @scala.inline
    def setFixedFee(value: String): Self = this.set("fixedFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedFee: Self = this.set("fixedFee", js.undefined)
    
    @scala.inline
    def setSeatFee(value: String): Self = this.set("seatFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeatFee: Self = this.set("seatFee", js.undefined)
  }
}
