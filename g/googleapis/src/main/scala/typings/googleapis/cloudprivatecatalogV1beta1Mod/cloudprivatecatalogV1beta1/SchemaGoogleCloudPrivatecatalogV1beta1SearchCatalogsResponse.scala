package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for PrivateCatalog.SearchCatalogs.
  */
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse extends StObject {
  
  /**
    * The `Catalog`s computed from the resource context.
    */
  var catalogs: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Catalog]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to SearchCatalogs that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponseMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogV1beta1SearchCatalogsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogs(value: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Catalog]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    @scala.inline
    def setCatalogsVarargs(value: SchemaGoogleCloudPrivatecatalogV1beta1Catalog*): Self = StObject.set(x, "catalogs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
