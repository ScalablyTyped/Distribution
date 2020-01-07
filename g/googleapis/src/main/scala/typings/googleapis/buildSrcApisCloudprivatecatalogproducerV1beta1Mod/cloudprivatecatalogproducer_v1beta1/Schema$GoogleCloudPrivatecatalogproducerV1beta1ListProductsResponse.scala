package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to ListProducts that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Product` returned from the list call.
    */
  var products: js.UndefOr[js.Array[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]] = js.native
}

object Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    products: js.Array[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = null
  ): Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  }
}

