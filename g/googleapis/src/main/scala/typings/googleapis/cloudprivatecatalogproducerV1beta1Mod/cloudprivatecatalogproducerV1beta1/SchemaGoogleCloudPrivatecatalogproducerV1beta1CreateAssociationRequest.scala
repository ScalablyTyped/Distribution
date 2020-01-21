package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(association: SchemaGoogleCloudPrivatecatalogproducerV1beta1Association = null): SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (association != null) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest]
  }
}

