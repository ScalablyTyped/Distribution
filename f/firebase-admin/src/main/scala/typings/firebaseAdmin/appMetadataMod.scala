package typings.firebaseAdmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMetadataMod {
  
  @js.native
  sealed trait AppPlatform extends StObject
  @JSImport("firebase-admin/lib/project-management/app-metadata", "AppPlatform")
  @js.native
  object AppPlatform extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AppPlatform & String] = js.native
    
    /**
      * The Firebase App is associated with Android.
      */
    @js.native
    sealed trait ANDROID
      extends StObject
         with AppPlatform
    /* "ANDROID" */ val ANDROID: typings.firebaseAdmin.appMetadataMod.AppPlatform.ANDROID & String = js.native
    
    /**
      * The Firebase App is associated with iOS.
      */
    @js.native
    sealed trait IOS
      extends StObject
         with AppPlatform
    /* "IOS" */ val IOS: typings.firebaseAdmin.appMetadataMod.AppPlatform.IOS & String = js.native
    
    /**
      * Unknown state. This is only used for distinguishing unset values.
      */
    @js.native
    sealed trait PLATFORM_UNKNOWN
      extends StObject
         with AppPlatform
    /* "PLATFORM_UNKNOWN" */ val PLATFORM_UNKNOWN: typings.firebaseAdmin.appMetadataMod.AppPlatform.PLATFORM_UNKNOWN & String = js.native
  }
  
  trait AppMetadata extends StObject {
    
    /**
      * The globally unique, Firebase-assigned identifier of the app.
      *
      * @example
      * ```javascript
      * var appId = appMetadata.appId;
      * ```
      */
    var appId: String
    
    /**
      * The optional user-assigned display name of the app.
      *
      * @example
      * ```javascript
      * var displayName = appMetadata.displayName;
      * ```
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * The development platform of the app. Supporting Android and iOS app platforms.
      *
      * @example
      * ```javascript
      * var platform = AppPlatform.ANDROID;
      * ```
      */
    var platform: AppPlatform
    
    /**
      * The globally unique, user-assigned ID of the parent project for the app.
      *
      * @example
      * ```javascript
      * var projectId = appMetadata.projectId;
      * ```
      */
    var projectId: String
    
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
    var resourceName: String
  }
  object AppMetadata {
    
    inline def apply(appId: String, platform: AppPlatform, projectId: String, resourceName: String): AppMetadata = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppMetadata]
    }
    
    extension [Self <: AppMetadata](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPlatform(value: AppPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    }
  }
}
