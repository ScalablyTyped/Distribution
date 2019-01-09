package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsResource extends js.Object {
  /**
    * Requests information about the available spectrum for a device at a location. Requests from a fixed-mode device must include owner information so the
    * device can be registered with the database.
    */
  def getSpectrum(request: gapiDotClientDotSpectrumLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[PawsGetSpectrumResponse]
  /** The Google Spectrum Database does not support batch requests, so this method always yields an UNIMPLEMENTED error. */
  def getSpectrumBatch(request: gapiDotClientDotSpectrumLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[PawsGetSpectrumBatchResponse]
  /** Initializes the connection between a white space device and the database. */
  def init(request: gapiDotClientDotSpectrumLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[PawsInitResponse]
  /**
    * Notifies the database that the device has selected certain frequency ranges for transmission. Only to be invoked when required by the regulator. The
    * Google Spectrum Database does not operate in domains that require notification, so this always yields an UNIMPLEMENTED error.
    */
  def notifySpectrumUse(request: gapiDotClientDotSpectrumLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[PawsNotifySpectrumUseResponse]
  /** The Google Spectrum Database implements registration in the getSpectrum method. As such this always returns an UNIMPLEMENTED error. */
  def register(request: gapiDotClientDotSpectrumLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[PawsRegisterResponse]
  /**
    * Validates a device for white space use in accordance with regulatory rules. The Google Spectrum Database does not support master/slave configurations,
    * so this always yields an UNIMPLEMENTED error.
    */
  def verifyDevice(request: gapiDotClientDotSpectrumLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[PawsVerifyDeviceResponse]
}

