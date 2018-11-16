package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProductAvailabilityChangeEvent extends js.Object {
  /** The new state of the product. This field will always be present. */
  var availabilityStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The id of the product (e.g. "app:com.google.android.gm") for which the product availability changed. This field will always be present. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

