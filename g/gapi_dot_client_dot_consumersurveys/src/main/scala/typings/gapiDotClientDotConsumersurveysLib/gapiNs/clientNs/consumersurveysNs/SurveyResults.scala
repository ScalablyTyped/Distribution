package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyResults extends js.Object {
  var status: js.UndefOr[java.lang.String] = js.undefined
  var surveyUrlId: js.UndefOr[java.lang.String] = js.undefined
}

object SurveyResults {
  @scala.inline
  def apply(status: java.lang.String = null, surveyUrlId: java.lang.String = null): SurveyResults = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    if (surveyUrlId != null) __obj.updateDynamic("surveyUrlId")(surveyUrlId)
    __obj.asInstanceOf[SurveyResults]
  }
}

