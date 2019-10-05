package typings.gapiDotClientDotConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyRejection extends js.Object {
  var explanation: js.UndefOr[String] = js.undefined
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

