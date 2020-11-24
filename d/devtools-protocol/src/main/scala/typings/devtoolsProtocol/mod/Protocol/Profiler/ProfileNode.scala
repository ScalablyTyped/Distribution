package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.CallFrame
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileNode extends js.Object {
  
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
  implicit class ProfileNodeOps[Self <: ProfileNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallFrame(value: CallFrame): Self = this.set("callFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: integer): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: integer*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[integer]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDeoptReason(value: String): Self = this.set("deoptReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeoptReason: Self = this.set("deoptReason", js.undefined)
    
    @scala.inline
    def setHitCount(value: integer): Self = this.set("hitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitCount: Self = this.set("hitCount", js.undefined)
    
    @scala.inline
    def setPositionTicksVarargs(value: PositionTickInfo*): Self = this.set("positionTicks", js.Array(value :_*))
    
    @scala.inline
    def setPositionTicks(value: js.Array[PositionTickInfo]): Self = this.set("positionTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionTicks: Self = this.set("positionTicks", js.undefined)
  }
}
