package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencyPlanPrice extends StObject {
  
  /**
    * Specifies the ISO currency code for the account.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the currency symbol for the account.
    */
  var currencySymbol: js.UndefOr[String] = js.undefined
  
  /**
    * The per-seat price associated with the plan.
    *
    * Example: `"456.0000"`
    */
  var perSeatPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The support incident fee charged for each support incident.
    *
    * Example: `"$0.00"`
    */
  var supportIncidentFee: js.UndefOr[String] = js.undefined
  
  /**
    * The support plan fee charged for this plan.
    *
    * Example: `"$0.00"`
    */
  var supportPlanFee: js.UndefOr[String] = js.undefined
  
  /**
    * A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Bahasa Indonesia (id),
    * Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en),
    * English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu),
    * Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR),
    * Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr),
    * Ukrainian (uk) and Vietnamese (vi).
    */
  var supportedCardTypes: js.UndefOr[CreditCardTypes] = js.undefined
}
object CurrencyPlanPrice {
  
  @scala.inline
  def apply(): CurrencyPlanPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyPlanPrice]
  }
  
  @scala.inline
  implicit class CurrencyPlanPriceMutableBuilder[Self <: CurrencyPlanPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySymbolUndefined: Self = StObject.set(x, "currencySymbol", js.undefined)
    
    @scala.inline
    def setPerSeatPrice(value: String): Self = StObject.set(x, "perSeatPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerSeatPriceUndefined: Self = StObject.set(x, "perSeatPrice", js.undefined)
    
    @scala.inline
    def setSupportIncidentFee(value: String): Self = StObject.set(x, "supportIncidentFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportIncidentFeeUndefined: Self = StObject.set(x, "supportIncidentFee", js.undefined)
    
    @scala.inline
    def setSupportPlanFee(value: String): Self = StObject.set(x, "supportPlanFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportPlanFeeUndefined: Self = StObject.set(x, "supportPlanFee", js.undefined)
    
    @scala.inline
    def setSupportedCardTypes(value: CreditCardTypes): Self = StObject.set(x, "supportedCardTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCardTypesUndefined: Self = StObject.set(x, "supportedCardTypes", js.undefined)
  }
}
