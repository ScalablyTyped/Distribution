package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoPermissionsStrings {
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait always extends StObject
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait audioRecording
    extends StObject
       with PermissionType
  inline def audioRecording: audioRecording = "audioRecording".asInstanceOf[audioRecording]
  
  @js.native
  sealed trait calendar
    extends StObject
       with PermissionType
  inline def calendar: calendar = "calendar".asInstanceOf[calendar]
  
  @js.native
  sealed trait camera
    extends StObject
       with PermissionType
  inline def camera: camera = "camera".asInstanceOf[camera]
  
  @js.native
  sealed trait cameraRoll
    extends StObject
       with PermissionType
  inline def cameraRoll: cameraRoll = "cameraRoll".asInstanceOf[cameraRoll]
  
  @js.native
  sealed trait coarse extends StObject
  inline def coarse: coarse = "coarse".asInstanceOf[coarse]
  
  @js.native
  sealed trait contacts
    extends StObject
       with PermissionType
  inline def contacts: contacts = "contacts".asInstanceOf[contacts]
  
  @js.native
  sealed trait fine extends StObject
  inline def fine: fine = "fine".asInstanceOf[fine]
  
  @js.native
  sealed trait limited extends StObject
  inline def limited: limited = "limited".asInstanceOf[limited]
  
  @js.native
  sealed trait location
    extends StObject
       with PermissionType
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait locationBackground
    extends StObject
       with PermissionType
  inline def locationBackground: locationBackground = "locationBackground".asInstanceOf[locationBackground]
  
  @js.native
  sealed trait locationForeground
    extends StObject
       with PermissionType
  inline def locationForeground: locationForeground = "locationForeground".asInstanceOf[locationForeground]
  
  @js.native
  sealed trait mediaLibrary
    extends StObject
       with PermissionType
  inline def mediaLibrary: mediaLibrary = "mediaLibrary".asInstanceOf[mediaLibrary]
  
  @js.native
  sealed trait mediaLibraryWriteOnly
    extends StObject
       with PermissionType
  inline def mediaLibraryWriteOnly: mediaLibraryWriteOnly = "mediaLibraryWriteOnly".asInstanceOf[mediaLibraryWriteOnly]
  
  @js.native
  sealed trait motion
    extends StObject
       with PermissionType
  inline def motion: motion = "motion".asInstanceOf[motion]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait notifications
    extends StObject
       with PermissionType
  inline def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait reminders
    extends StObject
       with PermissionType
  inline def reminders: reminders = "reminders".asInstanceOf[reminders]
  
  @js.native
  sealed trait systemBrightness
    extends StObject
       with PermissionType
  inline def systemBrightness: systemBrightness = "systemBrightness".asInstanceOf[systemBrightness]
  
  @js.native
  sealed trait userFacingNotifications
    extends StObject
       with PermissionType
  inline def userFacingNotifications: userFacingNotifications = "userFacingNotifications".asInstanceOf[userFacingNotifications]
  
  @js.native
  sealed trait whenInUse extends StObject
  inline def whenInUse: whenInUse = "whenInUse".asInstanceOf[whenInUse]
}
