package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a product&#39;s approval status is changed.
  */
@js.native
trait SchemaProductApprovalEvent extends js.Object {
  /**
    * Whether the product was approved or unapproved. This field will always be
    * present.
    */
  var approved: js.UndefOr[String] = js.native
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the approval status has changed. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaProductApprovalEvent {
  @scala.inline
  def apply(approved: String = null, productId: String = null): SchemaProductApprovalEvent = {
    val __obj = js.Dynamic.literal()
    if (approved != null) __obj.updateDynamic("approved")(approved.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductApprovalEvent]
  }
}

