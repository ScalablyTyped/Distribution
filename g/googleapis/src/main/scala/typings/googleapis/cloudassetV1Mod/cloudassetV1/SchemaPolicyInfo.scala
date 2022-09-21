package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyInfo extends StObject {
  
  /**
    * The full resource name the policy is directly attached to.
    */
  var attachedResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IAM policy that's directly attached to the attached_resource.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.undefined
}
object SchemaPolicyInfo {
  
  inline def apply(): SchemaPolicyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyInfo]
  }
  
  extension [Self <: SchemaPolicyInfo](x: Self) {
    
    inline def setAttachedResource(value: String): Self = StObject.set(x, "attachedResource", value.asInstanceOf[js.Any])
    
    inline def setAttachedResourceNull: Self = StObject.set(x, "attachedResource", null)
    
    inline def setAttachedResourceUndefined: Self = StObject.set(x, "attachedResource", js.undefined)
    
    inline def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
