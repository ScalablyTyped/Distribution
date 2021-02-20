package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopSamplingResponse extends StObject {
  
  /**
    * Recorded sampling heap profile.
    */
  var profile: SamplingHeapProfile = js.native
}
object StopSamplingResponse {
  
  @scala.inline
  def apply(profile: SamplingHeapProfile): StopSamplingResponse = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSamplingResponse]
  }
  
  @scala.inline
  implicit class StopSamplingResponseMutableBuilder[Self <: StopSamplingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfile(value: SamplingHeapProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
