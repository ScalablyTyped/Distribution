package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for PrivateCatalog.SearchVersions.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to SearchVersions that
    * indicates from where the listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Version` resources computed from the resource context.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Version]] = js.native
}

object SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    versions: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Version] = null
  ): SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  }
}

