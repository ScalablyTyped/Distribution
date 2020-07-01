package typings.gapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceParametersAddOnParameters extends js.Object {
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientCalendar.gapiClientCalendarStrings.ConferenceParametersAddOnParameters with TopLevel[js.Any]
  ] = js.undefined
}

object ConferenceParametersAddOnParameters {
  @scala.inline
  def apply(
    parameters: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientCalendar.gapiClientCalendarStrings.ConferenceParametersAddOnParameters with TopLevel[js.Any] = null
  ): ConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceParametersAddOnParameters]
  }
}

