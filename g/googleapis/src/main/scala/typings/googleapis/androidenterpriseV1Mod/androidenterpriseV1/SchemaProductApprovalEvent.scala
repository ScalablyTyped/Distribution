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
  def apply(): SchemaProductApprovalEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductApprovalEvent]
  }
  @scala.inline
  implicit class SchemaProductApprovalEventOps[Self <: SchemaProductApprovalEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApproved(value: String): Self = this.set("approved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproved: Self = this.set("approved", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
  
}

