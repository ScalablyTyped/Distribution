package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to ListProducts that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Product` returned from the list call.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    products: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = null
  ): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  }
}

