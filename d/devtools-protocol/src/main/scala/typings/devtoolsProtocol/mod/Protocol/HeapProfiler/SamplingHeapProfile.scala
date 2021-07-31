package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingHeapProfile extends StObject {
  
  var head: SamplingHeapProfileNode
  
  var samples: js.Array[SamplingHeapProfileSample]
}
object SamplingHeapProfile {
  
  @scala.inline
  def apply(head: SamplingHeapProfileNode, samples: js.Array[SamplingHeapProfileSample]): SamplingHeapProfile = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfile]
  }
  
  @scala.inline
  implicit class SamplingHeapProfileMutableBuilder[Self <: SamplingHeapProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHead(value: SamplingHeapProfileNode): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamples(value: js.Array[SamplingHeapProfileSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesVarargs(value: SamplingHeapProfileSample*): Self = StObject.set(x, "samples", js.Array(value :_*))
  }
}
