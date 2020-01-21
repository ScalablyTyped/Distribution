package typings.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysStartRequest extends js.Object {
  /** Threshold to start a survey automically if the quoted prices is less than or equal to this value. See Survey.Cost for more details. */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.undefined
}

object SurveysStartRequest {
  @scala.inline
  def apply(maxCostPerResponseNanos: String = null): SurveysStartRequest = {
    val __obj = js.Dynamic.literal()
    if (maxCostPerResponseNanos != null) __obj.updateDynamic("maxCostPerResponseNanos")(maxCostPerResponseNanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveysStartRequest]
  }
}

