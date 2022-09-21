package typings.expoPackageManager

import typings.expoPackageManager.anon.Cwd
import typings.expoPackageManager.anon.Log
import typings.expoPackageManager.anon.Message
import typings.expoPackageManager.anon.NonInteractive
import typings.expoPackageManager.anon.ShouldUpdateRepo
import typings.expoPackageManager.anon.`0`
import typings.expoPackageManager.cocoaPodsPackageManagerMod.CocoaPodsErrorCode
import typings.expoPackageManager.nodePackageManagersMod.CreateForProjectOptions
import typings.expoPackageManager.nodePackageManagersMod.NodePackageManager
import typings.expoSpawnAsync.mod.SpawnOptions
import typings.expoSpawnAsync.mod.SpawnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/package-manager/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/package-manager/build", "CocoaPodsError")
  @js.native
  open class CocoaPodsError protected ()
    extends typings.expoPackageManager.cocoaPodsPackageManagerMod.CocoaPodsError {
    def this(message: String, code: CocoaPodsErrorCode) = this()
    def this(message: String, code: CocoaPodsErrorCode, cause: js.Error) = this()
  }
  
  @JSImport("@expo/package-manager/build", "CocoaPodsPackageManager")
  @js.native
  open class CocoaPodsPackageManager protected ()
    extends typings.expoPackageManager.cocoaPodsPackageManagerMod.CocoaPodsPackageManager {
    def this(hasCwdSilent: Cwd) = this()
  }
  /* static members */
  object CocoaPodsPackageManager {
    
    @JSImport("@expo/package-manager/build", "CocoaPodsPackageManager")
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
    
    inline def installCLIAsync(hasNonInteractiveSpawnOptions: NonInteractive): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("installCLIAsync")(hasNonInteractiveSpawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def isAvailable(projectRoot: String, silent: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")(projectRoot.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isCLIInstalledAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCLIInstalledAsync")().asInstanceOf[js.Promise[Boolean]]
    inline def isCLIInstalledAsync(spawnOptions: SpawnOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCLIInstalledAsync")(spawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def isUsingPods(projectRoot: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingPods")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object DISABLE_ADS_ENV {
    
    @JSImport("@expo/package-manager/build", "DISABLE_ADS_ENV")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/package-manager/build", "DISABLE_ADS_ENV.ADBLOCK")
    @js.native
    def ADBLOCK: String = js.native
    inline def ADBLOCK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADBLOCK")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/package-manager/build", "DISABLE_ADS_ENV.DISABLE_OPENCOLLECTIVE")
    @js.native
    def DISABLE_OPENCOLLECTIVE: String = js.native
    inline def DISABLE_OPENCOLLECTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLE_OPENCOLLECTIVE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@expo/package-manager/build", "NPM_LOCK_FILE")
  @js.native
  val NPM_LOCK_FILE: /* "package-lock.json" */ String = js.native
  
  @JSImport("@expo/package-manager/build", "NpmPackageManager")
  @js.native
  open class NpmPackageManager protected ()
    extends typings.expoPackageManager.nodePackageManagersMod.NpmPackageManager {
    def this(hasCwdLogSilent: Log) = this()
  }
  
  @JSImport("@expo/package-manager/build", "PNPM_LOCK_FILE")
  @js.native
  val PNPM_LOCK_FILE: /* "pnpm-lock.yaml" */ String = js.native
  
  @JSImport("@expo/package-manager/build", "PNPM_WORKSPACE_FILE")
  @js.native
  val PNPM_WORKSPACE_FILE: /* "pnpm-workspace.yaml" */ String = js.native
  
  @JSImport("@expo/package-manager/build", "PnpmPackageManager")
  @js.native
  open class PnpmPackageManager protected ()
    extends typings.expoPackageManager.pnpmPackageManagerMod.PnpmPackageManager {
    def this(hasCwdLogSilent: Log) = this()
  }
  
  @JSImport("@expo/package-manager/build", "YARN_LOCK_FILE")
  @js.native
  val YARN_LOCK_FILE: /* "yarn.lock" */ String = js.native
  
  @JSImport("@expo/package-manager/build", "YarnPackageManager")
  @js.native
  open class YarnPackageManager protected ()
    extends typings.expoPackageManager.nodePackageManagersMod.YarnPackageManager {
    def this(hasCwdLogSilent: Log) = this()
  }
  
  inline def createForProject(projectRoot: String): typings.expoPackageManager.nodePackageManagersMod.NpmPackageManager | typings.expoPackageManager.nodePackageManagersMod.YarnPackageManager | typings.expoPackageManager.pnpmPackageManagerMod.PnpmPackageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createForProject")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[typings.expoPackageManager.nodePackageManagersMod.NpmPackageManager | typings.expoPackageManager.nodePackageManagersMod.YarnPackageManager | typings.expoPackageManager.pnpmPackageManagerMod.PnpmPackageManager]
  inline def createForProject(projectRoot: String, options: CreateForProjectOptions): typings.expoPackageManager.nodePackageManagersMod.NpmPackageManager | typings.expoPackageManager.nodePackageManagersMod.YarnPackageManager | typings.expoPackageManager.pnpmPackageManagerMod.PnpmPackageManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProject")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.expoPackageManager.nodePackageManagersMod.NpmPackageManager | typings.expoPackageManager.nodePackageManagersMod.YarnPackageManager | typings.expoPackageManager.pnpmPackageManagerMod.PnpmPackageManager]
  
  inline def extractMissingDependencyError(errorOutput: String): (js.Tuple2[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractMissingDependencyError")(errorOutput.asInstanceOf[js.Any]).asInstanceOf[(js.Tuple2[String, String]) | Null]
  
  inline def findWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def findWorkspaceRoot(projectRoot: String, packageManager: NodePackageManager): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceRoot")(projectRoot.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def findYarnOrNpmWorkspaceRootSafe(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findYarnOrNpmWorkspaceRootSafe")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getImprovedPodInstallError(error: SpawnResult & js.Error, hasCwd: `0`): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getImprovedPodInstallError")(error.asInstanceOf[js.Any], hasCwd.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def getModulesPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModulesPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPodRepoUpdateMessage(errorOutput: String): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodRepoUpdateMessage")(errorOutput.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  inline def getPodUpdateMessage(output: String): ShouldUpdateRepo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodUpdateMessage")(output.asInstanceOf[js.Any]).asInstanceOf[ShouldUpdateRepo]
  
  inline def getPossibleProjectRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleProjectRoot")().asInstanceOf[String]
  
  inline def isUsingNpm(projectRoot: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingNpm")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUsingYarn(projectRoot: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingYarn")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isYarnOfflineAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isYarnOfflineAsync")().asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@expo/package-manager/build", "managerResolutionOrder")
  @js.native
  val managerResolutionOrder: js.Array[NodePackageManager] = js.native
  
  inline def resolvePackageManager(projectRoot: String): NodePackageManager | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageManager")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[NodePackageManager | Null]
  inline def resolvePackageManager(projectRoot: String, packageManager: NodePackageManager): NodePackageManager | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackageManager")(projectRoot.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[NodePackageManager | Null]
  
  inline def shouldUseYarn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseYarn")().asInstanceOf[Boolean]
  
  inline def spawnSudoAsync(command: js.Array[String], spawnOptions: SpawnOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSudoAsync")(command.asInstanceOf[js.Any], spawnOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
