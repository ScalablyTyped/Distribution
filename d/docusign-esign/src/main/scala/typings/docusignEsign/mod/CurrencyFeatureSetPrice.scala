package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencyFeatureSetPrice extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var currencySymbol: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var envelopeFee: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var fixedFee: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var seatFee: js.UndefOr[String] = js.undefined
}
object CurrencyFeatureSetPrice {
  
  @scala.inline
  def apply(): CurrencyFeatureSetPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyFeatureSetPrice]
  }
  
  @scala.inline
  implicit class CurrencyFeatureSetPriceMutableBuilder[Self <: CurrencyFeatureSetPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
    
    @scala.inline
    def setEnvelopeFee(value: String): Self = StObject.set(x, "envelopeFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeFeeUndefined: Self = StObject.set(x, "envelopeFee", js.undefined)
    
    @scala.inline
    def setFixedFee(value: String): Self = StObject.set(x, "fixedFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedFeeUndefined: Self = StObject.set(x, "fixedFee", js.undefined)
    
    @scala.inline
    def setSeatFee(value: String): Self = StObject.set(x, "seatFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeatFeeUndefined: Self = StObject.set(x, "seatFee", js.undefined)
  }
}
