package typings.gapiClientSiteverification.gapi.client.siteverification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteVerificationWebResourceListResponse extends js.Object {
  /** The list of sites that are owned by the authenticated user. */
  var items: js.UndefOr[js.Array[SiteVerificationWebResourceResource]] = js.undefined
}

object SiteVerificationWebResourceListResponse {
  @scala.inline
  def apply(items: js.Array[SiteVerificationWebResourceResource] = null): SiteVerificationWebResourceListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteVerificationWebResourceListResponse]
  }
}

