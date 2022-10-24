package typings.expoPackageManager

import typings.expoPackageManager.anon.Cwd
import typings.expoPackageManager.anon.Message
import typings.expoPackageManager.anon.NonInteractive
import typings.expoPackageManager.anon.ShouldUpdateRepo
import typings.expoPackageManager.anon.Spinner
import typings.expoPackageManager.anon.`0`
import typings.expoPackageManager.buildPackageManagerMod.PackageManager
import typings.expoSpawnAsync.mod.SpawnOptions
import typings.expoSpawnAsync.mod.SpawnResult
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCocoaPodsPackageManagerMod {
  
  @JSImport("@expo/package-manager/build/CocoaPodsPackageManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/package-manager/build/CocoaPodsPackageManager", "CocoaPodsError")
  @js.native
  open class CocoaPodsError protected ()
    extends StObject
       with Error {
    def this(message: String, code: CocoaPodsErrorCode) = this()
    def this(message: String, code: CocoaPodsErrorCode, cause: js.Error) = this()
    
    @JSName("cause")
    var cause_CocoaPodsError: js.UndefOr[js.Error] = js.native
    
    var code: CocoaPodsErrorCode = js.native
    
    val isPackageManagerError: /* true */ Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@expo/package-manager/build/CocoaPodsPackageManager", "CocoaPodsPackageManager")
  @js.native
  open class CocoaPodsPackageManager protected ()
    extends StObject
       with PackageManager {
    def this(param0: Cwd) = this()
    
    /* private */ var _installAsync: Any = js.native
    
    def _runAsync(args: js.Array[String]): js.Promise[SpawnResult] = js.native
    
    /* CompleteClass */
    override def addAsync(names: String*): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def addDevAsync(names: String*): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def addWithParametersAsync(names: js.Array[String], parameters: js.Array[String]): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def cleanAsync(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def getConfigAsync(key: String): js.Promise[String] = js.native
    
    def handleInstallErrorAsync(param0: typings.expoPackageManager.anon.Error): js.Promise[SpawnResult] = js.native
    
    /* CompleteClass */
    override def installAsync(): js.Promise[Unit] = js.native
    def installAsync(param0: Spinner): js.Promise[Unit] = js.native
    
    def installCLIAsync(): js.Promise[Boolean] = js.native
    
    def isCLIInstalledAsync(): js.Promise[Boolean] = js.native
    
    def name: String = js.native
    
    var options: SpawnOptions = js.native
    
    /* private */ var podRepoUpdateAsync: Any = js.native
    
    /* CompleteClass */
    override def removeLockfileAsync(): js.Promise[Unit] = js.native
    
    /* private */ var runInstallTypeCommandAsync: Any = js.native
    
    /* private */ var silent: Any = js.native
    
    /* CompleteClass */
    override def versionAsync(): js.Promise[String] = js.native
  }
  /* static members */
  object CocoaPodsPackageManager {
    
    @JSImport("@expo/package-manager/build/CocoaPodsPackageManager", "CocoaPodsPackageManager")
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
  
  inline def extractMissingDependencyError(errorOutput: String): (js.Tuple2[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractMissingDependencyError")(errorOutput.asInstanceOf[js.Any]).asInstanceOf[(js.Tuple2[String, String]) | Null]
  
  inline def getImprovedPodInstallError(error: SpawnResult & js.Error, param1: `0`): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getImprovedPodInstallError")(error.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def getPodRepoUpdateMessage(errorOutput: String): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodRepoUpdateMessage")(errorOutput.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  inline def getPodUpdateMessage(output: String): ShouldUpdateRepo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodUpdateMessage")(output.asInstanceOf[js.Any]).asInstanceOf[ShouldUpdateRepo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoPackageManager.expoPackageManagerStrings.NON_INTERACTIVE
    - typings.expoPackageManager.expoPackageManagerStrings.NO_CLI
    - typings.expoPackageManager.expoPackageManagerStrings.COMMAND_FAILED
  */
  trait CocoaPodsErrorCode extends StObject
  object CocoaPodsErrorCode {
    
    inline def COMMAND_FAILED: typings.expoPackageManager.expoPackageManagerStrings.COMMAND_FAILED = "COMMAND_FAILED".asInstanceOf[typings.expoPackageManager.expoPackageManagerStrings.COMMAND_FAILED]
    
    inline def NON_INTERACTIVE: typings.expoPackageManager.expoPackageManagerStrings.NON_INTERACTIVE = "NON_INTERACTIVE".asInstanceOf[typings.expoPackageManager.expoPackageManagerStrings.NON_INTERACTIVE]
    
    inline def NO_CLI: typings.expoPackageManager.expoPackageManagerStrings.NO_CLI = "NO_CLI".asInstanceOf[typings.expoPackageManager.expoPackageManagerStrings.NO_CLI]
  }
}
