package typings.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubscriptionsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more subscriptions that match
    * the request; this value should be passed in a new
    * `ListSubscriptionsRequest` to get more subscriptions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The subscriptions that match the request. */
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
}

object ListSubscriptionsResponse {
  @scala.inline
  def apply(): ListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsResponse]
  }
  @scala.inline
  implicit class ListSubscriptionsResponseOps[Self <: ListSubscriptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = this.set("subscriptions", js.Array(value :_*))
    @scala.inline
    def setSubscriptions(value: js.Array[Subscription]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
  }
  
}

