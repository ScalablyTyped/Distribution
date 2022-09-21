package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionOfferTargeting extends StObject {
  
  /**
    * Offer targeting rule for new user acquisition.
    */
  var acquisitionRule: js.UndefOr[SchemaAcquisitionTargetingRule] = js.undefined
  
  /**
    * Offer targeting rule for upgrading users' existing plans.
    */
  var upgradeRule: js.UndefOr[SchemaUpgradeTargetingRule] = js.undefined
}
object SchemaSubscriptionOfferTargeting {
  
  inline def apply(): SchemaSubscriptionOfferTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionOfferTargeting]
  }
  
  extension [Self <: SchemaSubscriptionOfferTargeting](x: Self) {
    
    inline def setAcquisitionRule(value: SchemaAcquisitionTargetingRule): Self = StObject.set(x, "acquisitionRule", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionRuleUndefined: Self = StObject.set(x, "acquisitionRule", js.undefined)
    
    inline def setUpgradeRule(value: SchemaUpgradeTargetingRule): Self = StObject.set(x, "upgradeRule", value.asInstanceOf[js.Any])
    
    inline def setUpgradeRuleUndefined: Self = StObject.set(x, "upgradeRule", js.undefined)
  }
}
