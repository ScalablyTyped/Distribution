package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaIndexItemOptions extends js.Object {
  /**
    * Specifies if the index request should allow gsuite principals that do not
    * exist or are deleted in the index request.
    */
  var allowUnknownGsuitePrincipals: js.UndefOr[Boolean] = js.native
}

object SchemaIndexItemOptions {
  @scala.inline
  def apply(allowUnknownGsuitePrincipals: js.UndefOr[Boolean] = js.undefined): SchemaIndexItemOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnknownGsuitePrincipals)) __obj.updateDynamic("allowUnknownGsuitePrincipals")(allowUnknownGsuitePrincipals.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIndexItemOptions]
  }
}

