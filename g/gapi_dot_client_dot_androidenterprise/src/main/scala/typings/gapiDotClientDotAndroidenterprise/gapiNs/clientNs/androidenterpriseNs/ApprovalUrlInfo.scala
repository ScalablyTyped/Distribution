package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApprovalUrlInfo extends js.Object {
  /** A URL that displays a product's permissions and that can also be used to approve the product with the Products.approve call. */
  var approvalUrl: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#approvalUrlInfo". */
  var kind: js.UndefOr[String] = js.undefined
}

object ApprovalUrlInfo {
  @scala.inline
  def apply(approvalUrl: String = null, kind: String = null): ApprovalUrlInfo = {
    val __obj = js.Dynamic.literal()
    if (approvalUrl != null) __obj.updateDynamic("approvalUrl")(approvalUrl)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ApprovalUrlInfo]
  }
}

