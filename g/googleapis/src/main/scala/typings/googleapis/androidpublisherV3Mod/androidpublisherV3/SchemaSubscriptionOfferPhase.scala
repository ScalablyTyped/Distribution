package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscriptionOfferPhase extends StObject {
  
  /**
    * Required. The duration of a single recurrence of this phase. Specified in ISO 8601 format.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pricing information for any new locations Play may launch in.
    */
  var otherRegionsConfig: js.UndefOr[SchemaOtherRegionsSubscriptionOfferPhaseConfig] = js.undefined
  
  /**
    * Required. The number of times this phase repeats. If this offer phase is not free, each recurrence charges the user the price of this offer phase.
    */
  var recurrenceCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The region-specific configuration of this offer phase. This list must contain exactly one entry for each region for which the subscription offer has a regional config.
    */
  var regionalConfigs: js.UndefOr[js.Array[SchemaRegionalSubscriptionOfferPhaseConfig]] = js.undefined
}
object SchemaSubscriptionOfferPhase {
  
  inline def apply(): SchemaSubscriptionOfferPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionOfferPhase]
  }
  
  extension [Self <: SchemaSubscriptionOfferPhase](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOtherRegionsConfig(value: SchemaOtherRegionsSubscriptionOfferPhaseConfig): Self = StObject.set(x, "otherRegionsConfig", value.asInstanceOf[js.Any])
    
    inline def setOtherRegionsConfigUndefined: Self = StObject.set(x, "otherRegionsConfig", js.undefined)
    
    inline def setRecurrenceCount(value: Double): Self = StObject.set(x, "recurrenceCount", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceCountNull: Self = StObject.set(x, "recurrenceCount", null)
    
    inline def setRecurrenceCountUndefined: Self = StObject.set(x, "recurrenceCount", js.undefined)
    
    inline def setRegionalConfigs(value: js.Array[SchemaRegionalSubscriptionOfferPhaseConfig]): Self = StObject.set(x, "regionalConfigs", value.asInstanceOf[js.Any])
    
    inline def setRegionalConfigsUndefined: Self = StObject.set(x, "regionalConfigs", js.undefined)
    
    inline def setRegionalConfigsVarargs(value: SchemaRegionalSubscriptionOfferPhaseConfig*): Self = StObject.set(x, "regionalConfigs", js.Array(value*))
  }
}
