package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookResponse extends js.Object {
  var followupEventInput: js.UndefOr[EventInput] = js.undefined
  var fulfillmentMessages: js.UndefOr[js.Array[Message]] = js.undefined
  var fulfillmentText: js.UndefOr[java.lang.String] = js.undefined
  var outputContexts: js.UndefOr[js.Array[Context[java.lang.String, _]]] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object WebhookResponse {
  @scala.inline
  def apply(
    followupEventInput: EventInput = null,
    fulfillmentMessages: js.Array[Message] = null,
    fulfillmentText: java.lang.String = null,
    outputContexts: js.Array[Context[java.lang.String, _]] = null,
    payload: js.Any = null,
    source: java.lang.String = null
  ): WebhookResponse = {
    val __obj = js.Dynamic.literal()
    if (followupEventInput != null) __obj.updateDynamic("followupEventInput")(followupEventInput)
    if (fulfillmentMessages != null) __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages)
    if (fulfillmentText != null) __obj.updateDynamic("fulfillmentText")(fulfillmentText)
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[WebhookResponse]
  }
}

