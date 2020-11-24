package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest extends js.Object {
  
  /**
    * The user-supplied `Association` that is going to be created.  If the
    * `resource` field is set, the
    * `privatecatalogproducer.catalogTargets.associate` permission is checked
    * on the target resource.
    */
  var association: js.UndefOr[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequestOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest] (val x: Self) extends AnyVal {
    
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
    def setAssociation(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Association): Self = this.set("association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociation: Self = this.set("association", js.undefined)
  }
}
