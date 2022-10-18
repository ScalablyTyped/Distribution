package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseAdmin.libAuthBaseAuthMod.BaseAuth
import typings.firebaseAdmin.libAuthProjectConfigManagerMod.ProjectConfigManager
import typings.firebaseAdmin.libAuthTenantManagerMod.TenantManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthAuthMod {
  
  @JSImport("firebase-admin/lib/auth/auth", "Auth")
  @js.native
  open class Auth () extends BaseAuth {
    
    /**
      * Returns the app associated with this Auth instance.
      *
      * @returns The app associated with this Auth instance.
      */
    def app: App = js.native
    
    /* private */ val app_ : Any = js.native
    
    /**
      * Returns the project config manager instance associated with the current project.
      *
      * @returns The project config manager instance associated with the current project.
      */
    def projectConfigManager(): ProjectConfigManager = js.native
    
    /* private */ val projectConfigManager_ : Any = js.native
    
    /**
      * Returns the tenant manager instance associated with the current project.
      *
      * @returns The tenant manager instance associated with the current project.
      */
    def tenantManager(): TenantManager = js.native
    
    /* private */ val tenantManager_ : Any = js.native
  }
}
