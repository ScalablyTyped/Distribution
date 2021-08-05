package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for PrivateCatalog.SearchVersions.
  */
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse extends StObject {
  
  /**
    * A pagination token returned from a previous call to SearchVersions that
    * indicates from where the listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The `Version` resources computed from the resource context.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Version]] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse {
  
  inline def apply(): SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaGoogleCloudPrivatecatalogV1beta1Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
