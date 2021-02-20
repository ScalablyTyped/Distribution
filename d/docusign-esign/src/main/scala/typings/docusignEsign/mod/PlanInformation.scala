package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanInformation extends StObject {
  
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
  implicit class PlanInformationMutableBuilder[Self <: PlanInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOns(value: js.Array[/* Contains information about add ons. */ AddOn]): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    @scala.inline
    def setAddOnsVarargs(value: (/* Contains information about add ons. */ AddOn)*): Self = StObject.set(x, "addOns", js.Array(value :_*))
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setFreeTrialDaysOverride(value: String): Self = StObject.set(x, "freeTrialDaysOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeTrialDaysOverrideUndefined: Self = StObject.set(x, "freeTrialDaysOverride", js.undefined)
    
    @scala.inline
    def setPlanFeatureSets(
      value: js.Array[
          /* This object provides details about a feature set, or add-on product that is associated with an account. It is reserved for DocuSign internal use only. */ FeatureSet
        ]
    ): Self = StObject.set(x, "planFeatureSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanFeatureSetsUndefined: Self = StObject.set(x, "planFeatureSets", js.undefined)
    
    @scala.inline
    def setPlanFeatureSetsVarargs(
      value: (/* This object provides details about a feature set, or add-on product that is associated with an account. It is reserved for DocuSign internal use only. */ FeatureSet)*
    ): Self = StObject.set(x, "planFeatureSets", js.Array(value :_*))
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    @scala.inline
    def setRecipientDomains(value: js.Array[RecipientDomain]): Self = StObject.set(x, "recipientDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientDomainsUndefined: Self = StObject.set(x, "recipientDomains", js.undefined)
    
    @scala.inline
    def setRecipientDomainsVarargs(value: RecipientDomain*): Self = StObject.set(x, "recipientDomains", js.Array(value :_*))
  }
}
