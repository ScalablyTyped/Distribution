package typings.gapiDotClientDotConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyResults extends js.Object {
  var status: js.UndefOr[String] = js.undefined
  var surveyUrlId: js.UndefOr[String] = js.undefined
}

object SurveyResults {
  @scala.inline
  def apply(status: String = null, surveyUrlId: String = null): SurveyResults = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    if (surveyUrlId != null) __obj.updateDynamic("surveyUrlId")(surveyUrlId)
    __obj.asInstanceOf[SurveyResults]
  }
}

