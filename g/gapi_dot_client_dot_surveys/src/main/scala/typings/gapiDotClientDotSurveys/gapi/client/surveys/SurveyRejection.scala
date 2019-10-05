package typings.gapiDotClientDotSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyRejection extends js.Object {
  /** A human-readable explanation of what was wrong with the survey. */
  var explanation: js.UndefOr[String] = js.undefined
  /** Which category of rejection this was. See the  Google Surveys Help Center for additional details on each category. */
  var `type`: js.UndefOr[String] = js.undefined
}

object SurveyRejection {
  @scala.inline
  def apply(explanation: String = null, `type`: String = null): SurveyRejection = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SurveyRejection]
  }
}

