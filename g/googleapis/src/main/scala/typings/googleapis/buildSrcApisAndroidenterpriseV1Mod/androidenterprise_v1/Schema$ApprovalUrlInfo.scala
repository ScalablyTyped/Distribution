package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information on an approval URL.
  */
@js.native
trait Schema$ApprovalUrlInfo extends js.Object {
  /**
    * A URL that displays a product&#39;s permissions and that can also be used
    * to approve the product with the Products.approve call.
    */
  var approvalUrl: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#approvalUrlInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ApprovalUrlInfo {
  @scala.inline
  def apply(approvalUrl: String = null, kind: String = null): Schema$ApprovalUrlInfo = {
    val __obj = js.Dynamic.literal()
    if (approvalUrl != null) __obj.updateDynamic("approvalUrl")(approvalUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApprovalUrlInfo]
  }
}

