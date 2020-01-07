package typings.googleapis.buildSrcApisSiteVerificationV1Mod.siteVerification_v1

import typings.googleapis.Anon_Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SiteVerificationWebResourceResource extends js.Object {
  /**
    * The string used to identify this site. This value should be used in the
    * &quot;id&quot; portion of the REST URL for the Get, Update, and Delete
    * operations.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The email addresses of all verified owners.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * The address and type of a site that is verified or will be verified.
    */
  var site: js.UndefOr[Anon_Identifier] = js.native
}

object Schema$SiteVerificationWebResourceResource {
  @scala.inline
  def apply(id: String = null, owners: js.Array[String] = null, site: Anon_Identifier = null): Schema$SiteVerificationWebResourceResource = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SiteVerificationWebResourceResource]
  }
}

