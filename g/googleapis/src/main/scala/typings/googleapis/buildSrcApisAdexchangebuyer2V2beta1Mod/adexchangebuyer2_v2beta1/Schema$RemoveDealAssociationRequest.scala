package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for removing the association between a deal and a creative.
  */
@js.native
trait Schema$RemoveDealAssociationRequest extends js.Object {
  /**
    * The association between a creative and a deal that should be removed.
    */
  var association: js.UndefOr[Schema$CreativeDealAssociation] = js.native
}

object Schema$RemoveDealAssociationRequest {
  @scala.inline
  def apply(association: Schema$CreativeDealAssociation = null): Schema$RemoveDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (association != null) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemoveDealAssociationRequest]
  }
}

