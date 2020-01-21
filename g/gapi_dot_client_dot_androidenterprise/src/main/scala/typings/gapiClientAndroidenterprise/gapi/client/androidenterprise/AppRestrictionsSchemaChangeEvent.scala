package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRestrictionsSchemaChangeEvent extends js.Object {
  /** The id of the product (e.g. "app:com.google.android.gm") for which the app restriction schema changed. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
}

object AppRestrictionsSchemaChangeEvent {
  @scala.inline
  def apply(productId: String = null): AppRestrictionsSchemaChangeEvent = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppRestrictionsSchemaChangeEvent]
  }
}

