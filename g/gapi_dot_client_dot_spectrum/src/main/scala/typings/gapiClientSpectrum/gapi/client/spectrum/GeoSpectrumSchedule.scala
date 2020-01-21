package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoSpectrumSchedule extends js.Object {
  /** The geolocation identifies the location at which the spectrum schedule applies. It will always be present. */
  var location: js.UndefOr[GeoLocation] = js.undefined
  /**
    * A list of available spectrum profiles and associated times. It will always be present, and at least one schedule must be included (though it may be
    * empty if there is no available spectrum). More than one schedule may be included to represent future changes to the available spectrum.
    */
  var spectrumSchedules: js.UndefOr[js.Array[SpectrumSchedule]] = js.undefined
}

object GeoSpectrumSchedule {
  @scala.inline
  def apply(location: GeoLocation = null, spectrumSchedules: js.Array[SpectrumSchedule] = null): GeoSpectrumSchedule = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (spectrumSchedules != null) __obj.updateDynamic("spectrumSchedules")(spectrumSchedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSpectrumSchedule]
  }
}

