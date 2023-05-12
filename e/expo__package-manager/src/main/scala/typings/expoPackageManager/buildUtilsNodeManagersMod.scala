package typings.expoPackageManager

import typings.expoPackageManager.buildPackageManagerMod.PackageManagerOptions
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsNodeManagersMod {
  
  @JSImport("@expo/package-manager/build/utils/nodeManagers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/package-manager/build/utils/nodeManagers", "RESOLUTION_ORDER")
  @js.native
  val RESOLUTION_ORDER: js.Array[/* "npm" */ String] = js.native
  
  inline def createForProject(projectRoot: String): NodePackageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createForProject")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[NodePackageManager]
  inline def createForProject(projectRoot: String, options: NodePackageManagerForProject): NodePackageManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProject")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NodePackageManager]
  
  inline def findWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def findWorkspaceRoot(projectRoot: String, preferredManager: /* "npm" */ String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(projectRoot.asInstanceOf[js.Any], preferredManager.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def resolvePackageManager(projectRoot: String): (/* "npm" */ String) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageManager")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[(/* "npm" */ String) | Null]
  inline def resolvePackageManager(projectRoot: String, preferredManager: /* "npm" */ String): (/* "npm" */ String) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageManager")(projectRoot.asInstanceOf[js.Any], preferredManager.asInstanceOf[js.Any])).asInstanceOf[(/* "npm" */ String) | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoPackageManager.buildNodeNpmPackageManagerMod.NpmPackageManager
    - typings.expoPackageManager.buildNodePnpmPackageManagerMod.PnpmPackageManager
    - typings.expoPackageManager.buildNodeYarnPackageManagerMod.YarnPackageManager
  */
  trait NodePackageManager extends StObject
  
  type NodePackageManagerForProject = PackageManagerOptions & (Partial[Record[/* "npm" */ String, Boolean]])
}
