package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  /** The contentDetails object contains basic statistics about the subscription. */
  var contentDetails: js.UndefOr[SubscriptionContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the subscription. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#subscription". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to. */
  var snippet: js.UndefOr[SubscriptionSnippet] = js.undefined
  /** The subscriberSnippet object contains basic details about the sbuscriber. */
  var subscriberSnippet: js.UndefOr[SubscriptionSubscriberSnippet] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    contentDetails: SubscriptionContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: SubscriptionSnippet = null,
    subscriberSnippet: SubscriptionSubscriberSnippet = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (subscriberSnippet != null) __obj.updateDynamic("subscriberSnippet")(subscriberSnippet)
    __obj.asInstanceOf[Subscription]
  }
}

