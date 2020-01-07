package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ConferenceParameters extends js.Object {
  /**
    * Additional add-on specific data.
    */
  var addOnParameters: js.UndefOr[Schema$ConferenceParametersAddOnParameters] = js.native
}

object Schema$ConferenceParameters {
  @scala.inline
  def apply(addOnParameters: Schema$ConferenceParametersAddOnParameters = null): Schema$ConferenceParameters = {
    val __obj = js.Dynamic.literal()
    if (addOnParameters != null) __obj.updateDynamic("addOnParameters")(addOnParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConferenceParameters]
  }
}

