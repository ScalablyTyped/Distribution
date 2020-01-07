package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the product.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.  This field
    * is ignored when creating a product.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Product] = js.native
  /**
    * The FieldMask that specifies which fields to update. If update_mask isn't
    * specified, all mutable fields are to be updated. Valid mask paths include
    * `product_labels`, `display_name`, and `description`.
    */
  var updateMask: js.UndefOr[String] = js.native
}

