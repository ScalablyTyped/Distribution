package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyRejection extends js.Object {
  var explanation: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SurveyRejection {
  @scala.inline
  def apply(explanation: java.lang.String = null, `type`: java.lang.String = null): SurveyRejection = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SurveyRejection]
  }
}

