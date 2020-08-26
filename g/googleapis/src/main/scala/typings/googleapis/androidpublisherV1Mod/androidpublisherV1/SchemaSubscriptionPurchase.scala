package typings.googleapis.androidpublisherV1Mod.androidpublisherV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SubscriptionPurchase resource indicates the status of a user&#39;s
  * subscription purchase.
  */
@js.native
trait SchemaSubscriptionPurchase extends js.Object {
  /**
    * Whether the subscription will automatically be renewed when it reaches
    * its current expiry time.
    */
  var autoRenewing: js.UndefOr[Boolean] = js.native
  /**
    * Time at which the subscription was granted, in milliseconds since the
    * Epoch.
    */
  var initiationTimestampMsec: js.UndefOr[String] = js.native
  /**
    * This kind represents a subscriptionPurchase object in the
    * androidpublisher service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Time at which the subscription will expire, in milliseconds since the
    * Epoch.
    */
  var validUntilTimestampMsec: js.UndefOr[String] = js.native
}

object SchemaSubscriptionPurchase {
  @scala.inline
  def apply(): SchemaSubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchase]
  }
  @scala.inline
  implicit class SchemaSubscriptionPurchaseOps[Self <: SchemaSubscriptionPurchase] (val x: Self) extends AnyVal {
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
    def setAutoRenewing(value: Boolean): Self = this.set("autoRenewing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRenewing: Self = this.set("autoRenewing", js.undefined)
    @scala.inline
    def setInitiationTimestampMsec(value: String): Self = this.set("initiationTimestampMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiationTimestampMsec: Self = this.set("initiationTimestampMsec", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setValidUntilTimestampMsec(value: String): Self = this.set("validUntilTimestampMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidUntilTimestampMsec: Self = this.set("validUntilTimestampMsec", js.undefined)
  }
  
}

