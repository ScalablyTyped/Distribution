package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

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
trait Schema$AppUpdateEvent extends js.Object {
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) that
    * was updated. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.native
}

object Schema$AppUpdateEvent {
  @scala.inline
  def apply(productId: String = null): Schema$AppUpdateEvent = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppUpdateEvent]
  }
}

