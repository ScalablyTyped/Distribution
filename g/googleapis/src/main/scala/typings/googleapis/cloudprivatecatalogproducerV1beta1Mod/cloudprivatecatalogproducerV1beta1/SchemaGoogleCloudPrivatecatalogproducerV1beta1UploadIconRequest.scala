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
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequestOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
  }
  
}

