package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for PrivateCatalog.SearchCatalogs.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse extends js.Object {
  
  /**
    * The `Catalog`s computed from the resource context.
    */
  var catalogs: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Catalog]] = js.native
  
  /**
    * A pagination token returned from a previous call to SearchCatalogs that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse] (val x: Self) extends AnyVal {
    
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
    def setCatalogsVarargs(value: SchemaGoogleCloudPrivatecatalogV1beta1Catalog*): Self = this.set("catalogs", js.Array(value :_*))
    
    @scala.inline
    def setCatalogs(value: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Catalog]): Self = this.set("catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogs: Self = this.set("catalogs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
