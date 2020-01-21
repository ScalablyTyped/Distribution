package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for PrivateCatalog.SearchCatalogs.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse extends js.Object {
  /**
    * The `Catalog`s computed from the resource context.
    */
  var catalogs: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Catalog]] = js.native
  /**
    * A pagination token returned from a previous call to SearchCatalogs that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse {
  @scala.inline
  def apply(
    catalogs: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Catalog] = null,
    nextPageToken: String = null
  ): SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse]
  }
}

