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

