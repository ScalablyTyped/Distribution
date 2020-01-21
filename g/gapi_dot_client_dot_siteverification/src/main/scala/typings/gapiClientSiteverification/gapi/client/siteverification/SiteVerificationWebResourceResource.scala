package typings.gapiClientSiteverification.gapi.client.siteverification

import typings.gapiClientSiteverification.AnonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteVerificationWebResourceResource extends js.Object {
  /** The string used to identify this site. This value should be used in the "id" portion of the REST URL for the Get, Update, and Delete operations. */
  var id: js.UndefOr[String] = js.undefined
  /** The email addresses of all verified owners. */
  var owners: js.UndefOr[js.Array[String]] = js.undefined
  /** The address and type of a site that is verified or will be verified. */
  var site: js.UndefOr[AnonIdentifier] = js.undefined
}

object SiteVerificationWebResourceResource {
  @scala.inline
  def apply(id: String = null, owners: js.Array[String] = null, site: AnonIdentifier = null): SiteVerificationWebResourceResource = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteVerificationWebResourceResource]
  }
}

