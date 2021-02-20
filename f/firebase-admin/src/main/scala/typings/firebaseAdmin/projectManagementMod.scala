package typings.firebaseAdmin

import typings.firebaseAdmin.firebaseAdminStrings.sha1_
import typings.firebaseAdmin.firebaseAdminStrings.sha256_
import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.ANDROID
import typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.IOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectManagementMod {
  
  object projectManagement {
    
    @JSImport("firebase-admin/lib/project-management", "projectManagement")
    @js.native
    def apply(): ProjectManagement = js.native
    @JSImport("firebase-admin/lib/project-management", "projectManagement")
    @js.native
    def apply(app: App): ProjectManagement = js.native
    
    @js.native
    sealed trait AppPlatform extends StObject
    /**
      * Platforms with which a Firebase App can be associated.
      */
    @JSImport("firebase-admin/lib/project-management", "projectManagement.AppPlatform")
    @js.native
    object AppPlatform extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[AppPlatform with String] = js.native
      
      /**
        * The Firebase App is associated with Android.
        */
      @js.native
      sealed trait ANDROID extends AppPlatform
      /* "ANDROID" */ val ANDROID: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.ANDROID with String = js.native
      
      /**
        * The Firebase App is associated with iOS.
        */
      @js.native
      sealed trait IOS extends AppPlatform
      /* "IOS" */ val IOS: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.IOS with String = js.native
      
      /**
        * Unknown state. This is only used for distinguishing unset values.
        */
      @js.native
      sealed trait PLATFORM_UNKNOWN extends AppPlatform
      /* "PLATFORM_UNKNOWN" */ val PLATFORM_UNKNOWN: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.PLATFORM_UNKNOWN with String = js.native
    }
    
    /**
      * A reference to a Firebase Android app.
      *
      * Do not call this constructor directly. Instead, use
      * [`projectManagement.androidApp()`](projectManagement.ProjectManagement#androidApp).
      */
    @js.native
    trait AndroidApp extends StObject {
      
      /**
        * Adds the given SHA certificate to this Android app.
        *
        * @param certificateToAdd The SHA certificate to add.
        *
        * @return A promise that resolves when the given certificate
        *     has been added to the Android app.
        */
      def addShaCertificate(certificateToAdd: ShaCertificate): js.Promise[Unit] = js.native
      
      var appId: String = js.native
      
      /**
        * Deletes the specified SHA certificate from this Android app.
        *
        * @param  certificateToDelete The SHA certificate to delete.
        *
        * @return A promise that resolves when the specified
        *     certificate has been removed from the Android app.
        */
      def deleteShaCertificate(certificateToRemove: ShaCertificate): js.Promise[Unit] = js.native
      
      /**
        * Gets the configuration artifact associated with this app.
        *
        * @return A promise that resolves to the Android app's
        *     Firebase config file, in UTF-8 string format. This string is typically
        *     intended to be written to a JSON file that gets shipped with your Android
        *     app.
        */
      def getConfig(): js.Promise[String] = js.native
      
      /**
        * Retrieves metadata about this Android app.
        *
        * @return A promise that resolves to the retrieved metadata about this Android app.
        */
      def getMetadata(): js.Promise[AndroidAppMetadata] = js.native
      
      /**
        * Gets the list of SHA certificates associated with this Android app in Firebase.
        *
        * @return The list of SHA-1 and SHA-256 certificates associated with this Android app in
        *     Firebase.
        */
      def getShaCertificates(): js.Promise[js.Array[ShaCertificate]] = js.native
      
      /**
        * Sets the optional user-assigned display name of the app.
        *
        * @param newDisplayName The new display name to set.
        *
        * @return A promise that resolves when the display name has been set.
        */
      def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
    }
    object AndroidApp {
      
      @scala.inline
      def apply(
        addShaCertificate: ShaCertificate => js.Promise[Unit],
        appId: String,
        deleteShaCertificate: ShaCertificate => js.Promise[Unit],
        getConfig: () => js.Promise[String],
        getMetadata: () => js.Promise[AndroidAppMetadata],
        getShaCertificates: () => js.Promise[js.Array[ShaCertificate]],
        setDisplayName: String => js.Promise[Unit]
      ): AndroidApp = {
        val __obj = js.Dynamic.literal(addShaCertificate = js.Any.fromFunction1(addShaCertificate), appId = appId.asInstanceOf[js.Any], deleteShaCertificate = js.Any.fromFunction1(deleteShaCertificate), getConfig = js.Any.fromFunction0(getConfig), getMetadata = js.Any.fromFunction0(getMetadata), getShaCertificates = js.Any.fromFunction0(getShaCertificates), setDisplayName = js.Any.fromFunction1(setDisplayName))
        __obj.asInstanceOf[AndroidApp]
      }
      
      @scala.inline
      implicit class AndroidAppMutableBuilder[Self <: AndroidApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddShaCertificate(value: ShaCertificate => js.Promise[Unit]): Self = StObject.set(x, "addShaCertificate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteShaCertificate(value: ShaCertificate => js.Promise[Unit]): Self = StObject.set(x, "deleteShaCertificate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetConfig(value: () => js.Promise[String]): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMetadata(value: () => js.Promise[AndroidAppMetadata]): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetShaCertificates(value: () => js.Promise[js.Array[ShaCertificate]]): Self = StObject.set(x, "getShaCertificates", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetDisplayName(value: String => js.Promise[Unit]): Self = StObject.set(x, "setDisplayName", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Metadata about a Firebase Android App.
      */
    @js.native
    trait AndroidAppMetadata extends AppMetadata {
      
      /**
        * The canonical package name of the Android App, as would appear in the Google Play Developer
        * Console.
        *
        * @example
        * ```javascript
        * var packageName = androidAppMetadata.packageName;
        * ```
        */
      var packageName: String = js.native
      
      @JSName("platform")
      var platform_AndroidAppMetadata: ANDROID = js.native
    }
    object AndroidAppMetadata {
      
      @scala.inline
      def apply(appId: String, packageName: String, platform: ANDROID, projectId: String, resourceName: String): AndroidAppMetadata = {
        val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
        __obj.asInstanceOf[AndroidAppMetadata]
      }
      
      @scala.inline
      implicit class AndroidAppMetadataMutableBuilder[Self <: AndroidAppMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlatform(value: ANDROID): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Metadata about a Firebase app.
      */
    @js.native
    trait AppMetadata extends StObject {
      
      /**
        * The globally unique, Firebase-assigned identifier of the app.
        *
        * @example
        * ```javascript
        * var appId = appMetadata.appId;
        * ```
        */
      var appId: String = js.native
      
      /**
        * The optional user-assigned display name of the app.
        *
        * @example
        * ```javascript
        * var displayName = appMetadata.displayName;
        * ```
        */
      var displayName: js.UndefOr[String] = js.native
      
      /**
        * The development platform of the app. Supporting Android and iOS app platforms.
        *
        * @example
        * ```javascript
        * var platform = AppPlatform.ANDROID;
        * ```
        */
      var platform: AppPlatform = js.native
      
      /**
        * The globally unique, user-assigned ID of the parent project for the app.
        *
        * @example
        * ```javascript
        * var projectId = appMetadata.projectId;
        * ```
        */
      var projectId: String = js.native
      
      /**
        * The fully-qualified resource name that identifies this app.
        *
        * This is useful when manually constructing requests for Firebase's public API.
        *
        * @example
        * ```javascript
        * var resourceName = androidAppMetadata.resourceName;
        * ```
        */
      var resourceName: String = js.native
    }
    object AppMetadata {
      
      @scala.inline
      def apply(appId: String, platform: AppPlatform, projectId: String, resourceName: String): AppMetadata = {
        val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
        __obj.asInstanceOf[AppMetadata]
      }
      
      @scala.inline
      implicit class AppMetadataMutableBuilder[Self <: AppMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setPlatform(value: AppPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A reference to a Firebase iOS app.
      *
      * Do not call this constructor directly. Instead, use
      * [`projectManagement.iosApp()`](projectManagement.ProjectManagement#iosApp).
      */
    @js.native
    trait IosApp extends StObject {
      
      var appId: String = js.native
      
      /**
        * Gets the configuration artifact associated with this app.
        *
        * @return A promise that resolves to the iOS app's Firebase
        *     config file, in UTF-8 string format. This string is typically intended to
        *     be written to a plist file that gets shipped with your iOS app.
        */
      def getConfig(): js.Promise[String] = js.native
      
      /**
        * Retrieves metadata about this iOS app.
        *
        * @return {!Promise<admin.projectManagement.IosAppMetadata>} A promise that
        *     resolves to the retrieved metadata about this iOS app.
        */
      def getMetadata(): js.Promise[IosAppMetadata] = js.native
      
      /**
        * Sets the optional user-assigned display name of the app.
        *
        * @param newDisplayName The new display name to set.
        *
        * @return A promise that resolves when the display name has
        *     been set.
        */
      def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
    }
    object IosApp {
      
      @scala.inline
      def apply(
        appId: String,
        getConfig: () => js.Promise[String],
        getMetadata: () => js.Promise[IosAppMetadata],
        setDisplayName: String => js.Promise[Unit]
      ): IosApp = {
        val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getMetadata = js.Any.fromFunction0(getMetadata), setDisplayName = js.Any.fromFunction1(setDisplayName))
        __obj.asInstanceOf[IosApp]
      }
      
      @scala.inline
      implicit class IosAppMutableBuilder[Self <: IosApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetConfig(value: () => js.Promise[String]): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMetadata(value: () => js.Promise[IosAppMetadata]): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetDisplayName(value: String => js.Promise[Unit]): Self = StObject.set(x, "setDisplayName", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Metadata about a Firebase iOS App.
      */
    @js.native
    trait IosAppMetadata extends AppMetadata {
      
      /**
        * The canonical bundle ID of the iOS App as it would appear in the iOS App Store.
        *
        * @example
        * ```javascript
        * var bundleId = iosAppMetadata.bundleId;
        *```
        */
      var bundleId: String = js.native
      
      @JSName("platform")
      var platform_IosAppMetadata: IOS = js.native
    }
    object IosAppMetadata {
      
      @scala.inline
      def apply(appId: String, bundleId: String, platform: IOS, projectId: String, resourceName: String): IosAppMetadata = {
        val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
        __obj.asInstanceOf[IosAppMetadata]
      }
      
      @scala.inline
      implicit class IosAppMetadataMutableBuilder[Self <: IosAppMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlatform(value: IOS): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The Firebase ProjectManagement service interface.
      *
      * Do not call this constructor directly. Instead, use
      * [`admin.projectManagement()`](projectManagement#projectManagement).
      */
    @js.native
    trait ProjectManagement extends StObject {
      
      /**
        * Creates an `AndroidApp` object, referencing the specified Android app within
        * this Firebase project.
        *
        * This method does not perform an RPC.
        *
        * @param appId The `appId` of the Android app to reference.
        *
        * @return An `AndroidApp` object that references the specified Firebase Android app.
        */
      def androidApp(appId: String): AndroidApp = js.native
      
      var app: App = js.native
      
      /**
        * Creates a new Firebase Android app associated with this Firebase project.
        *
        * @param packageName The canonical package name of the Android App,
        *     as would appear in the Google Play Developer Console.
        * @param displayName An optional user-assigned display name for this
        *     new app.
        *
        * @return A promise that resolves to the newly created Android app.
        */
      def createAndroidApp(packageName: String): js.Promise[AndroidApp] = js.native
      def createAndroidApp(packageName: String, displayName: String): js.Promise[AndroidApp] = js.native
      
      /**
        * Creates a new Firebase iOS app associated with this Firebase project.
        *
        * @param bundleId The iOS app bundle ID to use for this new app.
        * @param displayName An optional user-assigned display name for this
        *     new app.
        *
        * @return A promise that resolves to the newly created iOS app.
        */
      def createIosApp(bundleId: String): js.Promise[IosApp] = js.native
      def createIosApp(bundleId: String, displayName: String): js.Promise[IosApp] = js.native
      
      /**
        * Creates an `iOSApp` object, referencing the specified iOS app within
        * this Firebase project.
        *
        * This method does not perform an RPC.
        *
        * @param appId The `appId` of the iOS app to reference.
        *
        * @return An `iOSApp` object that references the specified Firebase iOS app.
        */
      def iosApp(appId: String): IosApp = js.native
      
      /**
        * Lists up to 100 Firebase Android apps associated with this Firebase project.
        *
        * @return The list of Android apps.
        */
      def listAndroidApps(): js.Promise[js.Array[AndroidApp]] = js.native
      
      /**
        * Lists up to 100 Firebase apps associated with this Firebase project.
        *
        * @return A promise that resolves to the metadata list of the apps.
        */
      def listAppMetadata(): js.Promise[js.Array[AppMetadata]] = js.native
      
      /**
        * Lists up to 100 Firebase iOS apps associated with this Firebase project.
        *
        * @return The list of iOS apps.
        */
      def listIosApps(): js.Promise[js.Array[IosApp]] = js.native
      
      /**
        * Update the display name of this Firebase project.
        *
        * @param newDisplayName The new display name to be updated.
        *
        * @return A promise that resolves when the project display name has been updated.
        */
      def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
      
      /**
        * Creates a `ShaCertificate` object.
        *
        * This method does not perform an RPC.
        *
        * @param shaHash The SHA-1 or SHA-256 hash for this certificate.
        *
        * @return A `ShaCertificate` object contains the specified SHA hash.
        */
      def shaCertificate(shaHash: String): ShaCertificate = js.native
    }
    
    /**
      * A SHA-1 or SHA-256 certificate.
      *
      * Do not call this constructor directly. Instead, use
      * [`projectManagement.shaCertificate()`](projectManagement.ProjectManagement#shaCertificate).
      */
    @js.native
    trait ShaCertificate extends StObject {
      
      /**
        * The SHA certificate type.
        *
        * @example
        * ```javascript
        * var certType = shaCertificate.certType;
        * ```
        */
      var certType: sha1_ | sha256_ = js.native
      
      /**
        * The fully-qualified resource name that identifies this sha-key.
        *
        * This is useful when manually constructing requests for Firebase's public API.
        *
        * @example
        * ```javascript
        * var resourceName = shaCertificate.resourceName;
        * ```
        */
      var resourceName: js.UndefOr[String] = js.native
      
      /**
        * The SHA-1 or SHA-256 hash for this certificate.
        *
        * @example
        * ```javascript
        * var shaHash = shaCertificate.shaHash;
        * ```
        */
      var shaHash: String = js.native
    }
    object ShaCertificate {
      
      @scala.inline
      def apply(certType: sha1_ | sha256_, shaHash: String): ShaCertificate = {
        val __obj = js.Dynamic.literal(certType = certType.asInstanceOf[js.Any], shaHash = shaHash.asInstanceOf[js.Any])
        __obj.asInstanceOf[ShaCertificate]
      }
      
      @scala.inline
      implicit class ShaCertificateMutableBuilder[Self <: ShaCertificate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCertType(value: sha1_ | sha256_): Self = StObject.set(x, "certType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
        
        @scala.inline
        def setShaHash(value: String): Self = StObject.set(x, "shaHash", value.asInstanceOf[js.Any])
      }
    }
  }
}
