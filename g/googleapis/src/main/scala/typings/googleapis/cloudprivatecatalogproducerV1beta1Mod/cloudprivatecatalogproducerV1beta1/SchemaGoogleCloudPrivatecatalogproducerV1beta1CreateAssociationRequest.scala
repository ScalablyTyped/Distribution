package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest extends StObject {
  
  /**
    * The user-supplied `Association` that is going to be created.  If the
    * `resource` field is set, the
    * `privatecatalogproducer.catalogTargets.associate` permission is checked
    * on the target resource.
    */
  var association: js.UndefOr[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequestMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Association): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
