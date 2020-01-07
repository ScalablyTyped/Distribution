package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse extends js.Object {
  /**
    * The returned `Association` resources from the list call.
    */
  var associations: js.UndefOr[js.Array[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]] = js.native
  /**
    * A pagination token returned from a previous call to `ListAssociations`
    * that indicates where the listing should continue from. This field is
    * optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse {
  @scala.inline
  def apply(
    associations: js.Array[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association] = null,
    nextPageToken: String = null
  ): Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  }
}

