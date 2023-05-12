package typings.devtoolsProtocol.mod.Protocol.Preload

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadingAttemptSource extends StObject {
  
  var key: PreloadingAttemptKey
  
  var nodeIds: js.Array[BackendNodeId]
  
  var ruleSetIds: js.Array[RuleSetId]
}
object PreloadingAttemptSource {
  
  inline def apply(key: PreloadingAttemptKey, nodeIds: js.Array[BackendNodeId], ruleSetIds: js.Array[RuleSetId]): PreloadingAttemptSource = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], nodeIds = nodeIds.asInstanceOf[js.Any], ruleSetIds = ruleSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadingAttemptSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadingAttemptSource] (val x: Self) extends AnyVal {
    
    inline def setKey(value: PreloadingAttemptKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNodeIds(value: js.Array[BackendNodeId]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: BackendNodeId*): Self = StObject.set(x, "nodeIds", js.Array(value*))
    
    inline def setRuleSetIds(value: js.Array[RuleSetId]): Self = StObject.set(x, "ruleSetIds", value.asInstanceOf[js.Any])
    
    inline def setRuleSetIdsVarargs(value: RuleSetId*): Self = StObject.set(x, "ruleSetIds", js.Array(value*))
  }
}
