package typings.expoPackageManager

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
  
  inline def findPnpmWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findPnpmWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def findYarnOrNpmWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findYarnOrNpmWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
