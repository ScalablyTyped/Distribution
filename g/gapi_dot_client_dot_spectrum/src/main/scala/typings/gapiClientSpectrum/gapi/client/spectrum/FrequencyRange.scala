package typings.gapiClientSpectrum.gapi.client.spectrum

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
    maxPowerDBm: js.UndefOr[Double] = js.undefined,
    startHz: js.UndefOr[Double] = js.undefined,
    stopHz: js.UndefOr[Double] = js.undefined
  ): FrequencyRange = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPowerDBm)) __obj.updateDynamic("maxPowerDBm")(maxPowerDBm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startHz)) __obj.updateDynamic("startHz")(startHz.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopHz)) __obj.updateDynamic("stopHz")(stopHz.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrequencyRange]
  }
}

