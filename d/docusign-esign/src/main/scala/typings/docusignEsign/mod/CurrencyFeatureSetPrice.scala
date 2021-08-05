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
  
  inline def apply(): CurrencyFeatureSetPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyFeatureSetPrice]
  }
  
  extension [Self <: CurrencyFeatureSetPrice](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
    
    inline def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
    
    inline def setEnvelopeFee(value: String): Self = StObject.set(x, "envelopeFee", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeFeeUndefined: Self = StObject.set(x, "envelopeFee", js.undefined)
    
    inline def setFixedFee(value: String): Self = StObject.set(x, "fixedFee", value.asInstanceOf[js.Any])
    
    inline def setFixedFeeUndefined: Self = StObject.set(x, "fixedFee", js.undefined)
    
    inline def setSeatFee(value: String): Self = StObject.set(x, "seatFee", value.asInstanceOf[js.Any])
    
    inline def setSeatFeeUndefined: Self = StObject.set(x, "seatFee", js.undefined)
  }
}
