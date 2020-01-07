package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarIndex extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the Item. Format: datasources/{source_id}/items/{item_id} <br
    * />This is a required field. The maximum length is 1536 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$IndexItemRequest] = js.native
}

