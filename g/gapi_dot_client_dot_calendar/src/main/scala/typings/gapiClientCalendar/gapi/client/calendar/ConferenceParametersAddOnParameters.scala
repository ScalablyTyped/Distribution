package typings.gapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceParametersAddOnParameters extends js.Object {
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientCalendar.gapiClientCalendarStrings.ConferenceParametersAddOnParameters with TopLevel[js.Any]
  ] = js.native
}

object ConferenceParametersAddOnParameters {
  @scala.inline
  def apply(): ConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceParametersAddOnParameters]
  }
  @scala.inline
  implicit class ConferenceParametersAddOnParametersOps[Self <: ConferenceParametersAddOnParameters] (val x: Self) extends AnyVal {
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
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.gapiClientCalendar.gapiClientCalendarStrings.ConferenceParametersAddOnParameters with TopLevel[js.Any]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

