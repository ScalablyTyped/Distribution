package typings.expoConfigPlugins

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigPlugins.anon.PickExpoConfigandroid
import typings.expoConfigPlugins.buildAndroidManifestMod.AndroidManifest
import typings.expoConfigPlugins.buildAndroidManifestMod.ManifestUsesPermission
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidPermissionsMod {
  
  @JSImport("@expo/config-plugins/build/android/Permissions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBlockedPermissions(androidManifest: AndroidManifest, permissions: js.Array[String]): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("addBlockedPermissions")(androidManifest.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  inline def addPermission(androidManifest: AndroidManifest, permissionName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPermission")(androidManifest.asInstanceOf[js.Any], permissionName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addPermissionToManifest(permission: String, manifestPermissions: js.Array[ManifestUsesPermission]): js.Array[ManifestUsesPermission] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPermissionToManifest")(permission.asInstanceOf[js.Any], manifestPermissions.asInstanceOf[js.Any])).asInstanceOf[js.Array[ManifestUsesPermission]]
  
  inline def ensurePermission(androidManifest: AndroidManifest, permissionName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePermission")(androidManifest.asInstanceOf[js.Any], permissionName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ensurePermissionNameFormat(permissionName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensurePermissionNameFormat")(permissionName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensurePermissions(androidManifest: AndroidManifest, permissionNames: js.Array[String]): StringDictionary[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePermissions")(androidManifest.asInstanceOf[js.Any], permissionNames.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Boolean]]
  
  inline def getAndroidPermissions(config: PickExpoConfigandroid): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidPermissions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getPermissions(androidManifest: AndroidManifest): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissions")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isPermissionAlreadyRequested(permission: String, manifestPermissions: js.Array[ManifestUsesPermission]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPermissionAlreadyRequested")(permission.asInstanceOf[js.Any], manifestPermissions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removePermissions(androidManifest: AndroidManifest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePermissions")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removePermissions(androidManifest: AndroidManifest, permissionNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePermissions")(androidManifest.asInstanceOf[js.Any], permissionNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setAndroidPermissions(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setAndroidPermissions")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  @JSImport("@expo/config-plugins/build/android/Permissions", "withBlockedPermissions")
  @js.native
  val withBlockedPermissions: ConfigPlugin[js.Array[String] | String] = js.native
  
  @JSImport("@expo/config-plugins/build/android/Permissions", "withInternalBlockedPermissions")
  @js.native
  val withInternalBlockedPermissions: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/android/Permissions", "withPermissions")
  @js.native
  val withPermissions: ConfigPlugin[js.Array[String] | Unit] = js.native
}
