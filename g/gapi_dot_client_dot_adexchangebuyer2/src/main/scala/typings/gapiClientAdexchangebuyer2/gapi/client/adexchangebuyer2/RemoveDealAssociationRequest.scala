package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveDealAssociationRequest extends js.Object {
  /** The association between a creative and a deal that should be removed. */
  var association: js.UndefOr[CreativeDealAssociation] = js.undefined
}

object RemoveDealAssociationRequest {
  @scala.inline
  def apply(association: CreativeDealAssociation = null): RemoveDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (association != null) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveDealAssociationRequest]
  }
}

