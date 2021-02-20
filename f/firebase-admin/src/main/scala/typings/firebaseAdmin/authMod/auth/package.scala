package typings.firebaseAdmin.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object auth {
  
  @scala.inline
  def apply(): typings.firebaseAdmin.authMod.auth.Auth = typings.firebaseAdmin.authMod.auth.^.asInstanceOf[js.Dynamic].applyDynamic("auth")().asInstanceOf[typings.firebaseAdmin.authMod.auth.Auth]
  @scala.inline
  def apply(app: typings.firebaseAdmin.firebaseNamespaceApiMod.app.App): typings.firebaseAdmin.authMod.auth.Auth = typings.firebaseAdmin.authMod.auth.^.asInstanceOf[js.Dynamic].applyDynamic("auth")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.authMod.auth.Auth]
  
  /**
    * Identifies a second factor type.
    */
  type AuthFactorType = typings.firebaseAdmin.firebaseAdminStrings.phone
  
  /**
    * Interface representing the properties to set on a new tenant.
    */
  type CreateTenantRequest = typings.firebaseAdmin.authMod.auth.UpdateTenantRequest
}
