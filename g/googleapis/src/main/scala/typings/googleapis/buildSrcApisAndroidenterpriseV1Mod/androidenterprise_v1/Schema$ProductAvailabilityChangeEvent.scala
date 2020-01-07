package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated whenever a product&#39;s availability changes.
  */
@js.native
trait Schema$ProductAvailabilityChangeEvent extends js.Object {
  /**
    * The new state of the product. This field will always be present.
    */
  var availabilityStatus: js.UndefOr[String] = js.native
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the product availability changed. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
}

object Schema$ProductAvailabilityChangeEvent {
  @scala.inline
  def apply(availabilityStatus: String = null, productId: String = null): Schema$ProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    if (availabilityStatus != null) __obj.updateDynamic("availabilityStatus")(availabilityStatus.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductAvailabilityChangeEvent]
  }
}

