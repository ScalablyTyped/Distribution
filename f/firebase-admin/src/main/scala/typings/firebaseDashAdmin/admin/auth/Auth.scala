package typings.firebaseDashAdmin.admin.auth

import typings.firebaseDashAdmin.admin.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends BaseAuth {
  var app: App = js.native
  /**
    * @return The tenant manager instance associated with the current project.
    */
  def tenantManager(): TenantManager = js.native
}

