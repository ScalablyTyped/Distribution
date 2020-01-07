package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCatalogsDollarAssociationsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of catalog associations to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from the previous call to `ListAssociations`.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The resource name of the `Catalog` whose `Associations` are being
    * retrieved. In the format `catalogs/<catalog>`.
    */
  var parent: js.UndefOr[String] = js.native
}

