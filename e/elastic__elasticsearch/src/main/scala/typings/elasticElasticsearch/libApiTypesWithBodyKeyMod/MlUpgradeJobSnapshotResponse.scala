package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpgradeJobSnapshotResponse extends StObject {
  
  var completed: Boolean
  
  var node: NodeId
}
object MlUpgradeJobSnapshotResponse {
  
  inline def apply(completed: Boolean, node: NodeId): MlUpgradeJobSnapshotResponse = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpgradeJobSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlUpgradeJobSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NodeId): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
