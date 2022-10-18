package typings.expoPackageManager

import typings.expoPackageManager.buildNodePackageManagersMod.NodePackageManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsNodeWorkspacesMod {
  
  @JSImport("@expo/package-manager/build/utils/nodeWorkspaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/package-manager/build/utils/nodeWorkspaces", "NPM_LOCK_FILE")
  @js.native
  val NPM_LOCK_FILE: /* "package-lock.json" */ String = js.native
  
  @JSImport("@expo/package-manager/build/utils/nodeWorkspaces", "PNPM_LOCK_FILE")
  @js.native
  val PNPM_LOCK_FILE: /* "pnpm-lock.yaml" */ String = js.native
  
  @JSImport("@expo/package-manager/build/utils/nodeWorkspaces", "PNPM_WORKSPACE_FILE")
  @js.native
  val PNPM_WORKSPACE_FILE: /* "pnpm-workspace.yaml" */ String = js.native
  
  @JSImport("@expo/package-manager/build/utils/nodeWorkspaces", "YARN_LOCK_FILE")
  @js.native
  val YARN_LOCK_FILE: /* "yarn.lock" */ String = js.native
  
  inline def findWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def findWorkspaceRoot(projectRoot: String, packageManager: NodePackageManager): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(projectRoot.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def findYarnOrNpmWorkspaceRootSafe(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findYarnOrNpmWorkspaceRootSafe")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def isUsingNpm(projectRoot: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingNpm")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUsingYarn(projectRoot: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingYarn")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@expo/package-manager/build/utils/nodeWorkspaces", "managerResolutionOrder")
  @js.native
  val managerResolutionOrder: js.Array[NodePackageManager] = js.native
  
  inline def resolvePackageManager(projectRoot: String): NodePackageManager | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageManager")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[NodePackageManager | Null]
  inline def resolvePackageManager(projectRoot: String, packageManager: NodePackageManager): NodePackageManager | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageManager")(projectRoot.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[NodePackageManager | Null]
}
