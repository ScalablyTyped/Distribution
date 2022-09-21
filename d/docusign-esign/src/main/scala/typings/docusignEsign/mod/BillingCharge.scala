package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingCharge extends StObject {
  
  /**
    * Reserved: TBD
    */
  var allowedQuantity: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var blocked: js.UndefOr[String] = js.undefined
  
  /**
    * Provides information on what services the charge item is for.
    *
    * The following table provides a description of the different chargeName values available at this time.
    *
    * | chargeName | Description |
    * | --- | --- |
    * | id_check | ID Check Charge |
    * | in_person_signing | In Person Signing charge |
    * | envelopes Included | Sent Envelopes for the account |
    * | age_verify | Age verification check |
    * | ofac | OFAC Check |
    * | id_confirm | ID confirmation check |
    * | student_authentication | STAN PIN authentication check |
    * | wet_sign_fax | Pages for returning signed documents by fax |
    * | attachment_fax | Pages for returning attachments by fax |
    * | phone_authentication | Phone authentication charge |
    * | powerforms | PowerForm envelopes sent |
    * | signer_payments | Payment processing charge |
    * | outbound_fax | Send by fax charge |
    * | bulk_recipient_envelopes | Bulk Recipient Envelopes sent |
    * | sms_authentications | SMS authentication charge |
    * | saml_authentications | SAML authentication charge |
    * | express_signer_certificate | DocuSign Express Certificate charge |
    * | personal_signer_certificate | Personal Signer Certificate charge |
    * | safe_certificate | SAFE BioPharma Signer Certificate charge |
    * | seats | Included active seats charge |
    * | open_trust_certificate | OpenTrust Signer Certificate charge |
    */
  var chargeName: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var chargeType: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var chargeUnitOfMeasure: js.UndefOr[String] = js.undefined
  
  var discounts: js.UndefOr[js.Array[BillingDiscount]] = js.undefined
  
  var firstEffectiveDate: js.UndefOr[String] = js.undefined
  
  var includedQuantity: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var incrementalQuantity: js.UndefOr[String] = js.undefined
  
  var lastEffectiveDate: js.UndefOr[String] = js.undefined
  
  var prices: js.UndefOr[js.Array[BillingPrice]] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var unitPrice: js.UndefOr[String] = js.undefined
  
  var usedQuantity: js.UndefOr[String] = js.undefined
}
object BillingCharge {
  
  inline def apply(): BillingCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingCharge]
  }
  
  extension [Self <: BillingCharge](x: Self) {
    
    inline def setAllowedQuantity(value: String): Self = StObject.set(x, "allowedQuantity", value.asInstanceOf[js.Any])
    
    inline def setAllowedQuantityUndefined: Self = StObject.set(x, "allowedQuantity", js.undefined)
    
    inline def setBlocked(value: String): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setChargeName(value: String): Self = StObject.set(x, "chargeName", value.asInstanceOf[js.Any])
    
    inline def setChargeNameUndefined: Self = StObject.set(x, "chargeName", js.undefined)
    
    inline def setChargeType(value: String): Self = StObject.set(x, "chargeType", value.asInstanceOf[js.Any])
    
    inline def setChargeTypeUndefined: Self = StObject.set(x, "chargeType", js.undefined)
    
    inline def setChargeUnitOfMeasure(value: String): Self = StObject.set(x, "chargeUnitOfMeasure", value.asInstanceOf[js.Any])
    
    inline def setChargeUnitOfMeasureUndefined: Self = StObject.set(x, "chargeUnitOfMeasure", js.undefined)
    
    inline def setDiscounts(value: js.Array[BillingDiscount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: BillingDiscount*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setFirstEffectiveDate(value: String): Self = StObject.set(x, "firstEffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setFirstEffectiveDateUndefined: Self = StObject.set(x, "firstEffectiveDate", js.undefined)
    
    inline def setIncludedQuantity(value: String): Self = StObject.set(x, "includedQuantity", value.asInstanceOf[js.Any])
    
    inline def setIncludedQuantityUndefined: Self = StObject.set(x, "includedQuantity", js.undefined)
    
    inline def setIncrementalQuantity(value: String): Self = StObject.set(x, "incrementalQuantity", value.asInstanceOf[js.Any])
    
    inline def setIncrementalQuantityUndefined: Self = StObject.set(x, "incrementalQuantity", js.undefined)
    
    inline def setLastEffectiveDate(value: String): Self = StObject.set(x, "lastEffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setLastEffectiveDateUndefined: Self = StObject.set(x, "lastEffectiveDate", js.undefined)
    
    inline def setPrices(value: js.Array[BillingPrice]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    inline def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
    
    inline def setPricesVarargs(value: BillingPrice*): Self = StObject.set(x, "prices", js.Array(value*))
    
    inline def setUnitPrice(value: String): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def setUsedQuantity(value: String): Self = StObject.set(x, "usedQuantity", value.asInstanceOf[js.Any])
    
    inline def setUsedQuantityUndefined: Self = StObject.set(x, "usedQuantity", js.undefined)
  }
}
