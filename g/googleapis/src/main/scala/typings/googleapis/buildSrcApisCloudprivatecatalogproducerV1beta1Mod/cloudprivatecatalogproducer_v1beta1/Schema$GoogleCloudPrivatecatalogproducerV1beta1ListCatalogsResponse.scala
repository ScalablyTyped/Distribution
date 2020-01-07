package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse extends js.Object {
  /**
    * The `Catalogs` returned from the list call.
    */
  var catalogs: js.UndefOr[js.Array[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]] = js.native
  /**
    * A pagination token returned from a previous call to ListCatalogs that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse {
  @scala.inline
  def apply(
    catalogs: js.Array[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = null,
    nextPageToken: String = null
  ): Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  }
}

