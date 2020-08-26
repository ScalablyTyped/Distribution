package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoSpectrumSchedule extends js.Object {
  /** The geolocation identifies the location at which the spectrum schedule applies. It will always be present. */
  var location: js.UndefOr[GeoLocation] = js.native
  /**
    * A list of available spectrum profiles and associated times. It will always be present, and at least one schedule must be included (though it may be
    * empty if there is no available spectrum). More than one schedule may be included to represent future changes to the available spectrum.
    */
  var spectrumSchedules: js.UndefOr[js.Array[SpectrumSchedule]] = js.native
}

object GeoSpectrumSchedule {
  @scala.inline
  def apply(): GeoSpectrumSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoSpectrumSchedule]
  }
  @scala.inline
  implicit class GeoSpectrumScheduleOps[Self <: GeoSpectrumSchedule] (val x: Self) extends AnyVal {
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
    def setLocation(value: GeoLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setSpectrumSchedulesVarargs(value: SpectrumSchedule*): Self = this.set("spectrumSchedules", js.Array(value :_*))
    @scala.inline
    def setSpectrumSchedules(value: js.Array[SpectrumSchedule]): Self = this.set("spectrumSchedules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectrumSchedules: Self = this.set("spectrumSchedules", js.undefined)
  }
  
}

