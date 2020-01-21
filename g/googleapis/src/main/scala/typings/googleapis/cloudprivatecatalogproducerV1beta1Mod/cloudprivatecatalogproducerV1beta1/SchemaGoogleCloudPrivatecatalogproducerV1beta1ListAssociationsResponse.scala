package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse extends js.Object {
  /**
    * The returned `Association` resources from the list call.
    */
  var associations: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]] = js.native
  /**
    * A pagination token returned from a previous call to `ListAssociations`
    * that indicates where the listing should continue from. This field is
    * optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse {
  @scala.inline
  def apply(
    associations: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = null,
    nextPageToken: String = null
  ): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  }
}

