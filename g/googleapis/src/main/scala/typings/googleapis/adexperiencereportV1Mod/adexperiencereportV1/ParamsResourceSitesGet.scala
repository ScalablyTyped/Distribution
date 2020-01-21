package typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSitesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The required site name. It should be the site property whose ad
    * experiences may have been reviewed, and it should be URL-encoded. For
    * example, sites/https%3A%2F%2Fwww.google.com. The server will return an
    * error of BAD_REQUEST if this field is not filled in. Note that if the
    * site property is not yet verified in Search Console, the reportUrl field
    * returned by the API will lead to the verification page, prompting the
    * user to go through that process before they can gain access to the Ad
    * Experience Report.
    */
  var name: js.UndefOr[String] = js.native
}

