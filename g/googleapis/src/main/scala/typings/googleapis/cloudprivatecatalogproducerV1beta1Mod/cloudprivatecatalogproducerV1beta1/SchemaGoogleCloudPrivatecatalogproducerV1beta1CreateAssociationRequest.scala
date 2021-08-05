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
  
  inline def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest]
  }
  
  extension [Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest](x: Self) {
    
    inline def setAssociation(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Association): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
