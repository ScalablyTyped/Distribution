package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceParameters extends js.Object {
  /** Additional add-on specific data. */
  var addOnParameters: js.UndefOr[ConferenceParametersAddOnParameters] = js.native
}

object ConferenceParameters {
  @scala.inline
  def apply(): ConferenceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceParameters]
  }
  @scala.inline
  implicit class ConferenceParametersOps[Self <: ConferenceParameters] (val x: Self) extends AnyVal {
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
    def setAddOnParameters(value: ConferenceParametersAddOnParameters): Self = this.set("addOnParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnParameters: Self = this.set("addOnParameters", js.undefined)
  }
  
}

