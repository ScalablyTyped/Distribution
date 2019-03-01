package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRestrictionsSchemaChangeEvent extends js.Object {
  /** The id of the product (e.g. "app:com.google.android.gm") for which the app restriction schema changed. This field will always be present. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

object AppRestrictionsSchemaChangeEvent {
  @scala.inline
  def apply(productId: java.lang.String = null): AppRestrictionsSchemaChangeEvent = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[AppRestrictionsSchemaChangeEvent]
  }
}

