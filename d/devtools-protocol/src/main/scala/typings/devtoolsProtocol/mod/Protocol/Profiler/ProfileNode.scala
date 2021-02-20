package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.CallFrame
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileNode extends StObject {
  
  /**
    * Function location.
    */
  var callFrame: CallFrame = js.native
  
  /**
    * Child node ids.
    */
  var children: js.UndefOr[js.Array[integer]] = js.native
  
  /**
    * The reason of being not optimized. The function may be deoptimized or marked as don't
    * optimize.
    */
  var deoptReason: js.UndefOr[String] = js.native
  
  /**
    * Number of samples where this node was on top of the call stack.
    */
  var hitCount: js.UndefOr[integer] = js.native
  
  /**
    * Unique id of the node.
    */
  var id: integer = js.native
  
  /**
    * An array of source position ticks.
    */
  var positionTicks: js.UndefOr[js.Array[PositionTickInfo]] = js.native
}
object ProfileNode {
  
  @scala.inline
  def apply(callFrame: CallFrame, id: integer): ProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileNode]
  }
  
  @scala.inline
  implicit class ProfileNodeMutableBuilder[Self <: ProfileNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrame(value: CallFrame): Self = StObject.set(x, "callFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[integer]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: integer*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDeoptReason(value: String): Self = StObject.set(x, "deoptReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeoptReasonUndefined: Self = StObject.set(x, "deoptReason", js.undefined)
    
    @scala.inline
    def setHitCount(value: integer): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitCountUndefined: Self = StObject.set(x, "hitCount", js.undefined)
    
    @scala.inline
    def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionTicks(value: js.Array[PositionTickInfo]): Self = StObject.set(x, "positionTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionTicksUndefined: Self = StObject.set(x, "positionTicks", js.undefined)
    
    @scala.inline
    def setPositionTicksVarargs(value: PositionTickInfo*): Self = StObject.set(x, "positionTicks", js.Array(value :_*))
  }
}
