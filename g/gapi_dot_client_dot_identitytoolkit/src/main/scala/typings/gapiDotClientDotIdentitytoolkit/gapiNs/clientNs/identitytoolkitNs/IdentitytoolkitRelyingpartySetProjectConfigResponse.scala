package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySetProjectConfigResponse extends js.Object {
  /** Project ID of the relying party. */
  var projectId: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartySetProjectConfigResponse {
  @scala.inline
  def apply(projectId: String = null): IdentitytoolkitRelyingpartySetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySetProjectConfigResponse]
  }
}

