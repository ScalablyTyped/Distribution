package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The filter to apply to list results.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A page token, returned from a previous call to
    * FirestoreAdmin.ListIndexes, that may be used to get the next page of
    * results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A parent name of the form
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    */
  var parent: js.UndefOr[String] = js.native
}

