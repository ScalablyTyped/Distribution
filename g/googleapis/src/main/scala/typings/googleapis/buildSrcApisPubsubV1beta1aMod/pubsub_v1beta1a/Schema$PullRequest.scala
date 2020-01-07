package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Pull method.
  */
@js.native
trait Schema$PullRequest extends js.Object {
  /**
    * If this is specified as true the system will respond immediately even if
    * it is not able to return a message in the Pull response. Otherwise the
    * system is allowed to wait until at least one message is available rather
    * than returning FAILED_PRECONDITION. The client may cancel the request if
    * it does not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The subscription from which a message should be pulled.
    */
  var subscription: js.UndefOr[String] = js.native
}

object Schema$PullRequest {
  @scala.inline
  def apply(returnImmediately: js.UndefOr[Boolean] = js.undefined, subscription: String = null): Schema$PullRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PullRequest]
  }
}

