package typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarGroupsDollarSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The default page size is 200 (max 1000) for the BASIC view, and 50 (max
    * 500) for the FULL view.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous search request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Query string for performing search on groups. Users can search on
    * namespace and label attributes of groups. EXACT match ('=') is supported
    * on namespace, and CONTAINS match (':') is supported on labels. This is a
    * `required` field. Multiple queries can be combined using `AND` operator.
    * The operator is case sensitive. An example query would be:
    * "namespace=<namespace_value> AND labels:<labels_value>".
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Group resource view to be returned. Defaults to [GroupView.BASIC]().
    */
  var view: js.UndefOr[String] = js.native
}

