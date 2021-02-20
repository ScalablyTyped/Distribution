package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for BigtableInstanceAdmin.CreateInstance.
  */
@js.native
trait SchemaCreateInstanceRequest extends StObject {
  
  /**
    * The clusters to be created within the instance, mapped by desired cluster
    * ID, e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`. Fields
    * marked `OutputOnly` must be left blank. Currently, at most two clusters
    * can be specified.
    */
  var clusters: js.UndefOr[StringDictionary[SchemaCluster]] = js.native
  
  /**
    * The instance to create. Fields marked `OutputOnly` must be left blank.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  
  /**
    * The ID to be used when referring to the new instance within its project,
    * e.g., just `myinstance` rather than
    * `projects/myproject/instances/myinstance`.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * The unique name of the project in which to create the new instance.
    * Values are of the form `projects/&lt;project&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
}
object SchemaCreateInstanceRequest {
  
  @scala.inline
  def apply(): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateInstanceRequestMutableBuilder[Self <: SchemaCreateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: StringDictionary[SchemaCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
