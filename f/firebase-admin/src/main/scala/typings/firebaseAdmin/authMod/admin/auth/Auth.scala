package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends BaseAuth {
  var app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.app.App */ js.Any = js.native
  /**
    * @return The tenant manager instance associated with the current project.
    */
  def tenantManager(): TenantManager = js.native
}

