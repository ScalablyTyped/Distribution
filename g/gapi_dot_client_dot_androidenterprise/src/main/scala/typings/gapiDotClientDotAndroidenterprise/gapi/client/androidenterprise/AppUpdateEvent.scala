package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppUpdateEvent extends js.Object {
  /** The id of the product (e.g. "app:com.google.android.gm") that was updated. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
}

object AppUpdateEvent {
  @scala.inline
  def apply(productId: String = null): AppUpdateEvent = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUpdateEvent]
  }
}

