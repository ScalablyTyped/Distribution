package typings.gapiDotClientDotSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsNotifySpectrumUseResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsNotifySpectrumUseResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.undefined
}

object PawsNotifySpectrumUseResponse {
  @scala.inline
  def apply(kind: String = null, `type`: String = null, version: String = null): PawsNotifySpectrumUseResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PawsNotifySpectrumUseResponse]
  }
}

