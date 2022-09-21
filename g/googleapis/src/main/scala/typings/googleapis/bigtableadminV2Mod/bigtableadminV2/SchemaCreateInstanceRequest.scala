package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateInstanceRequest extends StObject {
  
  /**
    * Required. The clusters to be created within the instance, mapped by desired cluster ID, e.g., just `mycluster` rather than `projects/myproject/instances/myinstance/clusters/mycluster`. Fields marked `OutputOnly` must be left blank.
    */
  var clusters: js.UndefOr[StringDictionary[SchemaCluster] | Null] = js.undefined
  
  /**
    * Required. The instance to create. Fields marked `OutputOnly` must be left blank.
    */
  var instance: js.UndefOr[SchemaInstance] = js.undefined
  
  /**
    * Required. The ID to be used when referring to the new instance within its project, e.g., just `myinstance` rather than `projects/myproject/instances/myinstance`.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The unique name of the project in which to create the new instance. Values are of the form `projects/{project\}`.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateInstanceRequest {
  
  inline def apply(): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
  
  extension [Self <: SchemaCreateInstanceRequest](x: Self) {
    
    inline def setClusters(value: StringDictionary[SchemaCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersNull: Self = StObject.set(x, "clusters", null)
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
