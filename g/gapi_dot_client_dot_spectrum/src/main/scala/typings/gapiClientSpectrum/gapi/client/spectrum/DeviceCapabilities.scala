package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceCapabilities extends js.Object {
  /**
    * An optional list of frequency ranges supported by the device. Each element must contain start and stop frequencies in which the device can operate.
    * Channel identifiers are optional. When specified, the database should not return available spectrum that falls outside these ranges or channel IDs.
    */
  var frequencyRanges: js.UndefOr[js.Array[FrequencyRange]] = js.native
}

object DeviceCapabilities {
  @scala.inline
  def apply(): DeviceCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCapabilities]
  }
  @scala.inline
  implicit class DeviceCapabilitiesOps[Self <: DeviceCapabilities] (val x: Self) extends AnyVal {
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
    def setFrequencyRangesVarargs(value: FrequencyRange*): Self = this.set("frequencyRanges", js.Array(value :_*))
    @scala.inline
    def setFrequencyRanges(value: js.Array[FrequencyRange]): Self = this.set("frequencyRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequencyRanges: Self = this.set("frequencyRanges", js.undefined)
  }
  
}

