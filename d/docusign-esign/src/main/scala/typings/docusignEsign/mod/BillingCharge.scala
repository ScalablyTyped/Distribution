package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingCharge extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var allowedQuantity: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var blocked: js.UndefOr[String] = js.native
  
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
  var chargeName: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var chargeType: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var chargeUnitOfMeasure: js.UndefOr[String] = js.native
  
  var discounts: js.UndefOr[js.Array[BillingDiscount]] = js.native
  
  var firstEffectiveDate: js.UndefOr[String] = js.native
  
  var includedQuantity: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var incrementalQuantity: js.UndefOr[String] = js.native
  
  var lastEffectiveDate: js.UndefOr[String] = js.native
  
  var prices: js.UndefOr[js.Array[BillingPrice]] = js.native
  
  /**
    * Reserved: TBD
    */
  var unitPrice: js.UndefOr[String] = js.native
  
  var usedQuantity: js.UndefOr[String] = js.native
}
object BillingCharge {
  
  @scala.inline
  def apply(): BillingCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingCharge]
  }
  
  @scala.inline
  implicit class BillingChargeOps[Self <: BillingCharge] (val x: Self) extends AnyVal {
    
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
    def setAllowedQuantity(value: String): Self = this.set("allowedQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedQuantity: Self = this.set("allowedQuantity", js.undefined)
    
    @scala.inline
    def setBlocked(value: String): Self = this.set("blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocked: Self = this.set("blocked", js.undefined)
    
    @scala.inline
    def setChargeName(value: String): Self = this.set("chargeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeName: Self = this.set("chargeName", js.undefined)
    
    @scala.inline
    def setChargeType(value: String): Self = this.set("chargeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeType: Self = this.set("chargeType", js.undefined)
    
    @scala.inline
    def setChargeUnitOfMeasure(value: String): Self = this.set("chargeUnitOfMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeUnitOfMeasure: Self = this.set("chargeUnitOfMeasure", js.undefined)
    
    @scala.inline
    def setDiscountsVarargs(value: BillingDiscount*): Self = this.set("discounts", js.Array(value :_*))
    
    @scala.inline
    def setDiscounts(value: js.Array[BillingDiscount]): Self = this.set("discounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscounts: Self = this.set("discounts", js.undefined)
    
    @scala.inline
    def setFirstEffectiveDate(value: String): Self = this.set("firstEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstEffectiveDate: Self = this.set("firstEffectiveDate", js.undefined)
    
    @scala.inline
    def setIncludedQuantity(value: String): Self = this.set("includedQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedQuantity: Self = this.set("includedQuantity", js.undefined)
    
    @scala.inline
    def setIncrementalQuantity(value: String): Self = this.set("incrementalQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementalQuantity: Self = this.set("incrementalQuantity", js.undefined)
    
    @scala.inline
    def setLastEffectiveDate(value: String): Self = this.set("lastEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEffectiveDate: Self = this.set("lastEffectiveDate", js.undefined)
    
    @scala.inline
    def setPricesVarargs(value: BillingPrice*): Self = this.set("prices", js.Array(value :_*))
    
    @scala.inline
    def setPrices(value: js.Array[BillingPrice]): Self = this.set("prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrices: Self = this.set("prices", js.undefined)
    
    @scala.inline
    def setUnitPrice(value: String): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
    
    @scala.inline
    def setUsedQuantity(value: String): Self = this.set("usedQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedQuantity: Self = this.set("usedQuantity", js.undefined)
  }
}
