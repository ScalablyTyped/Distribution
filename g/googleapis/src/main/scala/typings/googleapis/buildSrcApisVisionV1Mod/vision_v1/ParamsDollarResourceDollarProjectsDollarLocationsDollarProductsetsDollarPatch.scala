package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the ProductSet.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.  This
    * field is ignored when creating a ProductSet.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$ProductSet] = js.native
  /**
    * The FieldMask that specifies which fields to update. If update_mask isn't
    * specified, all mutable fields are to be updated. Valid mask path is
    * `display_name`.
    */
  var updateMask: js.UndefOr[String] = js.native
}

