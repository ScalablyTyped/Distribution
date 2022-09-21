package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeCluster extends StObject {
  
  /**
    * Information specifying a GKE Cluster. Format is `projects/{project_id\}/locations/{location_id\}/clusters/{cluster_id\}.
    */
  var cluster: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
    */
  var internalIp: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGkeCluster {
  
  inline def apply(): SchemaGkeCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeCluster]
  }
  
  extension [Self <: SchemaGkeCluster](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterNull: Self = StObject.set(x, "cluster", null)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setInternalIp(value: Boolean): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIpNull: Self = StObject.set(x, "internalIp", null)
    
    inline def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
  }
}
