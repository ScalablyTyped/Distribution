package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.BuildConfiguration
import typings.expoConfigPlugins.anon.BundleIdentifier
import typings.expoConfigPlugins.anon.PickExpoConfigios
import typings.expoConfigPlugins.iosConfigTypesMod.InfoPlist
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundleIdentifierMod {
  
  @JSImport("@expo/config-plugins/build/ios/BundleIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBundleIdentifier(config: PickExpoConfigios): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundleIdentifier")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /**
    * Gets the bundle identifier defined in the Xcode project found in the project directory.
    *
    * A bundle identifier is stored as a value in XCBuildConfiguration entry.
    * Those entries exist for every pair (build target, build configuration).
    * Unless target name is passed, the first target defined in the pbxproj is used
    * (to keep compatibility with the inaccurate legacy implementation of this function).
    * The build configuration is usually 'Release' or 'Debug'. However, it could be any arbitrary string.
    * Defaults to 'Release'.
    *
    * @param {string} projectRoot Path to project root containing the ios directory
    * @param {string} targetName Target name
    * @param {string} buildConfiguration Build configuration. Defaults to 'Release'.
    * @returns {string | null} bundle identifier of the Xcode project or null if the project is not configured
    */
  inline def getBundleIdentifierFromPbxproj(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundleIdentifierFromPbxproj")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getBundleIdentifierFromPbxproj(projectRoot: String, hasTargetNameBuildConfiguration: BuildConfiguration): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getBundleIdentifierFromPbxproj")(projectRoot.asInstanceOf[js.Any], hasTargetNameBuildConfiguration.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def resetAllPlistBundleIdentifiers(projectRoot: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetAllPlistBundleIdentifiers")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetPlistBundleIdentifier(plistPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetPlistBundleIdentifier")(plistPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * In Turtle v1 we set the bundleIdentifier directly on Info.plist rather
    * than in pbxproj
    */
  inline def setBundleIdentifier(config: ExpoConfig, infoPlist: InfoPlist): InfoPlist = (^.asInstanceOf[js.Dynamic].applyDynamic("setBundleIdentifier")(config.asInstanceOf[js.Any], infoPlist.asInstanceOf[js.Any])).asInstanceOf[InfoPlist]
  
  /**
    * Updates the bundle identifier for pbx projects inside the ios directory of the given project root
    *
    * @param {string} projectRoot Path to project root containing the ios directory
    * @param {string} bundleIdentifier Desired bundle identifier
    * @param {boolean} [updateProductName=true]  Whether to update PRODUCT_NAME
    */
  inline def setBundleIdentifierForPbxproj(projectRoot: String, bundleIdentifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBundleIdentifierForPbxproj")(projectRoot.asInstanceOf[js.Any], bundleIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setBundleIdentifierForPbxproj(projectRoot: String, bundleIdentifier: String, updateProductName: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBundleIdentifierForPbxproj")(projectRoot.asInstanceOf[js.Any], bundleIdentifier.asInstanceOf[js.Any], updateProductName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates the bundle identifier for a given pbxproj
    *
    * @param {string} pbxprojPath Path to pbxproj file
    * @param {string} bundleIdentifier Bundle identifier to set in the pbxproj
    * @param {boolean} [updateProductName=true]  Whether to update PRODUCT_NAME
    */
  inline def updateBundleIdentifierForPbxproj(pbxprojPath: String, bundleIdentifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateBundleIdentifierForPbxproj")(pbxprojPath.asInstanceOf[js.Any], bundleIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateBundleIdentifierForPbxproj(pbxprojPath: String, bundleIdentifier: String, updateProductName: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateBundleIdentifierForPbxproj")(pbxprojPath.asInstanceOf[js.Any], bundleIdentifier.asInstanceOf[js.Any], updateProductName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@expo/config-plugins/build/ios/BundleIdentifier", "withBundleIdentifier")
  @js.native
  val withBundleIdentifier: ConfigPlugin[BundleIdentifier] = js.native
}
