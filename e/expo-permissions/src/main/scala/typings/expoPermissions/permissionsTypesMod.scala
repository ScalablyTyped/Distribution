package typings.expoPermissions

import org.scalablytyped.runtime.StringDictionary
import typings.expoPermissions.expoPermissionsStrings.all
import typings.expoPermissions.expoPermissionsStrings.always
import typings.expoPermissions.expoPermissionsStrings.coarse
import typings.expoPermissions.expoPermissionsStrings.fine
import typings.expoPermissions.expoPermissionsStrings.limited
import typings.expoPermissions.expoPermissionsStrings.none
import typings.expoPermissions.expoPermissionsStrings.whenInUse
import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import typings.unimodulesPermissionsInterface.mod.PermissionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionsTypesMod {
  
  @JSImport("expo-permissions/build/Permissions.types", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.unimodulesPermissionsInterface.mod.PermissionStatus & String] = js.native
    
    /* "denied" */ val DENIED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED & String = js.native
    
    /* "granted" */ val GRANTED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED & String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED & String = js.native
  }
  
  trait PermissionDetailsLocationAndroid extends StObject {
    
    var accuracy: fine | coarse | none
  }
  object PermissionDetailsLocationAndroid {
    
    inline def apply(accuracy: fine | coarse | none): PermissionDetailsLocationAndroid = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionDetailsLocationAndroid]
    }
    
    extension [Self <: PermissionDetailsLocationAndroid](x: Self) {
      
      inline def setAccuracy(value: fine | coarse | none): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    }
  }
  
  trait PermissionInfo
    extends StObject
       with typings.unimodulesPermissionsInterface.mod.PermissionResponse {
    
    var accessPrivileges: js.UndefOr[all | limited | none] = js.undefined
    
    var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
    
    var scope: js.UndefOr[whenInUse | always | none] = js.undefined
  }
  object PermissionInfo {
    
    inline def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): PermissionInfo = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionInfo]
    }
    
    extension [Self <: PermissionInfo](x: Self) {
      
      inline def setAccessPrivileges(value: all | limited | none): Self = StObject.set(x, "accessPrivileges", value.asInstanceOf[js.Any])
      
      inline def setAccessPrivilegesUndefined: Self = StObject.set(x, "accessPrivileges", js.undefined)
      
      inline def setAndroid(value: PermissionDetailsLocationAndroid): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setScope(value: whenInUse | always | none): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  type PermissionMap = StringDictionary[PermissionInfo]
  
  trait PermissionResponse
    extends StObject
       with typings.unimodulesPermissionsInterface.mod.PermissionResponse {
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoPermissions.expoPermissionsStrings.camera
    - typings.expoPermissions.expoPermissionsStrings.cameraRoll
    - typings.expoPermissions.expoPermissionsStrings.audioRecording
    - typings.expoPermissions.expoPermissionsStrings.location
    - typings.expoPermissions.expoPermissionsStrings.userFacingNotifications
    - typings.expoPermissions.expoPermissionsStrings.notifications
    - typings.expoPermissions.expoPermissionsStrings.contacts
    - typings.expoPermissions.expoPermissionsStrings.calendar
    - typings.expoPermissions.expoPermissionsStrings.reminders
    - typings.expoPermissions.expoPermissionsStrings.motion
    - typings.expoPermissions.expoPermissionsStrings.systemBrightness
  */
  trait PermissionType extends StObject
  object PermissionType {
    
    inline def audioRecording: typings.expoPermissions.expoPermissionsStrings.audioRecording = "audioRecording".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.audioRecording]
    
    inline def calendar: typings.expoPermissions.expoPermissionsStrings.calendar = "calendar".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.calendar]
    
    inline def camera: typings.expoPermissions.expoPermissionsStrings.camera = "camera".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.camera]
    
    inline def cameraRoll: typings.expoPermissions.expoPermissionsStrings.cameraRoll = "cameraRoll".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.cameraRoll]
    
    inline def contacts: typings.expoPermissions.expoPermissionsStrings.contacts = "contacts".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.contacts]
    
    inline def location: typings.expoPermissions.expoPermissionsStrings.location = "location".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.location]
    
    inline def motion: typings.expoPermissions.expoPermissionsStrings.motion = "motion".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.motion]
    
    inline def notifications: typings.expoPermissions.expoPermissionsStrings.notifications = "notifications".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.notifications]
    
    inline def reminders: typings.expoPermissions.expoPermissionsStrings.reminders = "reminders".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.reminders]
    
    inline def systemBrightness: typings.expoPermissions.expoPermissionsStrings.systemBrightness = "systemBrightness".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.systemBrightness]
    
    inline def userFacingNotifications: typings.expoPermissions.expoPermissionsStrings.userFacingNotifications = "userFacingNotifications".asInstanceOf[typings.expoPermissions.expoPermissionsStrings.userFacingNotifications]
  }
}
