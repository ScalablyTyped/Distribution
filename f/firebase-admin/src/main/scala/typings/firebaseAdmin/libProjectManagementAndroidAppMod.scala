package typings.firebaseAdmin

import typings.firebaseAdmin.firebaseAdminStrings.sha1_
import typings.firebaseAdmin.firebaseAdminStrings.sha256_
import typings.firebaseAdmin.libProjectManagementAppMetadataMod.AppMetadata
import typings.firebaseAdmin.libProjectManagementAppMetadataMod.AppPlatform.ANDROID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectManagementAndroidAppMod {
  
  @JSImport("firebase-admin/lib/project-management/android-app", "AndroidApp")
  @js.native
  open class AndroidApp () extends StObject {
    
    /**
      * Adds the given SHA certificate to this Android app.
      *
      * @param certificateToAdd - The SHA certificate to add.
      *
      * @returns A promise that resolves when the given certificate
      *     has been added to the Android app.
      */
    def addShaCertificate(certificateToAdd: ShaCertificate): js.Promise[Unit] = js.native
    
    val appId: String = js.native
    
    /**
      * Deletes the specified SHA certificate from this Android app.
      *
      * @param certificateToDelete - The SHA certificate to delete.
      *
      * @returns A promise that resolves when the specified
      *     certificate has been removed from the Android app.
      */
    def deleteShaCertificate(certificateToDelete: ShaCertificate): js.Promise[Unit] = js.native
    
    /**
      * Gets the configuration artifact associated with this app.
      *
      * @returns A promise that resolves to the Android app's
      *     Firebase config file, in UTF-8 string format. This string is typically
      *     intended to be written to a JSON file that gets shipped with your Android
      *     app.
      */
    def getConfig(): js.Promise[String] = js.native
    
    /**
      * Retrieves metadata about this Android app.
      *
      * @returns A promise that resolves to the retrieved metadata about this Android app.
      */
    def getMetadata(): js.Promise[AndroidAppMetadata] = js.native
    
    /**
      * Gets the list of SHA certificates associated with this Android app in Firebase.
      *
      * @returns The list of SHA-1 and SHA-256 certificates associated with this Android app in
      *     Firebase.
      */
    def getShaCertificates(): js.Promise[js.Array[ShaCertificate]] = js.native
    
    /* private */ val requestHandler: Any = js.native
    
    /* private */ val resourceName: Any = js.native
    
    /**
      * Sets the optional user-assigned display name of the app.
      *
      * @param newDisplayName - The new display name to set.
      *
      * @returns A promise that resolves when the display name has been set.
      */
    def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("firebase-admin/lib/project-management/android-app", "ShaCertificate")
  @js.native
  open class ShaCertificate () extends StObject {
    
    /**
      * The SHA certificate type.
      *
      * @example
      * ```javascript
      * var certType = shaCertificate.certType;
      * ```
      */
    val certType: sha1_ | sha256_ = js.native
    
    val resourceName: js.UndefOr[String] = js.native
    
    val shaHash: String = js.native
  }
  
  trait AndroidAppMetadata
    extends StObject
       with AppMetadata {
    
    /**
      * The canonical package name of the Android App, as would appear in the Google Play Developer
      * Console.
      *
      * @example
      * ```javascript
      * var packageName = androidAppMetadata.packageName;
      * ```
      */
    var packageName: String
    
    @JSName("platform")
    var platform_AndroidAppMetadata: ANDROID
  }
  object AndroidAppMetadata {
    
    inline def apply(appId: String, packageName: String, platform: ANDROID, projectId: String, resourceName: String): AndroidAppMetadata = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidAppMetadata]
    }
    
    extension [Self <: AndroidAppMetadata](x: Self) {
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: ANDROID): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
