package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse extends StObject {
  
  /**
    * The returned `Association` resources from the list call.
    */
  var associations: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to `ListAssociations`
    * that indicates where the listing should continue from. This field is
    * optional.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse {
  
  inline def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse](x: Self) {
    
    inline def setAssociations(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setAssociationsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Association*): Self = StObject.set(x, "associations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
