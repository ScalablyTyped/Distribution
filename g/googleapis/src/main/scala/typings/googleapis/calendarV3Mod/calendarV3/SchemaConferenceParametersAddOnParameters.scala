package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceParametersAddOnParameters extends js.Object {
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaConferenceParametersAddOnParameters {
  @scala.inline
  def apply(parameters: StringDictionary[String] = null): SchemaConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConferenceParametersAddOnParameters]
  }
}

