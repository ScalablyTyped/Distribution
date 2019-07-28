package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var contentDetails: js.UndefOr[SubscriptionContentDetails] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[SubscriptionSnippet] = js.undefined
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

