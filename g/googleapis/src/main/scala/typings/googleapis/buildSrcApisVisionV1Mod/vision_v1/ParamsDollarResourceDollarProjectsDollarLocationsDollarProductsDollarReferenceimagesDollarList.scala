package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsDollarReferenceimagesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of items to return. Default 10, maximum 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results to be returned. This is the value
    * of `nextPageToken` returned in a previous reference image list request.
    * Defaults to the first page if not specified.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Resource name of the product containing the reference images.  Format is
    * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
    */
  var parent: js.UndefOr[String] = js.native
}

