package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResultsGetRequest extends js.Object {
  var resultMask: js.UndefOr[Schema$ResultsMask] = js.native
}

object Schema$ResultsGetRequest {
  @scala.inline
  def apply(resultMask: Schema$ResultsMask = null): Schema$ResultsGetRequest = {
    val __obj = js.Dynamic.literal()
    if (resultMask != null) __obj.updateDynamic("resultMask")(resultMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultsGetRequest]
  }
}

