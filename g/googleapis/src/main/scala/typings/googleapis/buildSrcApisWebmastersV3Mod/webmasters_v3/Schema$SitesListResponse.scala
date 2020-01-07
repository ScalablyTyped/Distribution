package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of sites with access level information.
  */
@js.native
trait Schema$SitesListResponse extends js.Object {
  /**
    * Contains permission level information about a Search Console site. For
    * more information, see Permissions in Search Console.
    */
  var siteEntry: js.UndefOr[js.Array[Schema$WmxSite]] = js.native
}

object Schema$SitesListResponse {
  @scala.inline
  def apply(siteEntry: js.Array[Schema$WmxSite] = null): Schema$SitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (siteEntry != null) __obj.updateDynamic("siteEntry")(siteEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SitesListResponse]
  }
}

