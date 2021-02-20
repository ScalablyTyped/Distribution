package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest extends StObject {
  
  /**
    * The resource name of the destination product that is copied to.
    */
  var destinationProductName: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequestMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationProductName(value: String): Self = StObject.set(x, "destinationProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationProductNameUndefined: Self = StObject.set(x, "destinationProductName", js.undefined)
  }
}
