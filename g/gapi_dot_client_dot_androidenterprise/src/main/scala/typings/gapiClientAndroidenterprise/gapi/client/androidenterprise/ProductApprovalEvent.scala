package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductApprovalEvent extends js.Object {
  /** Whether the product was approved or unapproved. This field will always be present. */
  var approved: js.UndefOr[String] = js.undefined
  /** The id of the product (e.g. "app:com.google.android.gm") for which the approval status has changed. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
}

object ProductApprovalEvent {
  @scala.inline
  def apply(approved: String = null, productId: String = null): ProductApprovalEvent = {
    val __obj = js.Dynamic.literal()
    if (approved != null) __obj.updateDynamic("approved")(approved.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductApprovalEvent]
  }
}

