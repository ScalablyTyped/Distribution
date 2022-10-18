package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object authMod {
  
  @JSImport("firebase-admin/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/auth", "Auth")
  @js.native
  open class Auth ()
    extends typings.firebaseAdmin.libAuthMod.Auth
  
  /* note: abstract class */ @JSImport("firebase-admin/auth", "BaseAuth")
  @js.native
  open class BaseAuth ()
    extends typings.firebaseAdmin.libAuthMod.BaseAuth
  
  /* note: abstract class */ @JSImport("firebase-admin/auth", "MultiFactorInfo")
  @js.native
  open class MultiFactorInfo ()
    extends typings.firebaseAdmin.libAuthMod.MultiFactorInfo
  
  @JSImport("firebase-admin/auth", "MultiFactorSettings")
  @js.native
  open class MultiFactorSettings ()
    extends typings.firebaseAdmin.libAuthMod.MultiFactorSettings
  
  @JSImport("firebase-admin/auth", "PhoneMultiFactorInfo")
  @js.native
  open class PhoneMultiFactorInfo ()
    extends typings.firebaseAdmin.libAuthMod.PhoneMultiFactorInfo
  
  @JSImport("firebase-admin/auth", "ProjectConfig")
  @js.native
  open class ProjectConfig ()
    extends typings.firebaseAdmin.libAuthMod.ProjectConfig
  /* static members */
  object ProjectConfig {
    
    @JSImport("firebase-admin/auth", "ProjectConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates a project config options object. Throws an error on failure.
      *
      * @param request - The project config options object to validate.
      */
    @JSImport("firebase-admin/auth", "ProjectConfig.validate")
    @js.native
    def validate: Any = js.native
    inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("firebase-admin/auth", "ProjectConfigManager")
  @js.native
  open class ProjectConfigManager ()
    extends typings.firebaseAdmin.libAuthMod.ProjectConfigManager
  
  @JSImport("firebase-admin/auth", "Tenant")
  @js.native
  open class Tenant ()
    extends typings.firebaseAdmin.libAuthMod.Tenant
  /* static members */
  object Tenant {
    
    @JSImport("firebase-admin/auth", "Tenant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates a tenant options object. Throws an error on failure.
      *
      * @param request - The tenant options object to validate.
      * @param createRequest - Whether this is a create request.
      */
    @JSImport("firebase-admin/auth", "Tenant.validate")
    @js.native
    def validate: Any = js.native
    inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("firebase-admin/auth", "TenantAwareAuth")
  @js.native
  open class TenantAwareAuth ()
    extends typings.firebaseAdmin.libAuthMod.TenantAwareAuth
  
  @JSImport("firebase-admin/auth", "TenantManager")
  @js.native
  open class TenantManager ()
    extends typings.firebaseAdmin.libAuthMod.TenantManager
  
  @JSImport("firebase-admin/auth", "UserInfo")
  @js.native
  open class UserInfo ()
    extends typings.firebaseAdmin.libAuthMod.UserInfo
  
  @JSImport("firebase-admin/auth", "UserMetadata")
  @js.native
  open class UserMetadata ()
    extends typings.firebaseAdmin.libAuthMod.UserMetadata
  
  @JSImport("firebase-admin/auth", "UserRecord")
  @js.native
  open class UserRecord ()
    extends typings.firebaseAdmin.libAuthMod.UserRecord
  
  inline def getAuth(): typings.firebaseAdmin.libAuthAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[typings.firebaseAdmin.libAuthAuthMod.Auth]
  inline def getAuth(app: App): typings.firebaseAdmin.libAuthAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libAuthAuthMod.Auth]
}
