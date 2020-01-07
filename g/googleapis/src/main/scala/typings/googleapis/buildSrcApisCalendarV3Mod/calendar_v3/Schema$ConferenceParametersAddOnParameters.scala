package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ConferenceParametersAddOnParameters extends js.Object {
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$ConferenceParametersAddOnParameters {
  @scala.inline
  def apply(parameters: StringDictionary[String] = null): Schema$ConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConferenceParametersAddOnParameters]
  }
}

