package typings.expoPrebuildConfig

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsUnversionedExpoNotificationsWithAndroidNotificationsMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "META_DATA_NOTIFICATION_ICON")
  @js.native
  val META_DATA_NOTIFICATION_ICON: /* "expo.modules.notifications.default_notification_icon" */ String = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "META_DATA_NOTIFICATION_ICON_COLOR")
  @js.native
  val META_DATA_NOTIFICATION_ICON_COLOR: /* "expo.modules.notifications.default_notification_color" */ String = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "NOTIFICATION_ICON")
  @js.native
  val NOTIFICATION_ICON: /* "notification_icon" */ String = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "NOTIFICATION_ICON_COLOR")
  @js.native
  val NOTIFICATION_ICON_COLOR: /* "notification_icon_color" */ String = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "NOTIFICATION_ICON_COLOR_RESOURCE")
  @js.native
  val NOTIFICATION_ICON_COLOR_RESOURCE: String = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "NOTIFICATION_ICON_RESOURCE")
  @js.native
  val NOTIFICATION_ICON_RESOURCE: String = js.native
  
  inline def getNotificationColor(config: ExpoConfig): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNotificationColor")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getNotificationIcon(config: ExpoConfig): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNotificationIcon")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setNotificationConfig(config: ExpoConfig, manifest: AndroidManifest): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setNotificationConfig")(config.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setNotificationIconAsync(config: ExpoConfig, projectRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setNotificationIconAsync")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setNotificationIconColor(
    config: ExpoConfig,
    colors: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Resources.ResourceXML */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setNotificationIconColor")(config.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "withNotificationIconColor")
  @js.native
  val withNotificationIconColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "withNotificationIcons")
  @js.native
  val withNotificationIcons: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
  
  @JSImport("@expo/prebuild-config/build/plugins/unversioned/expo-notifications/withAndroidNotifications", "withNotificationManifest")
  @js.native
  val withNotificationManifest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any = js.native
  
  type AndroidManifest = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AndroidConfig.Manifest.AndroidManifest */ Any
}
