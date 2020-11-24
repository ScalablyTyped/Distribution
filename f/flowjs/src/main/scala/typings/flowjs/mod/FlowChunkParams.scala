package typings.flowjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowChunkParams extends js.Object {
  
  var flowChunkNumber: Double = js.native
  
  var flowChunkSize: Double = js.native
  
  var flowCurrentChunkSize: Double = js.native
  
  var flowFilename: String = js.native
  
  var flowIdentifier: js.Any = js.native
  
  var flowRelativePath: String = js.native
  
  var flowTotalChunks: Double = js.native
  
  var flowTotalSize: Double = js.native
}
object FlowChunkParams {
  
  @scala.inline
  def apply(
    flowChunkNumber: Double,
    flowChunkSize: Double,
    flowCurrentChunkSize: Double,
    flowFilename: String,
    flowIdentifier: js.Any,
    flowRelativePath: String,
    flowTotalChunks: Double,
    flowTotalSize: Double
  ): FlowChunkParams = {
    val __obj = js.Dynamic.literal(flowChunkNumber = flowChunkNumber.asInstanceOf[js.Any], flowChunkSize = flowChunkSize.asInstanceOf[js.Any], flowCurrentChunkSize = flowCurrentChunkSize.asInstanceOf[js.Any], flowFilename = flowFilename.asInstanceOf[js.Any], flowIdentifier = flowIdentifier.asInstanceOf[js.Any], flowRelativePath = flowRelativePath.asInstanceOf[js.Any], flowTotalChunks = flowTotalChunks.asInstanceOf[js.Any], flowTotalSize = flowTotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChunkParams]
  }
  
  @scala.inline
  implicit class FlowChunkParamsOps[Self <: FlowChunkParams] (val x: Self) extends AnyVal {
    
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
    def setFlowChunkNumber(value: Double): Self = this.set("flowChunkNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowChunkSize(value: Double): Self = this.set("flowChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowCurrentChunkSize(value: Double): Self = this.set("flowCurrentChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowFilename(value: String): Self = this.set("flowFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowIdentifier(value: js.Any): Self = this.set("flowIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowRelativePath(value: String): Self = this.set("flowRelativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowTotalChunks(value: Double): Self = this.set("flowTotalChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowTotalSize(value: Double): Self = this.set("flowTotalSize", value.asInstanceOf[js.Any])
  }
}
