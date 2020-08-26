package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscriptions extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
}

object Subscriptions {
  @scala.inline
  def apply(): Subscriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscriptions]
  }
  @scala.inline
  implicit class SubscriptionsOps[Self <: Subscriptions] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
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

