package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectManagementNamespaceMod {
  
  object projectManagement {
    
    inline def apply(): ProjectManagement = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ProjectManagement]
    inline def apply(app: App): ProjectManagement = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[ProjectManagement]
    
    @JSImport("firebase-admin/lib/project-management/project-management-namespace", "projectManagement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.project-management#AndroidApp}.
      */
    type AndroidApp = typings.firebaseAdmin.androidAppMod.AndroidApp
    
    /**
      * Type alias to {@link firebase-admin.project-management#AndroidAppMetadata}.
      */
    type AndroidAppMetadata = typings.firebaseAdmin.androidAppMod.AndroidAppMetadata
    
    /**
      * Type alias to {@link firebase-admin.project-management#AppMetadata}.
      */
    type AppMetadata = typings.firebaseAdmin.appMetadataMod.AppMetadata
    
    /**
      * Type alias to {@link firebase-admin.project-management#AppPlatform}.
      */
    type AppPlatform = typings.firebaseAdmin.appMetadataMod.AppPlatform
    
    /**
      * Type alias to {@link firebase-admin.project-management#IosApp}.
      */
    type IosApp = typings.firebaseAdmin.iosAppMod.IosApp
    
    /**
      * Type alias to {@link firebase-admin.project-management#IosAppMetadata}.
      */
    type IosAppMetadata = typings.firebaseAdmin.iosAppMod.IosAppMetadata
    
    /**
      * Type alias to {@link firebase-admin.project-management#ProjectManagement}.
      */
    type ProjectManagement = typings.firebaseAdmin.projectManagementProjectManagementMod.ProjectManagement
    
    /**
      * Type alias to {@link firebase-admin.project-management#ShaCertificate}.
      */
    type ShaCertificate = typings.firebaseAdmin.androidAppMod.ShaCertificate
  }
}
