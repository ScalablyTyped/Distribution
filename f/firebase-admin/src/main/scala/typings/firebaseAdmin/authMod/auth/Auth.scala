package typings.firebaseAdmin.authMod.auth

import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth extends BaseAuth {
  
  var app: App = js.native
  
  /**
    * @return The tenant manager instance associated with the current project.
    */
  def tenantManager(): TenantManager = js.native
}
