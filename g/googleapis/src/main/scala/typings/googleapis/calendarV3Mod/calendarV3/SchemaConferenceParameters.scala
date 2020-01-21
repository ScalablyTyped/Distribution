package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceParameters extends js.Object {
  /**
    * Additional add-on specific data.
    */
  var addOnParameters: js.UndefOr[SchemaConferenceParametersAddOnParameters] = js.native
}

object SchemaConferenceParameters {
  @scala.inline
  def apply(addOnParameters: SchemaConferenceParametersAddOnParameters = null): SchemaConferenceParameters = {
    val __obj = js.Dynamic.literal()
    if (addOnParameters != null) __obj.updateDynamic("addOnParameters")(addOnParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConferenceParameters]
  }
}

