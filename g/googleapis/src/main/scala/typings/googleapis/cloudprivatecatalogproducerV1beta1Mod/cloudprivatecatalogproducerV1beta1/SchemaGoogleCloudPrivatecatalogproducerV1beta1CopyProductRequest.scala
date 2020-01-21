package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest extends js.Object {
  /**
    * The resource name of the destination product that is copied to.
    */
  var destinationProductName: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest {
  @scala.inline
  def apply(destinationProductName: String = null): SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationProductName != null) __obj.updateDynamic("destinationProductName")(destinationProductName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest]
  }
}

