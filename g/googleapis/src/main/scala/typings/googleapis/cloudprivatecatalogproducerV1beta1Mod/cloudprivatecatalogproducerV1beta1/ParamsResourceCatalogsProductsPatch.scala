package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCatalogsProductsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource name of the product in the format
    * `catalogs/{catalog_id}/products/a-z*[a-z0-9]'.  A unique identifier for
    * the product under a catalog, which cannot be changed after the product is
    * created. The final segment of the name must between 1 and 256 characters
    * in length.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  /**
    * Field mask that controls which fields of the product should be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

