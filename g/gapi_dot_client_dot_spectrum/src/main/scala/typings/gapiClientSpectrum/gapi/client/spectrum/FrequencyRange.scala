package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrequencyRange extends js.Object {
  /**
    * The database may include a channel identifier, when applicable. When it is included, the device should treat it as informative. The length of the
    * identifier should not exceed 16 characters.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The maximum total power level (EIRP)—computed over the corresponding operating bandwidth—that is permitted within the frequency range. Depending on the
    * context in which the frequency-range element appears, this value may be required. For example, it is required in the available-spectrum response,
    * available-spectrum-batch response, and spectrum-use notification message, but it should not be present (it is not applicable) when the frequency range
    * appears inside a device-capabilities message.
    */
  var maxPowerDBm: js.UndefOr[Double] = js.native
  /** The required inclusive start of the frequency range (in Hertz). */
  var startHz: js.UndefOr[Double] = js.native
  /** The required exclusive end of the frequency range (in Hertz). */
  var stopHz: js.UndefOr[Double] = js.native
}

object FrequencyRange {
  @scala.inline
  def apply(): FrequencyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrequencyRange]
  }
  @scala.inline
  implicit class FrequencyRangeOps[Self <: FrequencyRange] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setMaxPowerDBm(value: Double): Self = this.set("maxPowerDBm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPowerDBm: Self = this.set("maxPowerDBm", js.undefined)
    @scala.inline
    def setStartHz(value: Double): Self = this.set("startHz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartHz: Self = this.set("startHz", js.undefined)
    @scala.inline
    def setStopHz(value: Double): Self = this.set("stopHz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopHz: Self = this.set("stopHz", js.undefined)
  }
  
}

