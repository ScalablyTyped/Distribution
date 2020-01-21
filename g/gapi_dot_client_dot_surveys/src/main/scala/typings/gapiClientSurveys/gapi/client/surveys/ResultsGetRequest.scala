package typings.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsGetRequest extends js.Object {
  var resultMask: js.UndefOr[ResultsMask] = js.undefined
}

object ResultsGetRequest {
  @scala.inline
  def apply(resultMask: ResultsMask = null): ResultsGetRequest = {
    val __obj = js.Dynamic.literal()
    if (resultMask != null) __obj.updateDynamic("resultMask")(resultMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsGetRequest]
  }
}

