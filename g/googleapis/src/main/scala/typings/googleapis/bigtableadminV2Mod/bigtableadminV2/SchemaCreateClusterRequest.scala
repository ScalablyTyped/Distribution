package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for BigtableInstanceAdmin.CreateCluster.
  */
@js.native
trait SchemaCreateClusterRequest extends StObject {
  
  /**
    * The cluster to be created. Fields marked `OutputOnly` must be left blank.
    */
  var cluster: js.UndefOr[SchemaCluster] = js.native
  
  /**
    * The ID to be used when referring to the new cluster within its instance,
    * e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`.
    */
  var clusterId: js.UndefOr[String] = js.native
  
  /**
    * The unique name of the instance in which to create the new cluster.
    * Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
}
object SchemaCreateClusterRequest {
  
  @scala.inline
  def apply(): SchemaCreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateClusterRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateClusterRequestMutableBuilder[Self <: SchemaCreateClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: SchemaCluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
