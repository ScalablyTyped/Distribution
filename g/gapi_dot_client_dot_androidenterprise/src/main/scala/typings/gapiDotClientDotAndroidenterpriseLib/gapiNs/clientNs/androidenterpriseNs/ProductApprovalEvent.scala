package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductApprovalEvent extends js.Object {
  /** Whether the product was approved or unapproved. This field will always be present. */
  var approved: js.UndefOr[java.lang.String] = js.undefined
  /** The id of the product (e.g. "app:com.google.android.gm") for which the approval status has changed. This field will always be present. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

object ProductApprovalEvent {
  @scala.inline
  def apply(approved: java.lang.String = null, productId: java.lang.String = null): ProductApprovalEvent = {
    val __obj = js.Dynamic.literal()
    if (approved != null) __obj.updateDynamic("approved")(approved)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[ProductApprovalEvent]
  }
}

