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
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequestOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest] (val x: Self) extends AnyVal {
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
    def setDestinationProductName(value: String): Self = this.set("destinationProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationProductName: Self = this.set("destinationProductName", js.undefined)
  }
  
}

