package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to ListProducts that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `VersiVersionon` returned from the list call.
    */
  var versions: js.UndefOr[js.Array[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]] = js.native
}

object Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    versions: js.Array[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version] = null
  ): Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  }
}

