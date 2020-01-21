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
  def apply(
    nextPageToken: String = null,
    versions: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = null
  ): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  }
}

