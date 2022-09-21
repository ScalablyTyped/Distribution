package typings.expoConfig

import typings.expoConfig.anon.Platform
import typings.expoConfig.configTypesMod.ProjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathsPathsMod {
  
  @JSImport("@expo/config/build/paths/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureSlash(inputPath: String, needsSlash: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSlash")(inputPath.asInstanceOf[js.Any], needsSlash.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getEntryPoint(projectRoot: String, entryFiles: js.Array[String], platforms: js.Array[String]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPoint")(projectRoot.asInstanceOf[js.Any], entryFiles.asInstanceOf[js.Any], platforms.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getEntryPoint(
    projectRoot: String,
    entryFiles: js.Array[String],
    platforms: js.Array[String],
    projectConfig: ProjectConfig
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPoint")(projectRoot.asInstanceOf[js.Any], entryFiles.asInstanceOf[js.Any], platforms.asInstanceOf[js.Any], projectConfig.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getEntryPointWithExtensions(projectRoot: String, entryFiles: js.Array[String], extensions: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPointWithExtensions")(projectRoot.asInstanceOf[js.Any], entryFiles.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getEntryPointWithExtensions(
    projectRoot: String,
    entryFiles: js.Array[String],
    extensions: js.Array[String],
    projectConfig: ProjectConfig
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPointWithExtensions")(projectRoot.asInstanceOf[js.Any], entryFiles.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], projectConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFileWithExtensions(fromDirectory: String, moduleId: String, extensions: js.Array[String]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileWithExtensions")(fromDirectory.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getPossibleProjectRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleProjectRoot")().asInstanceOf[String]
  
  inline def resolveEntryPoint(projectRoot: String, hasPlatformProjectConfig: Platform): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEntryPoint")(projectRoot.asInstanceOf[js.Any], hasPlatformProjectConfig.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def resolveFromSilentWithExtensions(fromDirectory: String, moduleId: String, extensions: js.Array[String]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFromSilentWithExtensions")(fromDirectory.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
