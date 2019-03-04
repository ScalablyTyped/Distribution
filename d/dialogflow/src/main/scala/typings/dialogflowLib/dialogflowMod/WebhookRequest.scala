package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookRequest extends js.Object {
  var originalDetectIntentRequest: js.UndefOr[js.Any] = js.undefined
  var queryResult: QueryResult
  var responseId: java.lang.String
  var session: java.lang.String
}

object WebhookRequest {
  @scala.inline
  def apply(
    queryResult: QueryResult,
    responseId: java.lang.String,
    session: java.lang.String,
    originalDetectIntentRequest: js.Any = null
  ): WebhookRequest = {
    val __obj = js.Dynamic.literal(queryResult = queryResult, responseId = responseId, session = session)
    if (originalDetectIntentRequest != null) __obj.updateDynamic("originalDetectIntentRequest")(originalDetectIntentRequest)
    __obj.asInstanceOf[WebhookRequest]
  }
}

