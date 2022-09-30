package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectManagementMod {
  
  @JSImport("firebase-admin/lib/project-management", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/project-management", "AndroidApp")
  @js.native
  open class AndroidApp ()
    extends typings.firebaseAdmin.androidAppMod.AndroidApp
  
  @JSImport("firebase-admin/lib/project-management", "AppPlatform")
  @js.native
  object AppPlatform extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.firebaseAdmin.appMetadataMod.AppPlatform & String] = js.native
    
    /* "ANDROID" */ val ANDROID: typings.firebaseAdmin.appMetadataMod.AppPlatform.ANDROID & String = js.native
    
    /* "IOS" */ val IOS: typings.firebaseAdmin.appMetadataMod.AppPlatform.IOS & String = js.native
    
    /* "PLATFORM_UNKNOWN" */ val PLATFORM_UNKNOWN: typings.firebaseAdmin.appMetadataMod.AppPlatform.PLATFORM_UNKNOWN & String = js.native
  }
  
  @JSImport("firebase-admin/lib/project-management", "IosApp")
  @js.native
  open class IosApp ()
    extends typings.firebaseAdmin.iosAppMod.IosApp
  
  @JSImport("firebase-admin/lib/project-management", "ProjectManagement")
  @js.native
  open class ProjectManagement ()
    extends typings.firebaseAdmin.projectManagementProjectManagementMod.ProjectManagement
  
  @JSImport("firebase-admin/lib/project-management", "ShaCertificate")
  @js.native
  open class ShaCertificate ()
    extends typings.firebaseAdmin.androidAppMod.ShaCertificate
  
  inline def getProjectManagement(): typings.firebaseAdmin.projectManagementProjectManagementMod.ProjectManagement = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectManagement")().asInstanceOf[typings.firebaseAdmin.projectManagementProjectManagementMod.ProjectManagement]
  inline def getProjectManagement(app: App): typings.firebaseAdmin.projectManagementProjectManagementMod.ProjectManagement = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectManagement")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.projectManagementProjectManagementMod.ProjectManagement]
}
