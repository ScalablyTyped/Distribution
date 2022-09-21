package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkConfig extends StObject {
  
  /**
    * Required. Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to WorkerPool.project_id on the default network. Must be in the format `projects/{project\}/global/networks/{network\}`, where {project\} is a project number, such as `12345`, and {network\} is the name of a VPC network in the project.
    */
  var peeredNetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkConfig {
  
  inline def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  
  extension [Self <: SchemaNetworkConfig](x: Self) {
    
    inline def setPeeredNetwork(value: String): Self = StObject.set(x, "peeredNetwork", value.asInstanceOf[js.Any])
    
    inline def setPeeredNetworkNull: Self = StObject.set(x, "peeredNetwork", null)
    
    inline def setPeeredNetworkUndefined: Self = StObject.set(x, "peeredNetwork", js.undefined)
  }
}
