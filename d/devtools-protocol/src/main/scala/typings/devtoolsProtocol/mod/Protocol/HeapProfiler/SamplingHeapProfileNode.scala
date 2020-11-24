package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.CallFrame
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingHeapProfileNode extends js.Object {
  
  /**
    * Function location.
    */
  var callFrame: CallFrame = js.native
  
  /**
    * Child nodes.
    */
  var children: js.Array[SamplingHeapProfileNode] = js.native
  
  /**
    * Node id. Ids are unique across all profiles collected between startSampling and stopSampling.
    */
  var id: integer = js.native
  
  /**
    * Allocations size in bytes for the node excluding children.
    */
  var selfSize: Double = js.native
}
object SamplingHeapProfileNode {
  
  @scala.inline
  def apply(callFrame: CallFrame, children: js.Array[SamplingHeapProfileNode], id: integer, selfSize: Double): SamplingHeapProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selfSize = selfSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfileNode]
  }
  
  @scala.inline
  implicit class SamplingHeapProfileNodeOps[Self <: SamplingHeapProfileNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: SamplingHeapProfileNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[SamplingHeapProfileNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: integer): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfSize(value: Double): Self = this.set("selfSize", value.asInstanceOf[js.Any])
  }
}
