package typings.expoMetroConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWatchFoldersMod {
  
  @JSImport("@expo/metro-config/build/getWatchFolders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWatchFolders(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWatchFolders")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def globAllPackageJsonPaths(workspaceProjectRoot: String, linkedPackages: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("globAllPackageJsonPaths")(workspaceProjectRoot.asInstanceOf[js.Any], linkedPackages.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def resolveAllWorkspacePackageJsonPaths(workspaceProjectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAllWorkspacePackageJsonPaths")(workspaceProjectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
