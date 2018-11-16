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

