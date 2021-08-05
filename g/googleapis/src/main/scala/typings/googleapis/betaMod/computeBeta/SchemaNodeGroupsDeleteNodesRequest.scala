package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsDeleteNodesRequest extends StObject {
  
  var nodes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaNodeGroupsDeleteNodesRequest {
  
  inline def apply(): SchemaNodeGroupsDeleteNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsDeleteNodesRequest]
  }
  
  extension [Self <: SchemaNodeGroupsDeleteNodesRequest](x: Self) {
    
    inline def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
