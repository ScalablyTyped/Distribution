package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpectrumSchedule extends js.Object {
  /** The event time expresses when the spectrum profile is valid. It will always be present. */
  var eventTime: js.UndefOr[EventTime] = js.native
  /** A list of spectrum messages representing the usable profile. It will always be present, but may be empty when there is no available spectrum. */
  var spectra: js.UndefOr[js.Array[SpectrumMessage]] = js.native
}

object SpectrumSchedule {
  @scala.inline
  def apply(): SpectrumSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpectrumSchedule]
  }
  @scala.inline
  implicit class SpectrumScheduleOps[Self <: SpectrumSchedule] (val x: Self) extends AnyVal {
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
    def setEventTime(value: EventTime): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    @scala.inline
    def setSpectraVarargs(value: SpectrumMessage*): Self = this.set("spectra", js.Array(value :_*))
    @scala.inline
    def setSpectra(value: js.Array[SpectrumMessage]): Self = this.set("spectra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectra: Self = this.set("spectra", js.undefined)
  }
  
}

