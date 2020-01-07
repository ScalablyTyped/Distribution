package typings.googleapis.buildSrcApisCloudprivatecatalogV1beta1Mod.cloudprivatecatalog_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarCatalogsDollarSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of entries that are requested.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to SearchCatalogs that
    * indicates where this listing should continue from. This field is
    * optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The query to filter the catalogs. The supported queries are:  * Get a
    * single catalog: `name=catalogs/{catalog_id}`
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Required. The name of the resource context. It can be in following
    * formats:  * `projects/{project_id}` * `folders/{folder_id}` *
    * `organizations/{organization_id}`
    */
  var resource: js.UndefOr[String] = js.native
}

