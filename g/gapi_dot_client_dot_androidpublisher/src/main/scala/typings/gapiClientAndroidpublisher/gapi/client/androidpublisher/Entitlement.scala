package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entitlement extends js.Object {
  /** This kind represents an entitlement object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.native
  /** The SKU of the product. */
  var productId: js.UndefOr[String] = js.native
  /**
    * The type of the inapp product. Possible values are:
    * - In-app item: "inapp"
    * - Subscription: "subs"
    */
  var productType: js.UndefOr[String] = js.native
  /** The token which can be verified using the subscriptions or products API. */
  var token: js.UndefOr[String] = js.native
}

object Entitlement {
  @scala.inline
  def apply(): Entitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entitlement]
  }
  @scala.inline
  implicit class EntitlementOps[Self <: Entitlement] (val x: Self) extends AnyVal {
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setProductType(value: String): Self = this.set("productType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductType: Self = this.set("productType", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

