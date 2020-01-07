package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the PullBatch method.
  */
@js.native
trait Schema$PullBatchRequest extends js.Object {
  /**
    * The maximum number of PubsubEvents returned for this request. The Pub/Sub
    * system may return fewer than the number of events specified.
    */
  var maxEvents: js.UndefOr[Double] = js.native
  /**
    * If this is specified as true the system will respond immediately even if
    * it is not able to return a message in the Pull response. Otherwise the
    * system is allowed to wait until at least one message is available rather
    * than returning no messages. The client may cancel the request if it does
    * not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The subscription from which messages should be pulled.
    */
  var subscription: js.UndefOr[String] = js.native
}

object Schema$PullBatchRequest {
  @scala.inline
  def apply(
    maxEvents: Int | Double = null,
    returnImmediately: js.UndefOr[Boolean] = js.undefined,
    subscription: String = null
  ): Schema$PullBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (maxEvents != null) __obj.updateDynamic("maxEvents")(maxEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PullBatchRequest]
  }
}

