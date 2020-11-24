package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritevResult extends js.Object {
  
  var buffers: js.Array[ArrayBufferView] = js.native
  
  var bytesWritten: Double = js.native
}
object WritevResult {
  
  @scala.inline
  def apply(buffers: js.Array[ArrayBufferView], bytesWritten: Double): WritevResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritevResult]
  }
  
  @scala.inline
  implicit class WritevResultOps[Self <: WritevResult] (val x: Self) extends AnyVal {
    
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
    def setBuffersVarargs(value: ArrayBufferView*): Self = this.set("buffers", js.Array(value :_*))
    
    @scala.inline
    def setBuffers(value: js.Array[ArrayBufferView]): Self = this.set("buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
  }
}
