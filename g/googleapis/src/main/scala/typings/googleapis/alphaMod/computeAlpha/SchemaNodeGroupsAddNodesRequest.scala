package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsAddNodesRequest extends StObject {
  
  /**
    * Count of additional nodes to be added to the node group.
    */
  var additionalNodeCount: js.UndefOr[Double] = js.undefined
}
object SchemaNodeGroupsAddNodesRequest {
  
  @scala.inline
  def apply(): SchemaNodeGroupsAddNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsAddNodesRequest]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupsAddNodesRequestMutableBuilder[Self <: SchemaNodeGroupsAddNodesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalNodeCount(value: Double): Self = StObject.set(x, "additionalNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalNodeCountUndefined: Self = StObject.set(x, "additionalNodeCount", js.undefined)
  }
}
