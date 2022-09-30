package typings.firebaseAdmin

import typings.firebaseAdmin.androidAppMod.AndroidApp
import typings.firebaseAdmin.androidAppMod.ShaCertificate
import typings.firebaseAdmin.appMetadataMod.AppMetadata
import typings.firebaseAdmin.coreMod.App
import typings.firebaseAdmin.iosAppMod.IosApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectManagementProjectManagementMod {
  
  @JSImport("firebase-admin/lib/project-management/project-management", "ProjectManagement")
  @js.native
  open class ProjectManagement () extends StObject {
    
    /**
      * Creates an `AndroidApp` object, referencing the specified Android app within
      * this Firebase project.
      *
      * This method does not perform an RPC.
      *
      * @param appId - The `appId` of the Android app to reference.
      *
      * @returns An `AndroidApp` object that references the specified Firebase Android app.
      */
    def androidApp(appId: String): AndroidApp = js.native
    
    val app: App = js.native
    
    /* private */ var assertListAppsResponseData: Any = js.native
    
    /**
      * Creates a new Firebase Android app associated with this Firebase project.
      *
      * @param packageName - The canonical package name of the Android App,
      *     as would appear in the Google Play Developer Console.
      * @param displayName - An optional user-assigned display name for this
      *     new app.
      *
      * @returns A promise that resolves to the newly created Android app.
      */
    def createAndroidApp(packageName: String): js.Promise[AndroidApp] = js.native
    def createAndroidApp(packageName: String, displayName: String): js.Promise[AndroidApp] = js.native
    
    /**
      * Creates a new Firebase iOS app associated with this Firebase project.
      *
      * @param bundleId - The iOS app bundle ID to use for this new app.
      * @param displayName - An optional user-assigned display name for this
      *     new app.
      *
      * @returns A promise that resolves to the newly created iOS app.
      */
    def createIosApp(bundleId: String): js.Promise[IosApp] = js.native
    def createIosApp(bundleId: String, displayName: String): js.Promise[IosApp] = js.native
    
    /* private */ var getProjectId: Any = js.native
    
    /* private */ var getResourceName: Any = js.native
    
    /**
      * Creates an `iOSApp` object, referencing the specified iOS app within
      * this Firebase project.
      *
      * This method does not perform an RPC.
      *
      * @param appId - The `appId` of the iOS app to reference.
      *
      * @returns An `iOSApp` object that references the specified Firebase iOS app.
      */
    def iosApp(appId: String): IosApp = js.native
    
    /**
      * Lists up to 100 Firebase Android apps associated with this Firebase project.
      *
      * @returns The list of Android apps.
      */
    def listAndroidApps(): js.Promise[js.Array[AndroidApp]] = js.native
    
    /**
      * Lists up to 100 Firebase apps associated with this Firebase project.
      *
      * @returns A promise that resolves to the metadata list of the apps.
      */
    def listAppMetadata(): js.Promise[js.Array[AppMetadata]] = js.native
    
    /**
      * Lists up to 100 Firebase iOS apps associated with this Firebase project.
      *
      * @returns The list of iOS apps.
      */
    def listIosApps(): js.Promise[js.Array[IosApp]] = js.native
    
    /**
      * Lists up to 100 Firebase apps for a specified platform, associated with this Firebase project.
      */
    /* private */ var listPlatformApps: Any = js.native
    
    /* private */ var projectId: Any = js.native
    
    /* private */ val requestHandler: Any = js.native
    
    /**
      * Update the display name of this Firebase project.
      *
      * @param newDisplayName - The new display name to be updated.
      *
      * @returns A promise that resolves when the project display name has been updated.
      */
    def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
    
    /**
      * Creates a `ShaCertificate` object.
      *
      * This method does not perform an RPC.
      *
      * @param shaHash - The SHA-1 or SHA-256 hash for this certificate.
      *
      * @returns A `ShaCertificate` object contains the specified SHA hash.
      */
    def shaCertificate(shaHash: String): ShaCertificate = js.native
    
    /* private */ var transformResponseToAppMetadata: Any = js.native
  }
}
