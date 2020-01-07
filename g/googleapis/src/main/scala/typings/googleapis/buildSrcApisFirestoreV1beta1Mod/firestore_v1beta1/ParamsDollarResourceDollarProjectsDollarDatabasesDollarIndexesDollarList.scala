package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    *
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The standard List page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The standard List page token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The database name. For example:
    * `projects/{project_id}/databases/{database_id}`
    */
  var parent: js.UndefOr[String] = js.native
}

