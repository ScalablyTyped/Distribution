package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFoldersProductsSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of entries that are requested.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to SearchProducts that
    * indicates where this listing should continue from. This field is
    * optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The query to filter the products.  The supported queries are: * List
    * products of all catalogs: empty * List products under a catalog:
    * `parent=catalogs/{catalog_id}` * Get a product by name:
    * `name=catalogs/{catalog_id}/products/{product_id}`
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Required. The name of the resource context. See
    * SearchCatalogsRequest.resource for details.
    */
  var resource: js.UndefOr[String] = js.native
}

