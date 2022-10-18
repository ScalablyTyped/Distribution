package typings.expoPackageManager

import typings.expoPackageManager.anon.Log
import typings.expoPackageManager.buildPackageManagerMod.Logger
import typings.expoPackageManager.buildPackageManagerMod.PackageManager
import typings.expoPackageManager.buildPnpmPackageManagerMod.PnpmPackageManager
import typings.expoSpawnAsync.mod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNodePackageManagersMod {
  
  @JSImport("@expo/package-manager/build/NodePackageManagers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DISABLE_ADS_ENV {
    
    @JSImport("@expo/package-manager/build/NodePackageManagers", "DISABLE_ADS_ENV")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/package-manager/build/NodePackageManagers", "DISABLE_ADS_ENV.ADBLOCK")
    @js.native
    def ADBLOCK: String = js.native
    inline def ADBLOCK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADBLOCK")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/package-manager/build/NodePackageManagers", "DISABLE_ADS_ENV.DISABLE_OPENCOLLECTIVE")
    @js.native
    def DISABLE_OPENCOLLECTIVE: String = js.native
    inline def DISABLE_OPENCOLLECTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLE_OPENCOLLECTIVE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@expo/package-manager/build/NodePackageManagers", "NpmPackageManager")
  @js.native
  open class NpmPackageManager protected ()
    extends StObject
       with PackageManager {
    def this(hasCwdLogSilent: Log) = this()
    
    /* private */ var _parseSpecs: Any = js.native
    
    /* private */ var _patchAsync: Any = js.native
    
    /* private */ var _runAsync: Any = js.native
    
    /* CompleteClass */
    override def addAsync(names: String*): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def addDevAsync(names: String*): js.Promise[Unit] = js.native
    
    def addGlobalAsync(names: String*): js.Promise[Unit] = js.native
    
    def addWithParametersAsync(names: js.Array[String]): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def addWithParametersAsync(names: js.Array[String], parameters: js.Array[String]): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def cleanAsync(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def getConfigAsync(key: String): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def installAsync(): js.Promise[Unit] = js.native
    def installAsync(parameters: js.Array[String]): js.Promise[Unit] = js.native
    
    /* private */ var log: Any = js.native
    
    def name: String = js.native
    
    var options: SpawnOptions = js.native
    
    def removeAsync(names: String*): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def removeLockfileAsync(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def versionAsync(): js.Promise[String] = js.native
  }
  
  @JSImport("@expo/package-manager/build/NodePackageManagers", "YarnPackageManager")
  @js.native
  open class YarnPackageManager protected ()
    extends StObject
       with PackageManager {
    def this(hasCwdLogSilent: Log) = this()
    
    /* private */ var _runAsync: Any = js.native
    
    /* CompleteClass */
    override def addAsync(names: String*): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def addDevAsync(names: String*): js.Promise[Unit] = js.native
    
    def addGlobalAsync(names: String*): js.Promise[Unit] = js.native
    
    def addWithParametersAsync(names: js.Array[String]): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def addWithParametersAsync(names: js.Array[String], parameters: js.Array[String]): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def cleanAsync(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def getConfigAsync(key: String): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def installAsync(): js.Promise[Unit] = js.native
    
    /* private */ var log: Any = js.native
    
    def name: String = js.native
    
    var options: SpawnOptions = js.native
    
    def removeAsync(names: String*): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def removeLockfileAsync(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def versionAsync(): js.Promise[String] = js.native
    
    /* private */ var withOfflineSupportAsync: Any = js.native
  }
  
  inline def createForProject(projectRoot: String): NpmPackageManager | YarnPackageManager | PnpmPackageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createForProject")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[NpmPackageManager | YarnPackageManager | PnpmPackageManager]
  inline def createForProject(projectRoot: String, options: CreateForProjectOptions): NpmPackageManager | YarnPackageManager | PnpmPackageManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProject")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NpmPackageManager | YarnPackageManager | PnpmPackageManager]
  
  inline def getModulesPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModulesPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Inlined std.Partial<std.Record<@expo/package-manager.@expo/package-manager/build/NodePackageManagers.NodePackageManager, boolean>> & {  log :@expo/package-manager.@expo/package-manager/build/PackageManager.Logger | undefined,   silent :boolean | undefined} */
  trait CreateForProjectOptions extends StObject {
    
    var log: js.UndefOr[Logger] = js.undefined
    
    var npm: js.UndefOr[Boolean] = js.undefined
    
    var pnpm: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var yarn: js.UndefOr[Boolean] = js.undefined
  }
  object CreateForProjectOptions {
    
    inline def apply(): CreateForProjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateForProjectOptions]
    }
    
    extension [Self <: CreateForProjectOptions](x: Self) {
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setNpm(value: Boolean): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      inline def setNpmUndefined: Self = StObject.set(x, "npm", js.undefined)
      
      inline def setPnpm(value: Boolean): Self = StObject.set(x, "pnpm", value.asInstanceOf[js.Any])
      
      inline def setPnpmUndefined: Self = StObject.set(x, "pnpm", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setYarn(value: Boolean): Self = StObject.set(x, "yarn", value.asInstanceOf[js.Any])
      
      inline def setYarnUndefined: Self = StObject.set(x, "yarn", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoPackageManager.expoPackageManagerStrings.yarn
    - typings.expoPackageManager.expoPackageManagerStrings.npm
    - typings.expoPackageManager.expoPackageManagerStrings.pnpm
  */
  trait NodePackageManager extends StObject
  object NodePackageManager {
    
    inline def npm: typings.expoPackageManager.expoPackageManagerStrings.npm = "npm".asInstanceOf[typings.expoPackageManager.expoPackageManagerStrings.npm]
    
    inline def pnpm: typings.expoPackageManager.expoPackageManagerStrings.pnpm = "pnpm".asInstanceOf[typings.expoPackageManager.expoPackageManagerStrings.pnpm]
    
    inline def yarn: typings.expoPackageManager.expoPackageManagerStrings.yarn = "yarn".asInstanceOf[typings.expoPackageManager.expoPackageManagerStrings.yarn]
  }
}
