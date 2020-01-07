package typings.googleapis.buildSrcApisCloudprivatecatalogV1beta1Mod.cloudprivatecatalog_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for PrivateCatalog.SearchProducts.
  */
@js.native
trait Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to SearchProducts that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Product` resources computed from the resource context.
    */
  var products: js.UndefOr[js.Array[Schema$GoogleCloudPrivatecatalogV1beta1Product]] = js.native
}

object Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    products: js.Array[Schema$GoogleCloudPrivatecatalogV1beta1Product] = null
  ): Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  }
}

