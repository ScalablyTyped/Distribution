package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSitesDollarVersionsDollarFilesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The page size to return. Defaults to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token from a previous request, if provided. This will be
    * the encoded version of a
    * firebase.hosting.proto.metadata.ListFilesPageToken.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The parent to list files for, in the format:
    * <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The type of files in the version that should be listed.
    */
  var status: js.UndefOr[String] = js.native
}

