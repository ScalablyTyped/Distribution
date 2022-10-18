package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesSerializedClusterState extends StObject {
  
  var diffs: js.UndefOr[NodesSerializedClusterStateDetail] = js.undefined
  
  var full_states: js.UndefOr[NodesSerializedClusterStateDetail] = js.undefined
}
object NodesSerializedClusterState {
  
  inline def apply(): NodesSerializedClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesSerializedClusterState]
  }
  
  extension [Self <: NodesSerializedClusterState](x: Self) {
    
    inline def setDiffs(value: NodesSerializedClusterStateDetail): Self = StObject.set(x, "diffs", value.asInstanceOf[js.Any])
    
    inline def setDiffsUndefined: Self = StObject.set(x, "diffs", js.undefined)
    
    inline def setFull_states(value: NodesSerializedClusterStateDetail): Self = StObject.set(x, "full_states", value.asInstanceOf[js.Any])
    
    inline def setFull_statesUndefined: Self = StObject.set(x, "full_states", js.undefined)
  }
}
