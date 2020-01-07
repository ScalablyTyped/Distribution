package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of setting the project configuration.
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse extends js.Object {
  /**
    * Project ID of the relying party.
    */
  var projectId: js.UndefOr[String] = js.native
}

object Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse {
  @scala.inline
  def apply(projectId: String = null): Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartySetProjectConfigResponse]
  }
}

