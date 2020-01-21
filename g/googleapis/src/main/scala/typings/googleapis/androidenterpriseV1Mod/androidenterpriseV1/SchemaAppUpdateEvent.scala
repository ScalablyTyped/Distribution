package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a new version of an app is uploaded to Google Play.
  * Notifications are sent for new public versions only: alpha, beta, or canary
  * versions do not generate this event. To fetch up-to-date version history
  * for an app, use Products.Get on the EMM API.
  */
@js.native
trait SchemaAppUpdateEvent extends js.Object {
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) that
    * was updated. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaAppUpdateEvent {
  @scala.inline
  def apply(productId: String = null): SchemaAppUpdateEvent = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppUpdateEvent]
  }
}

