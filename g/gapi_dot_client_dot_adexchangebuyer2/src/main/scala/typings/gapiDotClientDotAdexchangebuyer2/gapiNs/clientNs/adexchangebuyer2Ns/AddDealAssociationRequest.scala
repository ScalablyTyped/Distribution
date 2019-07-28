package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDealAssociationRequest extends js.Object {
  /** The association between a creative and a deal that should be added. */
  var association: js.UndefOr[CreativeDealAssociation] = js.undefined
}

object AddDealAssociationRequest {
  @scala.inline
  def apply(association: CreativeDealAssociation = null): AddDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (association != null) __obj.updateDynamic("association")(association)
    __obj.asInstanceOf[AddDealAssociationRequest]
  }
}

