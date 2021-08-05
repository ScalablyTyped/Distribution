package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanInformation extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var addOns: js.UndefOr[js.Array[/* Contains information about add ons. */ AddOn]] = js.undefined
  
  /**
    * Specifies the ISO currency code for the account.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var freeTrialDaysOverride: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var planFeatureSets: js.UndefOr[
    js.Array[
      /* This object provides details about a feature set, or add-on product that is associated with an account. It is reserved for DocuSign internal use only. */ FeatureSet
    ]
  ] = js.undefined
  
  /**
    * DocuSign's id for the account plan.
    */
  var planId: js.UndefOr[String] = js.undefined
  
  var recipientDomains: js.UndefOr[js.Array[RecipientDomain]] = js.undefined
}
object PlanInformation {
  
  inline def apply(): PlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanInformation]
  }
  
  extension [Self <: PlanInformation](x: Self) {
    
    inline def setAddOns(value: js.Array[/* Contains information about add ons. */ AddOn]): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    inline def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    inline def setAddOnsVarargs(value: (/* Contains information about add ons. */ AddOn)*): Self = StObject.set(x, "addOns", js.Array(value :_*))
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setFreeTrialDaysOverride(value: String): Self = StObject.set(x, "freeTrialDaysOverride", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialDaysOverrideUndefined: Self = StObject.set(x, "freeTrialDaysOverride", js.undefined)
    
    inline def setPlanFeatureSets(
      value: js.Array[
          /* This object provides details about a feature set, or add-on product that is associated with an account. It is reserved for DocuSign internal use only. */ FeatureSet
        ]
    ): Self = StObject.set(x, "planFeatureSets", value.asInstanceOf[js.Any])
    
    inline def setPlanFeatureSetsUndefined: Self = StObject.set(x, "planFeatureSets", js.undefined)
    
    inline def setPlanFeatureSetsVarargs(
      value: (/* This object provides details about a feature set, or add-on product that is associated with an account. It is reserved for DocuSign internal use only. */ FeatureSet)*
    ): Self = StObject.set(x, "planFeatureSets", js.Array(value :_*))
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    inline def setRecipientDomains(value: js.Array[RecipientDomain]): Self = StObject.set(x, "recipientDomains", value.asInstanceOf[js.Any])
    
    inline def setRecipientDomainsUndefined: Self = StObject.set(x, "recipientDomains", js.undefined)
    
    inline def setRecipientDomainsVarargs(value: RecipientDomain*): Self = StObject.set(x, "recipientDomains", js.Array(value :_*))
  }
}
