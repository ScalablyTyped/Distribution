package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse extends js.Object {
  /**
    * The `Catalogs` returned from the list call.
    */
  var catalogs: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]] = js.native
  /**
    * A pagination token returned from a previous call to ListCatalogs that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] (val x: Self) extends AnyVal {
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
    def setCatalogsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog*): Self = this.set("catalogs", js.Array(value :_*))
    @scala.inline
    def setCatalogs(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]): Self = this.set("catalogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogs: Self = this.set("catalogs", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

