package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Subscription extends js.Object {
  /** The contentDetails object contains basic statistics about the subscription. */
  var contentDetails: js.UndefOr[SubscriptionContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the subscription. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#subscription". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to. */
  var snippet: js.UndefOr[SubscriptionSnippet] = js.undefined
  /** The subscriberSnippet object contains basic details about the sbuscriber. */
  var subscriberSnippet: js.UndefOr[SubscriptionSubscriberSnippet] = js.undefined
}

