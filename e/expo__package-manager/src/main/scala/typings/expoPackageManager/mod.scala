package typings.expoPackageManager

import typings.expoPackageManager.anon.Cwd
import typings.expoPackageManager.anon.Message
import typings.expoPackageManager.anon.NonInteractive
import typings.expoPackageManager.anon.PickSpawnOptionscwd
import typings.expoPackageManager.anon.ShouldUpdateRepo
import typings.expoPackageManager.buildIosCocoaPodsPackageManagerMod.CocoaPodsErrorCode
import typings.expoPackageManager.buildPackageManagerMod.PackageManagerOptions
import typings.expoPackageManager.buildUtilsNodeManagersMod.NodePackageManager
import typings.expoPackageManager.buildUtilsNodeManagersMod.NodePackageManagerForProject
import typings.expoSpawnAsync.mod.SpawnOptions
import typings.expoSpawnAsync.mod.SpawnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/package-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/package-manager", "CocoaPodsError")
  @js.native
  open class CocoaPodsError protected ()
    extends typings.expoPackageManager.buildIosCocoaPodsPackageManagerMod.CocoaPodsError {
    def this(message: String, code: CocoaPodsErrorCode) = this()
    def this(message: String, code: CocoaPodsErrorCode, cause: js.Error) = this()
  }
  
  @JSImport("@expo/package-manager", "CocoaPodsPackageManager")
  @js.native
  open class CocoaPodsPackageManager protected ()
    extends typings.expoPackageManager.buildIosCocoaPodsPackageManagerMod.CocoaPodsPackageManager {
    def this(param0: Cwd) = this()
  }
  /* static members */
  object CocoaPodsPackageManager {
    
    @JSImport("@expo/package-manager", "CocoaPodsPackageManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def brewInstallCLIAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewInstallCLIAsync")().asInstanceOf[js.Promise[Unit]]
    inline def brewInstallCLIAsync(spawnOptions: SpawnOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewInstallCLIAsync")(spawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def brewLinkCLIAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewLinkCLIAsync")().asInstanceOf[js.Promise[Unit]]
    inline def brewLinkCLIAsync(spawnOptions: SpawnOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewLinkCLIAsync")(spawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def gemInstallCLIAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("gemInstallCLIAsync")().asInstanceOf[js.Promise[Unit]]
    inline def gemInstallCLIAsync(nonInteractive: Boolean): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("gemInstallCLIAsync")(nonInteractive.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def gemInstallCLIAsync(nonInteractive: Boolean, spawnOptions: SpawnOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("gemInstallCLIAsync")(nonInteractive.asInstanceOf[js.Any], spawnOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def gemInstallCLIAsync(nonInteractive: Unit, spawnOptions: SpawnOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("gemInstallCLIAsync")(nonInteractive.asInstanceOf[js.Any], spawnOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def getPodProjectRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodProjectRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def installCLIAsync(param0: NonInteractive): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("installCLIAsync")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def isAvailable(projectRoot: String, silent: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")(projectRoot.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isCLIInstalledAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCLIInstalledAsync")().asInstanceOf[js.Promise[Boolean]]
    inline def isCLIInstalledAsync(spawnOptions: SpawnOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCLIInstalledAsync")(spawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def isUsingPods(projectRoot: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingPods")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@expo/package-manager", "NPM_LOCK_FILE")
  @js.native
  val NPM_LOCK_FILE: /* "package-lock.json" */ String = js.native
  
  @JSImport("@expo/package-manager", "NpmPackageManager")
  @js.native
  open class NpmPackageManager ()
    extends typings.expoPackageManager.buildNodeNpmPackageManagerMod.NpmPackageManager {
    def this(param0: PackageManagerOptions) = this()
  }
  
  @JSImport("@expo/package-manager", "PNPM_LOCK_FILE")
  @js.native
  val PNPM_LOCK_FILE: /* "pnpm-lock.yaml" */ String = js.native
  
  @JSImport("@expo/package-manager", "PNPM_WORKSPACE_FILE")
  @js.native
  val PNPM_WORKSPACE_FILE: /* "pnpm-workspace.yaml" */ String = js.native
  
  @JSImport("@expo/package-manager", "PnpmPackageManager")
  @js.native
  open class PnpmPackageManager ()
    extends typings.expoPackageManager.buildNodePnpmPackageManagerMod.PnpmPackageManager {
    def this(param0: PackageManagerOptions) = this()
  }
  
  @JSImport("@expo/package-manager", "RESOLUTION_ORDER")
  @js.native
  val RESOLUTION_ORDER: js.Array[/* "npm" */ String] = js.native
  
  @JSImport("@expo/package-manager", "YARN_LOCK_FILE")
  @js.native
  val YARN_LOCK_FILE: /* "yarn.lock" */ String = js.native
  
  @JSImport("@expo/package-manager", "YarnPackageManager")
  @js.native
  open class YarnPackageManager ()
    extends typings.expoPackageManager.buildNodeYarnPackageManagerMod.YarnPackageManager {
    def this(param0: PackageManagerOptions) = this()
  }
  
  inline def createForProject(projectRoot: String): NodePackageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createForProject")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[NodePackageManager]
  inline def createForProject(projectRoot: String, options: NodePackageManagerForProject): NodePackageManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProject")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NodePackageManager]
  
  inline def extractMissingDependencyError(errorOutput: String): (js.Tuple2[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractMissingDependencyError")(errorOutput.asInstanceOf[js.Any]).asInstanceOf[(js.Tuple2[String, String]) | Null]
  
  inline def findPnpmWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findPnpmWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def findWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def findWorkspaceRoot(projectRoot: String, preferredManager: /* "npm" */ String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(projectRoot.asInstanceOf[js.Any], preferredManager.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def findYarnOrNpmWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findYarnOrNpmWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getImprovedPodInstallError(error: SpawnResult & js.Error, param1: PickSpawnOptionscwd): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getImprovedPodInstallError")(error.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def getPodRepoUpdateMessage(errorOutput: String): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodRepoUpdateMessage")(errorOutput.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  inline def getPodUpdateMessage(output: String): ShouldUpdateRepo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodUpdateMessage")(output.asInstanceOf[js.Any]).asInstanceOf[ShouldUpdateRepo]
  
  inline def isYarnOfflineAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isYarnOfflineAsync")().asInstanceOf[js.Promise[Boolean]]
  
  inline def resolvePackageManager(projectRoot: String): (/* "npm" */ String) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageManager")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[(/* "npm" */ String) | Null]
  inline def resolvePackageManager(projectRoot: String, preferredManager: /* "npm" */ String): (/* "npm" */ String) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageManager")(projectRoot.asInstanceOf[js.Any], preferredManager.asInstanceOf[js.Any])).asInstanceOf[(/* "npm" */ String) | Null]
}
