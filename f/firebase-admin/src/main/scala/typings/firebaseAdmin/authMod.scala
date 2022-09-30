package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("firebase-admin/lib/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/auth", "Auth")
  @js.native
  open class Auth ()
    extends typings.firebaseAdmin.authAuthMod.Auth
  
  @JSImport("firebase-admin/lib/auth", "BaseAuth")
  @js.native
  abstract class BaseAuth ()
    extends typings.firebaseAdmin.baseAuthMod.BaseAuth
  
  @JSImport("firebase-admin/lib/auth", "MultiFactorInfo")
  @js.native
  abstract class MultiFactorInfo ()
    extends typings.firebaseAdmin.userRecordMod.MultiFactorInfo
  
  @JSImport("firebase-admin/lib/auth", "MultiFactorSettings")
  @js.native
  open class MultiFactorSettings ()
    extends typings.firebaseAdmin.userRecordMod.MultiFactorSettings
  
  @JSImport("firebase-admin/lib/auth", "PhoneMultiFactorInfo")
  @js.native
  open class PhoneMultiFactorInfo ()
    extends typings.firebaseAdmin.userRecordMod.PhoneMultiFactorInfo
  
  @JSImport("firebase-admin/lib/auth", "Tenant")
  @js.native
  open class Tenant ()
    extends typings.firebaseAdmin.tenantMod.Tenant
  /* static members */
  object Tenant {
    
    @JSImport("firebase-admin/lib/auth", "Tenant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates a tenant options object. Throws an error on failure.
      *
      * @param request - The tenant options object to validate.
      * @param createRequest - Whether this is a create request.
      */
    @JSImport("firebase-admin/lib/auth", "Tenant.validate")
    @js.native
    def validate: Any = js.native
    inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("firebase-admin/lib/auth", "TenantAwareAuth")
  @js.native
  open class TenantAwareAuth ()
    extends typings.firebaseAdmin.tenantManagerMod.TenantAwareAuth
  
  @JSImport("firebase-admin/lib/auth", "TenantManager")
  @js.native
  open class TenantManager ()
    extends typings.firebaseAdmin.tenantManagerMod.TenantManager
  
  @JSImport("firebase-admin/lib/auth", "UserInfo")
  @js.native
  open class UserInfo ()
    extends typings.firebaseAdmin.userRecordMod.UserInfo
  
  @JSImport("firebase-admin/lib/auth", "UserMetadata")
  @js.native
  open class UserMetadata ()
    extends typings.firebaseAdmin.userRecordMod.UserMetadata
  
  @JSImport("firebase-admin/lib/auth", "UserRecord")
  @js.native
  open class UserRecord ()
    extends typings.firebaseAdmin.userRecordMod.UserRecord
  
  inline def getAuth(): typings.firebaseAdmin.authAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[typings.firebaseAdmin.authAuthMod.Auth]
  inline def getAuth(app: App): typings.firebaseAdmin.authAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.authAuthMod.Auth]
}
