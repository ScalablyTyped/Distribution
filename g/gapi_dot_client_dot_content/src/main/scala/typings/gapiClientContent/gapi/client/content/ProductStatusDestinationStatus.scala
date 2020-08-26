package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductStatusDestinationStatus extends js.Object {
  /** The destination's approval status. */
  var approvalStatus: js.UndefOr[String] = js.native
  /** The name of the destination */
  var destination: js.UndefOr[String] = js.native
  /** Whether the destination is required, excluded, selected by default or should be validated. */
  var intention: js.UndefOr[String] = js.native
}

object ProductStatusDestinationStatus {
  @scala.inline
  def apply(): ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatusDestinationStatus]
  }
  @scala.inline
  implicit class ProductStatusDestinationStatusOps[Self <: ProductStatusDestinationStatus] (val x: Self) extends AnyVal {
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
    def setApprovalStatus(value: String): Self = this.set("approvalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalStatus: Self = this.set("approvalStatus", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setIntention(value: String): Self = this.set("intention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntention: Self = this.set("intention", js.undefined)
  }
  
}

