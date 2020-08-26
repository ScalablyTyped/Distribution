package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSamplingRequest extends js.Object {
  /**
    * Average sample interval in bytes. Poisson distribution is used for the intervals. The
    * default value is 32768 bytes.
    */
  var samplingInterval: js.UndefOr[Double] = js.native
}

object StartSamplingRequest {
  @scala.inline
  def apply(): StartSamplingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSamplingRequest]
  }
  @scala.inline
  implicit class StartSamplingRequestOps[Self <: StartSamplingRequest] (val x: Self) extends AnyVal {
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
    def setSamplingInterval(value: Double): Self = this.set("samplingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingInterval: Self = this.set("samplingInterval", js.undefined)
  }
  
}

