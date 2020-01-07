package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest extends js.Object {
  /**
    * The user-supplied `Association` that is going to be created.  If the
    * `resource` field is set, the
    * `privatecatalogproducer.catalogTargets.associate` permission is checked
    * on the target resource.
    */
  var association: js.UndefOr[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
}

object Schema$GoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest {
  @scala.inline
  def apply(association: Schema$GoogleCloudPrivatecatalogproducerV1beta1Association = null): Schema$GoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (association != null) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest]
  }
}

