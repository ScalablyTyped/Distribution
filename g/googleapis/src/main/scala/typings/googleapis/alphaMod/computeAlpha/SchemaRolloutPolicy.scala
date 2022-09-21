package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRolloutPolicy extends StObject {
  
  /**
    * An optional RFC3339 timestamp on or after which the update is considered rolled out to any zone that is not explicitly stated.
    */
  var defaultRolloutTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location based rollout policies to apply to the resource. Currently only zone names are supported and must be represented as valid URLs, like: zones/us-central1-a. The value expects an RFC3339 timestamp on or after which the update is considered rolled out to the specified location.
    */
  var locationRolloutPolicies: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaRolloutPolicy {
  
  inline def apply(): SchemaRolloutPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRolloutPolicy]
  }
  
  extension [Self <: SchemaRolloutPolicy](x: Self) {
    
    inline def setDefaultRolloutTime(value: String): Self = StObject.set(x, "defaultRolloutTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultRolloutTimeNull: Self = StObject.set(x, "defaultRolloutTime", null)
    
    inline def setDefaultRolloutTimeUndefined: Self = StObject.set(x, "defaultRolloutTime", js.undefined)
    
    inline def setLocationRolloutPolicies(value: StringDictionary[String]): Self = StObject.set(x, "locationRolloutPolicies", value.asInstanceOf[js.Any])
    
    inline def setLocationRolloutPoliciesNull: Self = StObject.set(x, "locationRolloutPolicies", null)
    
    inline def setLocationRolloutPoliciesUndefined: Self = StObject.set(x, "locationRolloutPolicies", js.undefined)
  }
}
