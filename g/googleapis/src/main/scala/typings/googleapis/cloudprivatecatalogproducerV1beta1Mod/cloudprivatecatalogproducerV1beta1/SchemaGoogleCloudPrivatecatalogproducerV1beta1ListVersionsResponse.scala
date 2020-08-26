package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to ListProducts that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `VersiVersionon` returned from the list call.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Version*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

