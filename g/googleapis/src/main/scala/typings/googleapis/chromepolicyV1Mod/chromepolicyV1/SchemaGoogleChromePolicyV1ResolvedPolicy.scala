package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1ResolvedPolicy extends StObject {
  
  /**
    * Output only. The added source key establishes at which level an entity was explicitly added for management. This is useful for certain type of policies that are only applied if they are explicitly added for management. For example: apps and networks. An entity can only be deleted from management in an Organizational Unit that it was explicitly added to. If this is not present it means that the policy is managed without the need to explicitly add an entity, for example: standard user or device policies.
    */
  var addedSourceKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
  
  /**
    * Output only. The source resource from which this policy value is obtained. May be the same as `targetKey` if the policy is directly modified on the target, otherwise it would be another resource from which the policy gets its value (if applicable). If not present, the source is the default value for the customer.
    */
  var sourceKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
  
  /**
    * Output only. The target resource for which the resolved policy value applies.
    */
  var targetKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
  
  /**
    * Output only. The resolved value of the policy.
    */
  var value: js.UndefOr[SchemaGoogleChromePolicyV1PolicyValue] = js.undefined
}
object SchemaGoogleChromePolicyV1ResolvedPolicy {
  
  inline def apply(): SchemaGoogleChromePolicyV1ResolvedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1ResolvedPolicy]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1ResolvedPolicy](x: Self) {
    
    inline def setAddedSourceKey(value: SchemaGoogleChromePolicyV1PolicyTargetKey): Self = StObject.set(x, "addedSourceKey", value.asInstanceOf[js.Any])
    
    inline def setAddedSourceKeyUndefined: Self = StObject.set(x, "addedSourceKey", js.undefined)
    
    inline def setSourceKey(value: SchemaGoogleChromePolicyV1PolicyTargetKey): Self = StObject.set(x, "sourceKey", value.asInstanceOf[js.Any])
    
    inline def setSourceKeyUndefined: Self = StObject.set(x, "sourceKey", js.undefined)
    
    inline def setTargetKey(value: SchemaGoogleChromePolicyV1PolicyTargetKey): Self = StObject.set(x, "targetKey", value.asInstanceOf[js.Any])
    
    inline def setTargetKeyUndefined: Self = StObject.set(x, "targetKey", js.undefined)
    
    inline def setValue(value: SchemaGoogleChromePolicyV1PolicyValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
