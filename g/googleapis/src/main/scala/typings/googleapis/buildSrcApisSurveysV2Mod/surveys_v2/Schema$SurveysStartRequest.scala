package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SurveysStartRequest extends js.Object {
  /**
    * *Deprecated* Threshold to start a survey automatically if the quoted
    * prices is less than or equal to this value. See Survey.Cost for more
    * details. This will no longer be available after June 2018.
    */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
}

object Schema$SurveysStartRequest {
  @scala.inline
  def apply(maxCostPerResponseNanos: String = null): Schema$SurveysStartRequest = {
    val __obj = js.Dynamic.literal()
    if (maxCostPerResponseNanos != null) __obj.updateDynamic("maxCostPerResponseNanos")(maxCostPerResponseNanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SurveysStartRequest]
  }
}

