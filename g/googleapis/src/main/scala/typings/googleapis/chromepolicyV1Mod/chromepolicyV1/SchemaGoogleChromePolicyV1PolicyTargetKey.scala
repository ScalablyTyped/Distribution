package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1PolicyTargetKey extends StObject {
  
  /**
    * Map containing the additional target key name and value pairs used to further identify the target of the policy.
    */
  var additionalTargetKeys: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The target resource on which this policy is applied. The following resources are supported: * Organizational Unit ("orgunits/{orgunit_id\}") * Group ("groups/{group_id\}")
    */
  var targetResource: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1PolicyTargetKey {
  
  inline def apply(): SchemaGoogleChromePolicyV1PolicyTargetKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1PolicyTargetKey]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1PolicyTargetKey](x: Self) {
    
    inline def setAdditionalTargetKeys(value: StringDictionary[String]): Self = StObject.set(x, "additionalTargetKeys", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTargetKeysNull: Self = StObject.set(x, "additionalTargetKeys", null)
    
    inline def setAdditionalTargetKeysUndefined: Self = StObject.set(x, "additionalTargetKeys", js.undefined)
    
    inline def setTargetResource(value: String): Self = StObject.set(x, "targetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceNull: Self = StObject.set(x, "targetResource", null)
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "targetResource", js.undefined)
  }
}
