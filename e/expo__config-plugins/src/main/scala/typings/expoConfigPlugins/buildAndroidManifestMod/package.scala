package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.anon.Required
import typings.expoConfigPlugins.buildAndroidManifestMod.^
import typings.expoConfigPlugins.expoConfigPluginsStrings.resource
import typings.expoConfigPlugins.expoConfigPluginsStrings.value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addMetaDataItemToMainApplication(mainApplication: ManifestApplication, itemName: String, itemValue: String): ManifestApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("addMetaDataItemToMainApplication")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any], itemValue.asInstanceOf[js.Any])).asInstanceOf[ManifestApplication]
inline def addMetaDataItemToMainApplication(
  mainApplication: ManifestApplication,
  itemName: String,
  itemValue: String,
  itemType: resource | value
): ManifestApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("addMetaDataItemToMainApplication")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any], itemValue.asInstanceOf[js.Any], itemType.asInstanceOf[js.Any])).asInstanceOf[ManifestApplication]

inline def addUsesLibraryItemToMainApplication(mainApplication: ManifestApplication, item: Required): ManifestApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("addUsesLibraryItemToMainApplication")(mainApplication.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[ManifestApplication]

inline def ensureToolsAvailable(manifest: AndroidManifest): AndroidManifest = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureToolsAvailable")(manifest.asInstanceOf[js.Any]).asInstanceOf[AndroidManifest]

inline def findMetaDataItem(mainApplication: Any, itemName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMetaDataItem")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def findUsesLibraryItem(mainApplication: Any, itemName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findUsesLibraryItem")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getMainActivity(androidManifest: AndroidManifest): ManifestActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainActivity")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestActivity | Null]

inline def getMainActivityOrThrow(androidManifest: AndroidManifest): ManifestActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainActivityOrThrow")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestActivity]

inline def getMainApplication(androidManifest: AndroidManifest): ManifestApplication | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainApplication")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestApplication | Null]

inline def getMainApplicationMetaDataValue(androidManifest: AndroidManifest, name: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMainApplicationMetaDataValue")(androidManifest.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String | Null]

inline def getMainApplicationOrThrow(androidManifest: AndroidManifest): ManifestApplication = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainApplicationOrThrow")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestApplication]

inline def getRunnableActivity(androidManifest: AndroidManifest): ManifestActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunnableActivity")(androidManifest.asInstanceOf[js.Any]).asInstanceOf[ManifestActivity | Null]

inline def prefixAndroidKeys[T /* <: Record[String, Any] */](head: T): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixAndroidKeys")(head.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]

inline def readAndroidManifestAsync(manifestPath: String): js.Promise[AndroidManifest] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAndroidManifestAsync")(manifestPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AndroidManifest]]

inline def removeMetaDataItemFromMainApplication(mainApplication: Any, itemName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMetaDataItemFromMainApplication")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def removeUsesLibraryItemFromMainApplication(mainApplication: ManifestApplication, itemName: String): ManifestApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("removeUsesLibraryItemFromMainApplication")(mainApplication.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[ManifestApplication]

inline def writeAndroidManifestAsync(manifestPath: String, androidManifest: AndroidManifest): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAndroidManifestAsync")(manifestPath.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
