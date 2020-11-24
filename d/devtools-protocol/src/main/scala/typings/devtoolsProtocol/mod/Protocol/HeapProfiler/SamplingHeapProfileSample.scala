package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingHeapProfileSample extends js.Object {
  
  /**
    * Id of the corresponding profile tree node.
    */
  var nodeId: integer = js.native
  
  /**
    * Time-ordered sample ordinal number. It is unique across all profiles retrieved
    * between startSampling and stopSampling.
    */
  var ordinal: Double = js.native
  
  /**
    * Allocation size in bytes attributed to the sample.
    */
  var size: Double = js.native
}
object SamplingHeapProfileSample {
  
  @scala.inline
  def apply(nodeId: integer, ordinal: Double, size: Double): SamplingHeapProfileSample = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfileSample]
  }
  
  @scala.inline
  implicit class SamplingHeapProfileSampleOps[Self <: SamplingHeapProfileSample] (val x: Self) extends AnyVal {
    
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
    def setNodeId(value: integer): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinal(value: Double): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
