package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `RemoveProductFromProductSet` method.
  */
@js.native
trait Schema$RemoveProductFromProductSetRequest extends js.Object {
  /**
    * The resource name for the Product to be removed from this ProductSet.
    * Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    */
  var product: js.UndefOr[String] = js.native
}

object Schema$RemoveProductFromProductSetRequest {
  @scala.inline
  def apply(product: String = null): Schema$RemoveProductFromProductSetRequest = {
    val __obj = js.Dynamic.literal()
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemoveProductFromProductSetRequest]
  }
}

