package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListProductsInProductSet` method.
  */
@js.native
trait Schema$ListProductsInProductSetResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Products.
    */
  var products: js.UndefOr[js.Array[Schema$Product]] = js.native
}

object Schema$ListProductsInProductSetResponse {
  @scala.inline
  def apply(nextPageToken: String = null, products: js.Array[Schema$Product] = null): Schema$ListProductsInProductSetResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListProductsInProductSetResponse]
  }
}

