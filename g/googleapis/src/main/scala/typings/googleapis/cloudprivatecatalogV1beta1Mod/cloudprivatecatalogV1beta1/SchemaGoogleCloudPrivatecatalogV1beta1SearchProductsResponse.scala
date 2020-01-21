package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for PrivateCatalog.SearchProducts.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to SearchProducts that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Product` resources computed from the resource context.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Product]] = js.native
}

object SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    products: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Product] = null
  ): SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  }
}

