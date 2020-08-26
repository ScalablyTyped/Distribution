package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingProfileResponse extends js.Object {
  /**
    * Return the sampling profile being collected.
    */
  var profile: SamplingHeapProfile = js.native
}

object GetSamplingProfileResponse {
  @scala.inline
  def apply(profile: SamplingHeapProfile): GetSamplingProfileResponse = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingProfileResponse]
  }
  @scala.inline
  implicit class GetSamplingProfileResponseOps[Self <: GetSamplingProfileResponse] (val x: Self) extends AnyVal {
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

