package typings.googleapis.buildSrcApisCloudprivatecatalogV1beta1Mod.cloudprivatecatalog_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for PrivateCatalog.SearchVersions.
  */
@js.native
trait Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse extends js.Object {
  /**
    * A pagination token returned from a previous call to SearchVersions that
    * indicates from where the listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Version` resources computed from the resource context.
    */
  var versions: js.UndefOr[js.Array[Schema$GoogleCloudPrivatecatalogV1beta1Version]] = js.native
}

object Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    versions: js.Array[Schema$GoogleCloudPrivatecatalogV1beta1Version] = null
  ): Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  }
}

