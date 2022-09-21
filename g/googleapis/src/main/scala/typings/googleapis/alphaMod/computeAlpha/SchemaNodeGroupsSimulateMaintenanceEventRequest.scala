package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsSimulateMaintenanceEventRequest extends StObject {
  
  /**
    * Names of the nodes to go under maintenance simulation.
    */
  var nodes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaNodeGroupsSimulateMaintenanceEventRequest {
  
  inline def apply(): SchemaNodeGroupsSimulateMaintenanceEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsSimulateMaintenanceEventRequest]
  }
  
  extension [Self <: SchemaNodeGroupsSimulateMaintenanceEventRequest](x: Self) {
    
    inline def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesNull: Self = StObject.set(x, "nodes", null)
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
