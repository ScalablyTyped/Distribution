package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopSamplingResponse extends js.Object {
  
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
  implicit class StopSamplingResponseOps[Self <: StopSamplingResponse] (val x: Self) extends AnyVal {
    
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
    def setProfile(value: SamplingHeapProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
  }
}
