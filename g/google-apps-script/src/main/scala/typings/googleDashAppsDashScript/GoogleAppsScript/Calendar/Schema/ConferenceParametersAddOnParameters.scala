package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceParametersAddOnParameters extends js.Object {
  var parameters: js.UndefOr[Record[String, String]] = js.undefined
}

object ConferenceParametersAddOnParameters {
  @scala.inline
  def apply(parameters: Record[String, String] = null): ConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceParametersAddOnParameters]
  }
}

