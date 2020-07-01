package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGSuitePrincipal extends js.Object {
  /**
    * This principal represents all users of the G Suite domain of the
    * customer.
    */
  var gsuiteDomain: js.UndefOr[Boolean] = js.native
  /**
    * This principal references a G Suite group account
    */
  var gsuiteGroupEmail: js.UndefOr[String] = js.native
  /**
    * This principal references a G Suite user account
    */
  var gsuiteUserEmail: js.UndefOr[String] = js.native
}

object SchemaGSuitePrincipal {
  @scala.inline
  def apply(
    gsuiteDomain: js.UndefOr[Boolean] = js.undefined,
    gsuiteGroupEmail: String = null,
    gsuiteUserEmail: String = null
  ): SchemaGSuitePrincipal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gsuiteDomain)) __obj.updateDynamic("gsuiteDomain")(gsuiteDomain.get.asInstanceOf[js.Any])
    if (gsuiteGroupEmail != null) __obj.updateDynamic("gsuiteGroupEmail")(gsuiteGroupEmail.asInstanceOf[js.Any])
    if (gsuiteUserEmail != null) __obj.updateDynamic("gsuiteUserEmail")(gsuiteUserEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGSuitePrincipal]
  }
}

