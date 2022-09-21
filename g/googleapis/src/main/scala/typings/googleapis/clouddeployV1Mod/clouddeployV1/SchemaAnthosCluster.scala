package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnthosCluster extends StObject {
  
  /**
    * Membership of the GKE Hub-registered cluster to which to apply the Skaffold configuration. Format is `projects/{project\}/locations/{location\}/memberships/{membership_name\}`.
    */
  var membership: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnthosCluster {
  
  inline def apply(): SchemaAnthosCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnthosCluster]
  }
  
  extension [Self <: SchemaAnthosCluster](x: Self) {
    
    inline def setMembership(value: String): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipNull: Self = StObject.set(x, "membership", null)
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
