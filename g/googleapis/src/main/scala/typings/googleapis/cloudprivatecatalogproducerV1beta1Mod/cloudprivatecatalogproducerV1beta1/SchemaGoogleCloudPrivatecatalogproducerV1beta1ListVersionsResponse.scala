package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse extends StObject {
  
  /**
    * A pagination token returned from a previous call to ListProducts that
    * indicates where the listing should continue from. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The `VersiVersionon` returned from the list call.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponseMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
