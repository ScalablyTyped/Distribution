package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalUrlInfo extends js.Object {
  /** A URL that displays a product's permissions and that can also be used to approve the product with the Products.approve call. */
  var approvalUrl: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#approvalUrlInfo". */
  var kind: js.UndefOr[String] = js.native
}

object ApprovalUrlInfo {
  @scala.inline
  def apply(): ApprovalUrlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalUrlInfo]
  }
  @scala.inline
  implicit class ApprovalUrlInfoOps[Self <: ApprovalUrlInfo] (val x: Self) extends AnyVal {
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
    def setApprovalUrl(value: String): Self = this.set("approvalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalUrl: Self = this.set("approvalUrl", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

