package typings.gapiDotClientDotSurveys.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyResults extends js.Object {
  /** Human readable string describing the status of the request. */
  var status: js.UndefOr[String] = js.undefined
  /** External survey ID as viewable by survey owners in the editor view. */
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

