package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanInformation extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var addOns: js.UndefOr[js.Array[/* Contains information about add ons. */ AddOn]] = js.native
  
  /**
    * Specifies the ISO currency code for the account.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var freeTrialDaysOverride: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var planFeatureSets: js.UndefOr[
    js.Array[
      /* This object provides details about a feature set, or add-on product that is associated with an account. It is reserved for DocuSign internal use only. */ FeatureSet
    ]
  ] = js.native
  
  /**
    * DocuSign's id for the account plan.
    */
  var planId: js.UndefOr[String] = js.native
  
  var recipientDomains: js.UndefOr[js.Array[RecipientDomain]] = js.native
}
object PlanInformation {
  
  @scala.inline
  def apply(): PlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanInformation]
  }
  
  @scala.inline
  implicit class PlanInformationOps[Self <: PlanInformation] (val x: Self) extends AnyVal {
    
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
    def setAddOnsVarargs(value: (/* Contains information about add ons. */ AddOn)*): Self = this.set("addOns", js.Array(value :_*))
    
    @scala.inline
    def setAddOns(value: js.Array[/* Contains information about add ons. */ AddOn]): Self = this.set("addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOns: Self = this.set("addOns", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setFreeTrialDaysOverride(value: String): Self = this.set("freeTrialDaysOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeTrialDaysOverride: Self = this.set("freeTrialDaysOverride", js.undefined)
    
    @scala.inline
    def setPlanFeatureSetsVarargs(
      value: (/* This object provides details about a feature set, or add-on product that is associated with an account. It is reserved for DocuSign internal use only. */ FeatureSet)*
    ): Self = this.set("planFeatureSets", js.Array(value :_*))
    
    @scala.inline
    def setPlanFeatureSets(
      value: js.Array[
          /* This object provides details about a feature set, or add-on product that is associated with an account. It is reserved for DocuSign internal use only. */ FeatureSet
        ]
    ): Self = this.set("planFeatureSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanFeatureSets: Self = this.set("planFeatureSets", js.undefined)
    
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanId: Self = this.set("planId", js.undefined)
    
    @scala.inline
    def setRecipientDomainsVarargs(value: RecipientDomain*): Self = this.set("recipientDomains", js.Array(value :_*))
    
    @scala.inline
    def setRecipientDomains(value: js.Array[RecipientDomain]): Self = this.set("recipientDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientDomains: Self = this.set("recipientDomains", js.undefined)
  }
}
