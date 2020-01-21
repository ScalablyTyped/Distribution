package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest extends js.Object {
  /**
    * The raw icon bytes user-supplied to be uploaded to the product. The
    * format of the icon can only be PNG or JPEG. The minimum allowed
    * dimensions are 130x130 pixels and the maximum dimensions are 10000x10000
    * pixels. Required.
    */
  var icon: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest {
  @scala.inline
  def apply(icon: String = null): SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest]
  }
}

