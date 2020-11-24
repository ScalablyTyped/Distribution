package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingHeapProfile extends js.Object {
  
  var head: SamplingHeapProfileNode = js.native
  
  var samples: js.Array[SamplingHeapProfileSample] = js.native
}
object SamplingHeapProfile {
  
  @scala.inline
  def apply(head: SamplingHeapProfileNode, samples: js.Array[SamplingHeapProfileSample]): SamplingHeapProfile = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfile]
  }
  
  @scala.inline
  implicit class SamplingHeapProfileOps[Self <: SamplingHeapProfile] (val x: Self) extends AnyVal {
    
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
    def setHead(value: SamplingHeapProfileNode): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesVarargs(value: SamplingHeapProfileSample*): Self = this.set("samples", js.Array(value :_*))
    
    @scala.inline
    def setSamples(value: js.Array[SamplingHeapProfileSample]): Self = this.set("samples", value.asInstanceOf[js.Any])
  }
}
