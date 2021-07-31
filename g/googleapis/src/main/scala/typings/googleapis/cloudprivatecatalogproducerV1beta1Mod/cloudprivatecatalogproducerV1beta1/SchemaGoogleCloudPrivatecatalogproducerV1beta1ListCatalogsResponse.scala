package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse extends StObject {
  
  /**
    * The `Catalogs` returned from the list call.
    */
  var catalogs: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListCatalogs that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponseMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogs(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    @scala.inline
    def setCatalogsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog*): Self = StObject.set(x, "catalogs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
