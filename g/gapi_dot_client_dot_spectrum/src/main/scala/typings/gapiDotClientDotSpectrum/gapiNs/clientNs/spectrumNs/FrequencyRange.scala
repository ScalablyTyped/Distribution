package typings.gapiDotClientDotSpectrum.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrequencyRange extends js.Object {
  /**
    * The database may include a channel identifier, when applicable. When it is included, the device should treat it as informative. The length of the
    * identifier should not exceed 16 characters.
    */
  var channelId: js.UndefOr[String] = js.undefined
  /**
    * The maximum total power level (EIRP)—computed over the corresponding operating bandwidth—that is permitted within the frequency range. Depending on the
    * context in which the frequency-range element appears, this value may be required. For example, it is required in the available-spectrum response,
    * available-spectrum-batch response, and spectrum-use notification message, but it should not be present (it is not applicable) when the frequency range
    * appears inside a device-capabilities message.
    */
  var maxPowerDBm: js.UndefOr[Double] = js.undefined
  /** The required inclusive start of the frequency range (in Hertz). */
  var startHz: js.UndefOr[Double] = js.undefined
  /** The required exclusive end of the frequency range (in Hertz). */
  var stopHz: js.UndefOr[Double] = js.undefined
}

object FrequencyRange {
  @scala.inline
  def apply(
    channelId: String = null,
    maxPowerDBm: Int | Double = null,
    startHz: Int | Double = null,
    stopHz: Int | Double = null
  ): FrequencyRange = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (maxPowerDBm != null) __obj.updateDynamic("maxPowerDBm")(maxPowerDBm.asInstanceOf[js.Any])
    if (startHz != null) __obj.updateDynamic("startHz")(startHz.asInstanceOf[js.Any])
    if (stopHz != null) __obj.updateDynamic("stopHz")(stopHz.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrequencyRange]
  }
}

