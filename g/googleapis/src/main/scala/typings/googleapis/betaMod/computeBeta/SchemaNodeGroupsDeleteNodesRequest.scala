package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeGroupsDeleteNodesRequest extends StObject {
  
  var nodes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaNodeGroupsDeleteNodesRequest {
  
  @scala.inline
  def apply(): SchemaNodeGroupsDeleteNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsDeleteNodesRequest]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupsDeleteNodesRequestMutableBuilder[Self <: SchemaNodeGroupsDeleteNodesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
