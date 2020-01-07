package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription resource contains information about a YouTube user
  * subscription. A subscription notifies a user when new videos are added to a
  * channel or when another user takes one of several actions on YouTube, such
  * as uploading a video, rating a video, or commenting on a video.
  */
@js.native
trait Schema$Subscription extends js.Object {
  /**
    * The contentDetails object contains basic statistics about the
    * subscription.
    */
  var contentDetails: js.UndefOr[Schema$SubscriptionContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the subscription.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#subscription&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the subscription,
    * including its title and the channel that the user subscribed to.
    */
  var snippet: js.UndefOr[Schema$SubscriptionSnippet] = js.native
  /**
    * The subscriberSnippet object contains basic details about the sbuscriber.
    */
  var subscriberSnippet: js.UndefOr[Schema$SubscriptionSubscriberSnippet] = js.native
}

object Schema$Subscription {
  @scala.inline
  def apply(
    contentDetails: Schema$SubscriptionContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$SubscriptionSnippet = null,
    subscriberSnippet: Schema$SubscriptionSubscriberSnippet = null
  ): Schema$Subscription = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (subscriberSnippet != null) __obj.updateDynamic("subscriberSnippet")(subscriberSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Subscription]
  }
}

