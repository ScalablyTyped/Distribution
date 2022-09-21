package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.PackageName
import typings.expoConfigPlugins.anon.PickExpoConfigandroid
import typings.expoConfigPlugins.manifestMod.AndroidManifest
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageMod {
  
  @JSImport("@expo/config-plugins/build/android/Package", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getApplicationIdAsync(projectRoot: String): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationIdAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def getPackage(config: PickExpoConfigandroid): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackage")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def renameJniOnDiskForType(hasProjectRootTypePackageName: PackageName): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renameJniOnDiskForType")(hasProjectRootTypePackageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def renamePackageOnDisk(config: PickExpoConfigandroid, projectRoot: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renamePackageOnDisk")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def renamePackageOnDiskForType(hasProjectRootTypePackageName: PackageName): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renamePackageOnDiskForType")(hasProjectRootTypePackageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setPackageInAndroidManifest(config: PickExpoConfigandroid, androidManifest: AndroidManifest): AndroidManifest = (^.asInstanceOf[js.Dynamic].applyDynamic("setPackageInAndroidManifest")(config.asInstanceOf[js.Any], androidManifest.asInstanceOf[js.Any])).asInstanceOf[AndroidManifest]
  
  inline def setPackageInBuildGradle(config: PickExpoConfigandroid, buildGradle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setPackageInBuildGradle")(config.asInstanceOf[js.Any], buildGradle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@expo/config-plugins/build/android/Package", "withPackageGradle")
  @js.native
  val withPackageGradle: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/android/Package", "withPackageManifest")
  @js.native
  val withPackageManifest: ConfigPlugin[Unit] = js.native
  
  @JSImport("@expo/config-plugins/build/android/Package", "withPackageRefactor")
  @js.native
  val withPackageRefactor: ConfigPlugin[Unit] = js.native
}
