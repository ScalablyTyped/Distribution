package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FrequencyRange extends js.Object {
  /**
               * The database may include a channel identifier, when applicable. When it is included, the device should treat it as informative. The length of the
               * identifier should not exceed 16 characters.
               */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The maximum total power level (EIRP)—computed over the corresponding operating bandwidth—that is permitted within the frequency range. Depending on the
               * context in which the frequency-range element appears, this value may be required. For example, it is required in the available-spectrum response,
               * available-spectrum-batch response, and spectrum-use notification message, but it should not be present (it is not applicable) when the frequency range
               * appears inside a device-capabilities message.
               */
  var maxPowerDBm: js.UndefOr[scala.Double] = js.undefined
  /** The required inclusive start of the frequency range (in Hertz). */
  var startHz: js.UndefOr[scala.Double] = js.undefined
  /** The required exclusive end of the frequency range (in Hertz). */
  var stopHz: js.UndefOr[scala.Double] = js.undefined
}

