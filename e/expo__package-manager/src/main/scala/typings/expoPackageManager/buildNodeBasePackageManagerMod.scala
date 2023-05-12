package typings.expoPackageManager

import typings.expoPackageManager.buildPackageManagerMod.PackageManager
import typings.expoPackageManager.buildPackageManagerMod.PackageManagerOptions
import typings.expoPackageManager.buildUtilsSpawnMod.PendingSpawnPromise
import typings.expoSpawnAsync.mod.SpawnPromise
import typings.expoSpawnAsync.mod.SpawnResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNodeBasePackageManagerMod {
  
  /* note: abstract class */ @JSImport("@expo/package-manager/build/node/BasePackageManager", "BasePackageManager")
  @js.native
  open class BasePackageManager ()
    extends StObject
       with PackageManager {
    def this(param0: PackageManagerOptions) = this()
    
    /** Add a normal dependency to the project */
    /* CompleteClass */
    override def addAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    /** Add a development dependency to the project */
    /* CompleteClass */
    override def addDevAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    /** Add a global dependency to the environment */
    /* CompleteClass */
    override def addGlobalAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    /** Get the executable binary of the package manager */
    val bin: String = js.native
    
    /** Ensure the CWD is set to a non-empty string */
    /* protected */ def ensureCwdDefined(): String = js.native
    /* protected */ def ensureCwdDefined(method: String): String = js.native
    
    /** Get a single configuration property from the package manager */
    /* CompleteClass */
    override def getConfigAsync(key: String): js.Promise[String] = js.native
    
    /** Get the default environment variables used when running the package manager. */
    /* protected */ def getDefaultEnvironment(): Record[String, String] = js.native
    
    /** Install all current dependencies using the package manager */
    /* CompleteClass */
    override def installAsync(): js.Promise[SpawnResult] | SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    def installAsync(flags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    /** Get the lockfile for this package manager */
    val lockFile: String = js.native
    
    val log: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.native
    
    /** Get the name of the package manager */
    val name: String = js.native
    
    /** The options for this package manager */
    /* CompleteClass */
    override val options: PackageManagerOptions = js.native
    
    /** Remove a normal dependency from the project */
    /* CompleteClass */
    override def removeAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    /** Remove a development dependency from the project */
    /* CompleteClass */
    override def removeDevAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    /** Remove a global dependency from the environments */
    /* CompleteClass */
    override def removeGlobalAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    /** Remove the lock file within the project, if any */
    /* CompleteClass */
    override def removeLockfileAsync(): js.Promise[Unit] = js.native
    
    /** Run any command using the package manager */
    /* CompleteClass */
    override def runAsync(command: js.Array[String]): SpawnPromise[SpawnResult] = js.native
    
    val silent: Boolean = js.native
    
    /** Uninstall all current dependencies by removing the folder containing the packages */
    /* CompleteClass */
    override def uninstallAsync(): js.Promise[Unit] = js.native
    
    /** Get the version of the used package manager */
    /* CompleteClass */
    override def versionAsync(): js.Promise[String] = js.native
    
    /** Get the workspace root package manager, if this project is within a workspace/monorepo */
    /* CompleteClass */
    override def workspaceRoot(): PackageManager | Null = js.native
  }
}
