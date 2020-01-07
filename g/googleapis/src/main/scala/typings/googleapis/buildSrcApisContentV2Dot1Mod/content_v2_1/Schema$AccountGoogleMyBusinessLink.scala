package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountGoogleMyBusinessLink extends js.Object {
  /**
    * The GMB email address of which a specific account within a GMB account. A
    * sample account within a GMB account could be a business account with set
    * of locations, managed under the GMB account.
    */
  var gmbEmail: js.UndefOr[String] = js.native
  /**
    * Status of the link between this Merchant Center account and the GMB
    * account.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$AccountGoogleMyBusinessLink {
  @scala.inline
  def apply(gmbEmail: String = null, status: String = null): Schema$AccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    if (gmbEmail != null) __obj.updateDynamic("gmbEmail")(gmbEmail.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountGoogleMyBusinessLink]
  }
}

