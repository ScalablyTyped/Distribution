package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectManagementProjectManagementNamespaceMod {
  
  object projectManagement {
    
    inline def apply(): ProjectManagement = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ProjectManagement]
    inline def apply(app: App): ProjectManagement = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[ProjectManagement]
    
    @JSImport("firebase-admin/lib/project-management/project-management-namespace", "projectManagement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.project-management#AndroidApp}.
      */
    type AndroidApp = typings.firebaseAdmin.libProjectManagementAndroidAppMod.AndroidApp
    
    /**
      * Type alias to {@link firebase-admin.project-management#AndroidAppMetadata}.
      */
    type AndroidAppMetadata = typings.firebaseAdmin.libProjectManagementAndroidAppMod.AndroidAppMetadata
    
    /**
      * Type alias to {@link firebase-admin.project-management#AppMetadata}.
      */
    type AppMetadata = typings.firebaseAdmin.libProjectManagementAppMetadataMod.AppMetadata
    
    /**
      * Type alias to {@link firebase-admin.project-management#AppPlatform}.
      */
    type AppPlatform = typings.firebaseAdmin.libProjectManagementAppMetadataMod.AppPlatform
    
    /**
      * Type alias to {@link firebase-admin.project-management#IosApp}.
      */
    type IosApp = typings.firebaseAdmin.libProjectManagementIosAppMod.IosApp
    
    /**
      * Type alias to {@link firebase-admin.project-management#IosAppMetadata}.
      */
    type IosAppMetadata = typings.firebaseAdmin.libProjectManagementIosAppMod.IosAppMetadata
    
    /**
      * Type alias to {@link firebase-admin.project-management#ProjectManagement}.
      */
    type ProjectManagement = typings.firebaseAdmin.libProjectManagementProjectManagementMod.ProjectManagement
    
    /**
      * Type alias to {@link firebase-admin.project-management#ShaCertificate}.
      */
    type ShaCertificate = typings.firebaseAdmin.libProjectManagementAndroidAppMod.ShaCertificate
  }
}
