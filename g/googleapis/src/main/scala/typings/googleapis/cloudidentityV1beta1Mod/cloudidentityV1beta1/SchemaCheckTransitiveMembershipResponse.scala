package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckTransitiveMembershipResponse extends StObject {
  
  /**
    * Response does not include the possible roles of a member since the behavior of this rpc is not all-or-nothing unlike the other rpcs. So, it may not be possible to list all the roles definitively, due to possible lack of authorization in some of the paths.
    */
  var hasMembership: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCheckTransitiveMembershipResponse {
  
  inline def apply(): SchemaCheckTransitiveMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckTransitiveMembershipResponse]
  }
  
  extension [Self <: SchemaCheckTransitiveMembershipResponse](x: Self) {
    
    inline def setHasMembership(value: Boolean): Self = StObject.set(x, "hasMembership", value.asInstanceOf[js.Any])
    
    inline def setHasMembershipNull: Self = StObject.set(x, "hasMembership", null)
    
    inline def setHasMembershipUndefined: Self = StObject.set(x, "hasMembership", js.undefined)
  }
}
