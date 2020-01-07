package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsDollarReferenceimagesDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Resource name of the product in which to create the reference image.
    * Format is `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * A user-supplied resource id for the ReferenceImage to be added. If set,
    * the server will attempt to use this value as the resource id. If it is
    * already in use, an error is returned with code ALREADY_EXISTS. Must be at
    * most 128 characters long. It cannot contain the character `/`.
    */
  var referenceImageId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$ReferenceImage] = js.native
}

