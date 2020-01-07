package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for associating a deal and a creative.
  */
@js.native
trait Schema$AddDealAssociationRequest extends js.Object {
  /**
    * The association between a creative and a deal that should be added.
    */
  var association: js.UndefOr[Schema$CreativeDealAssociation] = js.native
}

object Schema$AddDealAssociationRequest {
  @scala.inline
  def apply(association: Schema$CreativeDealAssociation = null): Schema$AddDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (association != null) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddDealAssociationRequest]
  }
}

