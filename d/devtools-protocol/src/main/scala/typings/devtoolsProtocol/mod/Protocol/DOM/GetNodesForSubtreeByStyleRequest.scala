package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodesForSubtreeByStyleRequest extends StObject {
  
  /**
    * The style to filter nodes by (includes nodes if any of properties matches).
    */
  var computedStyles: js.Array[CSSComputedStyleProperty]
  
  /**
    * Node ID pointing to the root of a subtree.
    */
  var nodeId: NodeId
  
  /**
    * Whether or not iframes and shadow roots in the same target should be traversed when returning the
    * results (default is false).
    */
  var pierce: js.UndefOr[Boolean] = js.undefined
}
object GetNodesForSubtreeByStyleRequest {
  
  inline def apply(computedStyles: js.Array[CSSComputedStyleProperty], nodeId: NodeId): GetNodesForSubtreeByStyleRequest = {
    val __obj = js.Dynamic.literal(computedStyles = computedStyles.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodesForSubtreeByStyleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNodesForSubtreeByStyleRequest] (val x: Self) extends AnyVal {
    
    inline def setComputedStyles(value: js.Array[CSSComputedStyleProperty]): Self = StObject.set(x, "computedStyles", value.asInstanceOf[js.Any])
    
    inline def setComputedStylesVarargs(value: CSSComputedStyleProperty*): Self = StObject.set(x, "computedStyles", js.Array(value*))
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setPierce(value: Boolean): Self = StObject.set(x, "pierce", value.asInstanceOf[js.Any])
    
    inline def setPierceUndefined: Self = StObject.set(x, "pierce", js.undefined)
  }
}
