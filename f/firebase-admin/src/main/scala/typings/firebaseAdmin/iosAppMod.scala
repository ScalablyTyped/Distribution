package typings.firebaseAdmin

import typings.firebaseAdmin.appMetadataMod.AppMetadata
import typings.firebaseAdmin.appMetadataMod.AppPlatform.IOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosAppMod {
  
  @JSImport("firebase-admin/lib/project-management/ios-app", "IosApp")
  @js.native
  open class IosApp () extends StObject {
    
    val appId: String = js.native
    
    /**
      * Gets the configuration artifact associated with this app.
      *
      * @returns A promise that resolves to the iOS app's Firebase
      *     config file, in UTF-8 string format. This string is typically intended to
      *     be written to a plist file that gets shipped with your iOS app.
      */
    def getConfig(): js.Promise[String] = js.native
    
    /**
      * Retrieves metadata about this iOS app.
      *
      * @returns A promise that
      *     resolves to the retrieved metadata about this iOS app.
      */
    def getMetadata(): js.Promise[IosAppMetadata] = js.native
    
    /* private */ val requestHandler: Any = js.native
    
    /* private */ val resourceName: Any = js.native
    
    /**
      * Sets the optional user-assigned display name of the app.
      *
      * @param newDisplayName - The new display name to set.
      *
      * @returns A promise that resolves when the display name has
      *     been set.
      */
    def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
  }
  
  trait IosAppMetadata
    extends StObject
       with AppMetadata {
    
    /**
      * The canonical bundle ID of the iOS App as it would appear in the iOS App Store.
      *
      * @example
      * ```javascript
      * var bundleId = iosAppMetadata.bundleId;
      *```
      */
    var bundleId: String
    
    @JSName("platform")
    var platform_IosAppMetadata: IOS
  }
  object IosAppMetadata {
    
    inline def apply(appId: String, bundleId: String, platform: IOS, projectId: String, resourceName: String): IosAppMetadata = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IosAppMetadata]
    }
    
    extension [Self <: IosAppMetadata](x: Self) {
      
      inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: IOS): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
