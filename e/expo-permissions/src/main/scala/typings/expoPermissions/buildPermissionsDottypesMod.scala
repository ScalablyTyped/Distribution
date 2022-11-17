package typings.expoPermissions

import org.scalablytyped.runtime.StringDictionary
import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionExpiration
import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPermissionsDottypesMod {
  
  @JSImport("expo-permissions/build/Permissions.types", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus & String] = js.native
    
    /* "denied" */ val DENIED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.DENIED & String = js.native
    
    /* "granted" */ val GRANTED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.GRANTED & String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus.UNDETERMINED & String = js.native
  }
  
  trait PermissionDetailsLocationAndroid extends StObject {
    
    var accuracy: "fine" | "coarse" | "none"
  }
  object PermissionDetailsLocationAndroid {
    
    inline def apply(accuracy: "fine" | "coarse" | "none"): PermissionDetailsLocationAndroid = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionDetailsLocationAndroid]
    }
    
    extension [Self <: PermissionDetailsLocationAndroid](x: Self) {
      
      inline def setAccuracy(value: "fine" | "coarse" | "none"): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    }
  }
  
  trait PermissionInfo
    extends StObject
       with typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionResponse {
    
    /**
      * iOS only - Permission.MEDIA_LIBRARY/MEDIA_LIBRARY_WRITE_ONLY
      */
    var accessPrivileges: js.UndefOr["all" | "limited" | "none"] = js.undefined
    
    var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
    
    var scope: js.UndefOr["whenInUse" | "always" | "none"] = js.undefined
  }
  object PermissionInfo {
    
    inline def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): PermissionInfo = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionInfo]
    }
    
    extension [Self <: PermissionInfo](x: Self) {
      
      inline def setAccessPrivileges(value: "all" | "limited" | "none"): Self = StObject.set(x, "accessPrivileges", value.asInstanceOf[js.Any])
      
      inline def setAccessPrivilegesUndefined: Self = StObject.set(x, "accessPrivileges", js.undefined)
      
      inline def setAndroid(value: PermissionDetailsLocationAndroid): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setScope(value: "whenInUse" | "always" | "none"): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  type PermissionMap = StringDictionary[PermissionInfo]
  
  trait PermissionResponse
    extends StObject
       with typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionResponse {
    
    var permissions: PermissionMap
  }
  object PermissionResponse {
    
    inline def apply(
      canAskAgain: Boolean,
      expires: PermissionExpiration,
      granted: Boolean,
      permissions: PermissionMap,
      status: PermissionStatus
    ): PermissionResponse = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionResponse]
    }
    
    extension [Self <: PermissionResponse](x: Self) {
      
      inline def setPermissions(value: PermissionMap): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  object PermissionType {
    
    inline def audioRecording: "audioRecording" = "audioRecording".asInstanceOf["audioRecording"]
    
    inline def calendar: "calendar" = "calendar".asInstanceOf["calendar"]
    
    inline def camera: "camera" = "camera".asInstanceOf["camera"]
    
    inline def cameraRoll: "cameraRoll" = "cameraRoll".asInstanceOf["cameraRoll"]
    
    inline def contacts: "contacts" = "contacts".asInstanceOf["contacts"]
    
    inline def location: "location" = "location".asInstanceOf["location"]
    
    inline def locationBackground: "locationBackground" = "locationBackground".asInstanceOf["locationBackground"]
    
    inline def locationForeground: "locationForeground" = "locationForeground".asInstanceOf["locationForeground"]
    
    inline def mediaLibrary: "mediaLibrary" = "mediaLibrary".asInstanceOf["mediaLibrary"]
    
    inline def mediaLibraryWriteOnly: "mediaLibraryWriteOnly" = "mediaLibraryWriteOnly".asInstanceOf["mediaLibraryWriteOnly"]
    
    inline def motion: "motion" = "motion".asInstanceOf["motion"]
    
    inline def notifications: "notifications" = "notifications".asInstanceOf["notifications"]
    
    inline def reminders: "reminders" = "reminders".asInstanceOf["reminders"]
    
    inline def systemBrightness: "systemBrightness" = "systemBrightness".asInstanceOf["systemBrightness"]
    
    inline def userFacingNotifications: "userFacingNotifications" = "userFacingNotifications".asInstanceOf["userFacingNotifications"]
  }
  type PermissionType = "camera" | "cameraRoll" | "mediaLibrary" | "mediaLibraryWriteOnly" | "audioRecording" | "location" | "locationForeground" | "locationBackground" | "userFacingNotifications" | "notifications" | "contacts" | "calendar" | "reminders" | "motion" | "systemBrightness"
}
