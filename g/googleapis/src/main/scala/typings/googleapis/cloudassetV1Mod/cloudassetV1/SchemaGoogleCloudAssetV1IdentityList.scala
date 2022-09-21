package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1IdentityList extends StObject {
  
  /**
    * Group identity edges of the graph starting from the binding's group members to any node of the identities. The Edge.source_node contains a group, such as `group:parent@google.com`. The Edge.target_node contains a member of the group, such as `group:child@google.com` or `user:foo@google.com`. This field is present only if the output_group_edges option is enabled in request.
    */
  var groupEdges: js.UndefOr[js.Array[SchemaGoogleCloudAssetV1Edge]] = js.undefined
  
  /**
    * Only the identities that match one of the following conditions will be presented: - The identity_selector, if it is specified in request; - Otherwise, identities reachable from the policy binding's members.
    */
  var identities: js.UndefOr[js.Array[SchemaGoogleCloudAssetV1Identity]] = js.undefined
}
object SchemaGoogleCloudAssetV1IdentityList {
  
  inline def apply(): SchemaGoogleCloudAssetV1IdentityList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1IdentityList]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1IdentityList](x: Self) {
    
    inline def setGroupEdges(value: js.Array[SchemaGoogleCloudAssetV1Edge]): Self = StObject.set(x, "groupEdges", value.asInstanceOf[js.Any])
    
    inline def setGroupEdgesUndefined: Self = StObject.set(x, "groupEdges", js.undefined)
    
    inline def setGroupEdgesVarargs(value: SchemaGoogleCloudAssetV1Edge*): Self = StObject.set(x, "groupEdges", js.Array(value*))
    
    inline def setIdentities(value: js.Array[SchemaGoogleCloudAssetV1Identity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setIdentitiesVarargs(value: SchemaGoogleCloudAssetV1Identity*): Self = StObject.set(x, "identities", js.Array(value*))
  }
}
