package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthMod {
  
  @JSImport("firebase-admin/lib/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/auth", "Auth")
  @js.native
  open class Auth ()
    extends typings.firebaseAdmin.libAuthAuthMod.Auth
  
  /* note: abstract class */ @JSImport("firebase-admin/lib/auth", "BaseAuth")
  @js.native
  open class BaseAuth ()
    extends typings.firebaseAdmin.libAuthBaseAuthMod.BaseAuth
  
  /* note: abstract class */ @JSImport("firebase-admin/lib/auth", "MultiFactorInfo")
  @js.native
  open class MultiFactorInfo ()
    extends typings.firebaseAdmin.libAuthUserRecordMod.MultiFactorInfo
  
  @JSImport("firebase-admin/lib/auth", "MultiFactorSettings")
  @js.native
  open class MultiFactorSettings ()
    extends typings.firebaseAdmin.libAuthUserRecordMod.MultiFactorSettings
  
  @JSImport("firebase-admin/lib/auth", "PhoneMultiFactorInfo")
  @js.native
  open class PhoneMultiFactorInfo ()
    extends typings.firebaseAdmin.libAuthUserRecordMod.PhoneMultiFactorInfo
  
  @JSImport("firebase-admin/lib/auth", "ProjectConfig")
  @js.native
  open class ProjectConfig ()
    extends typings.firebaseAdmin.libAuthProjectConfigMod.ProjectConfig
  /* static members */
  object ProjectConfig {
    
    @JSImport("firebase-admin/lib/auth", "ProjectConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates a project config options object. Throws an error on failure.
      *
      * @param request - The project config options object to validate.
      */
    @JSImport("firebase-admin/lib/auth", "ProjectConfig.validate")
    @js.native
    def validate: Any = js.native
    inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("firebase-admin/lib/auth", "ProjectConfigManager")
  @js.native
  open class ProjectConfigManager ()
    extends typings.firebaseAdmin.libAuthProjectConfigManagerMod.ProjectConfigManager
  
  @JSImport("firebase-admin/lib/auth", "Tenant")
  @js.native
  open class Tenant ()
    extends typings.firebaseAdmin.libAuthTenantMod.Tenant
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
    extends typings.firebaseAdmin.libAuthTenantManagerMod.TenantAwareAuth
  
  @JSImport("firebase-admin/lib/auth", "TenantManager")
  @js.native
  open class TenantManager ()
    extends typings.firebaseAdmin.libAuthTenantManagerMod.TenantManager
  
  @JSImport("firebase-admin/lib/auth", "UserInfo")
  @js.native
  open class UserInfo ()
    extends typings.firebaseAdmin.libAuthUserRecordMod.UserInfo
  
  @JSImport("firebase-admin/lib/auth", "UserMetadata")
  @js.native
  open class UserMetadata ()
    extends typings.firebaseAdmin.libAuthUserRecordMod.UserMetadata
  
  @JSImport("firebase-admin/lib/auth", "UserRecord")
  @js.native
  open class UserRecord ()
    extends typings.firebaseAdmin.libAuthUserRecordMod.UserRecord
  
  inline def getAuth(): typings.firebaseAdmin.libAuthAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[typings.firebaseAdmin.libAuthAuthMod.Auth]
  inline def getAuth(app: App): typings.firebaseAdmin.libAuthAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libAuthAuthMod.Auth]
}
