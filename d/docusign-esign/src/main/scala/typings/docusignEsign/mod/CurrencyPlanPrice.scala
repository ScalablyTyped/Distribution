package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyPlanPrice extends js.Object {
  
  /**
    * Specifies the ISO currency code for the account.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * Specifies the currency symbol for the account.
    */
  var currencySymbol: js.UndefOr[String] = js.native
  
  /**
    * The per-seat price associated with the plan.
    *
    * Example: `"456.0000"`
    */
  var perSeatPrice: js.UndefOr[String] = js.native
  
  /**
    * The support incident fee charged for each support incident.
    *
    * Example: `"$0.00"`
    */
  var supportIncidentFee: js.UndefOr[String] = js.native
  
  /**
    * The support plan fee charged for this plan.
    *
    * Example: `"$0.00"`
    */
  var supportPlanFee: js.UndefOr[String] = js.native
  
  /**
    * A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Bahasa Indonesia (id),
    * Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en),
    * English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu),
    * Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR),
    * Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr),
    * Ukrainian (uk) and Vietnamese (vi).
    */
  var supportedCardTypes: js.UndefOr[CreditCardTypes] = js.native
}
object CurrencyPlanPrice {
  
  @scala.inline
  def apply(): CurrencyPlanPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyPlanPrice]
  }
  
  @scala.inline
  implicit class CurrencyPlanPriceOps[Self <: CurrencyPlanPrice] (val x: Self) extends AnyVal {
    
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
    def setPerSeatPrice(value: String): Self = this.set("perSeatPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerSeatPrice: Self = this.set("perSeatPrice", js.undefined)
    
    @scala.inline
    def setSupportIncidentFee(value: String): Self = this.set("supportIncidentFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportIncidentFee: Self = this.set("supportIncidentFee", js.undefined)
    
    @scala.inline
    def setSupportPlanFee(value: String): Self = this.set("supportPlanFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportPlanFee: Self = this.set("supportPlanFee", js.undefined)
    
    @scala.inline
    def setSupportedCardTypes(value: CreditCardTypes): Self = this.set("supportedCardTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCardTypes: Self = this.set("supportedCardTypes", js.undefined)
  }
}
