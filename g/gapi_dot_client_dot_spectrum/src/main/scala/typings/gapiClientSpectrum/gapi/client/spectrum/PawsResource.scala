package typings.gapiClientSpectrum.gapi.client.spectrum

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSpectrum.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsResource extends js.Object {
  /**
    * Requests information about the available spectrum for a device at a location. Requests from a fixed-mode device must include owner information so the
    * device can be registered with the database.
    */
  def getSpectrum(request: Alt): Request[PawsGetSpectrumResponse]
  /** The Google Spectrum Database does not support batch requests, so this method always yields an UNIMPLEMENTED error. */
  def getSpectrumBatch(request: Alt): Request[PawsGetSpectrumBatchResponse]
  /** Initializes the connection between a white space device and the database. */
  def init(request: Alt): Request[PawsInitResponse]
  /**
    * Notifies the database that the device has selected certain frequency ranges for transmission. Only to be invoked when required by the regulator. The
    * Google Spectrum Database does not operate in domains that require notification, so this always yields an UNIMPLEMENTED error.
    */
  def notifySpectrumUse(request: Alt): Request[PawsNotifySpectrumUseResponse]
  /** The Google Spectrum Database implements registration in the getSpectrum method. As such this always returns an UNIMPLEMENTED error. */
  def register(request: Alt): Request[PawsRegisterResponse]
  /**
    * Validates a device for white space use in accordance with regulatory rules. The Google Spectrum Database does not support master/slave configurations,
    * so this always yields an UNIMPLEMENTED error.
    */
  def verifyDevice(request: Alt): Request[PawsVerifyDeviceResponse]
}

object PawsResource {
  @scala.inline
  def apply(
    getSpectrum: Alt => Request[PawsGetSpectrumResponse],
    getSpectrumBatch: Alt => Request[PawsGetSpectrumBatchResponse],
    init: Alt => Request[PawsInitResponse],
    notifySpectrumUse: Alt => Request[PawsNotifySpectrumUseResponse],
    register: Alt => Request[PawsRegisterResponse],
    verifyDevice: Alt => Request[PawsVerifyDeviceResponse]
  ): PawsResource = {
    val __obj = js.Dynamic.literal(getSpectrum = js.Any.fromFunction1(getSpectrum), getSpectrumBatch = js.Any.fromFunction1(getSpectrumBatch), init = js.Any.fromFunction1(init), notifySpectrumUse = js.Any.fromFunction1(notifySpectrumUse), register = js.Any.fromFunction1(register), verifyDevice = js.Any.fromFunction1(verifyDevice))
    __obj.asInstanceOf[PawsResource]
  }
}

