package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest extends StObject {
  
  /**
    * The raw icon bytes user-supplied to be uploaded to the product. The
    * format of the icon can only be PNG or JPEG. The minimum allowed
    * dimensions are 130x130 pixels and the maximum dimensions are 10000x10000
    * pixels. Required.
    */
  var icon: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequestMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
