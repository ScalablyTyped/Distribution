package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionResponse
import typings.expoPermissions.permissionsTypesMod.PermissionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionsMod {
  
  @JSImport("expo-permissions/build/Permissions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-permissions/build/Permissions", "AUDIO_RECORDING")
  @js.native
  val AUDIO_RECORDING: /* "audioRecording" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "CALENDAR")
  @js.native
  val CALENDAR: /* "calendar" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "CAMERA")
  @js.native
  val CAMERA: /* "camera" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "CAMERA_ROLL")
  @js.native
  val CAMERA_ROLL: /* "mediaLibrary" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "CONTACTS")
  @js.native
  val CONTACTS: /* "contacts" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "LOCATION")
  @js.native
  val LOCATION: /* "location" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "LOCATION_BACKGROUND")
  @js.native
  val LOCATION_BACKGROUND: /* "locationBackground" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "LOCATION_FOREGROUND")
  @js.native
  val LOCATION_FOREGROUND: /* "locationForeground" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "MEDIA_LIBRARY")
  @js.native
  val MEDIA_LIBRARY: /* "mediaLibrary" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "MEDIA_LIBRARY_WRITE_ONLY")
  @js.native
  val MEDIA_LIBRARY_WRITE_ONLY: /* "mediaLibraryWriteOnly" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "MOTION")
  @js.native
  val MOTION: /* "motion" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "NOTIFICATIONS")
  @js.native
  val NOTIFICATIONS: /* "notifications" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoModulesCore.permissionsInterfaceMod.PermissionStatus & String] = js.native
    
    /* "denied" */ val DENIED: typings.expoModulesCore.permissionsInterfaceMod.PermissionStatus.DENIED & String = js.native
    
    /* "granted" */ val GRANTED: typings.expoModulesCore.permissionsInterfaceMod.PermissionStatus.GRANTED & String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typings.expoModulesCore.permissionsInterfaceMod.PermissionStatus.UNDETERMINED & String = js.native
  }
  
  @JSImport("expo-permissions/build/Permissions", "REMINDERS")
  @js.native
  val REMINDERS: /* "reminders" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "SYSTEM_BRIGHTNESS")
  @js.native
  val SYSTEM_BRIGHTNESS: /* "systemBrightness" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "USER_FACING_NOTIFICATIONS")
  @js.native
  val USER_FACING_NOTIFICATIONS: /* "userFacingNotifications" */ String = js.native
  
  inline def askAsync(types: PermissionType*): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("askAsync")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[PermissionResponse]]
  
  inline def getAsync(types: PermissionType*): js.Promise[PermissionResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[PermissionResponse]]
}
