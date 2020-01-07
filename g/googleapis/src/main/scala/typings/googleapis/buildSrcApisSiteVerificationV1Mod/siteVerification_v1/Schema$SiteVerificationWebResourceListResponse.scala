package typings.googleapis.buildSrcApisSiteVerificationV1Mod.siteVerification_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SiteVerificationWebResourceListResponse extends js.Object {
  /**
    * The list of sites that are owned by the authenticated user.
    */
  var items: js.UndefOr[js.Array[Schema$SiteVerificationWebResourceResource]] = js.native
}

object Schema$SiteVerificationWebResourceListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$SiteVerificationWebResourceResource] = null): Schema$SiteVerificationWebResourceListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SiteVerificationWebResourceListResponse]
  }
}

