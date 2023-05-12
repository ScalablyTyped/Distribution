package typings.expoPackageManager

import typings.expoPackageManager.buildUtilsSpawnMod.PendingSpawnPromise
import typings.expoSpawnAsync.mod.SpawnOptions
import typings.expoSpawnAsync.mod.SpawnPromise
import typings.expoSpawnAsync.mod.SpawnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPackageManagerMod {
  
  trait PackageManager extends StObject {
    
    /** Add a normal dependency to the project */
    def addAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]
    
    /** Add a development dependency to the project */
    def addDevAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]
    
    /** Add a global dependency to the environment */
    def addGlobalAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]
    
    /** Get a single configuration property from the package manager */
    def getConfigAsync(key: String): js.Promise[String]
    
    /** Install all current dependencies using the package manager */
    def installAsync(): js.Promise[SpawnResult] | SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]
    
    /** The options for this package manager */
    val options: PackageManagerOptions
    
    /** Remove a normal dependency from the project */
    def removeAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]
    
    /** Remove a development dependency from the project */
    def removeDevAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]
    
    /** Remove a global dependency from the environments */
    def removeGlobalAsync(namesOrFlags: js.Array[String]): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]
    
    /** Remove the lock file within the project, if any */
    def removeLockfileAsync(): js.Promise[Unit]
    
    /** Run any command using the package manager */
    def runAsync(command: js.Array[String]): SpawnPromise[SpawnResult]
    
    /** Uninstall all current dependencies by removing the folder containing the packages */
    def uninstallAsync(): js.Promise[Unit]
    
    /** Get the version of the used package manager */
    def versionAsync(): js.Promise[String]
    
    /** Get the workspace root package manager, if this project is within a workspace/monorepo */
    def workspaceRoot(): PackageManager | Null
  }
  object PackageManager {
    
    inline def apply(
      addAsync: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult],
      addDevAsync: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult],
      addGlobalAsync: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult],
      getConfigAsync: String => js.Promise[String],
      installAsync: () => js.Promise[SpawnResult] | SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult],
      options: PackageManagerOptions,
      removeAsync: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult],
      removeDevAsync: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult],
      removeGlobalAsync: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult],
      removeLockfileAsync: () => js.Promise[Unit],
      runAsync: js.Array[String] => SpawnPromise[SpawnResult],
      uninstallAsync: () => js.Promise[Unit],
      versionAsync: () => js.Promise[String],
      workspaceRoot: () => PackageManager | Null
    ): PackageManager = {
      val __obj = js.Dynamic.literal(addAsync = js.Any.fromFunction1(addAsync), addDevAsync = js.Any.fromFunction1(addDevAsync), addGlobalAsync = js.Any.fromFunction1(addGlobalAsync), getConfigAsync = js.Any.fromFunction1(getConfigAsync), installAsync = js.Any.fromFunction0(installAsync), options = options.asInstanceOf[js.Any], removeAsync = js.Any.fromFunction1(removeAsync), removeDevAsync = js.Any.fromFunction1(removeDevAsync), removeGlobalAsync = js.Any.fromFunction1(removeGlobalAsync), removeLockfileAsync = js.Any.fromFunction0(removeLockfileAsync), runAsync = js.Any.fromFunction1(runAsync), uninstallAsync = js.Any.fromFunction0(uninstallAsync), versionAsync = js.Any.fromFunction0(versionAsync), workspaceRoot = js.Any.fromFunction0(workspaceRoot))
      __obj.asInstanceOf[PackageManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageManager] (val x: Self) extends AnyVal {
      
      inline def setAddAsync(value: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]): Self = StObject.set(x, "addAsync", js.Any.fromFunction1(value))
      
      inline def setAddDevAsync(value: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]): Self = StObject.set(x, "addDevAsync", js.Any.fromFunction1(value))
      
      inline def setAddGlobalAsync(value: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]): Self = StObject.set(x, "addGlobalAsync", js.Any.fromFunction1(value))
      
      inline def setGetConfigAsync(value: String => js.Promise[String]): Self = StObject.set(x, "getConfigAsync", js.Any.fromFunction1(value))
      
      inline def setInstallAsync(
        value: () => js.Promise[SpawnResult] | SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]
      ): Self = StObject.set(x, "installAsync", js.Any.fromFunction0(value))
      
      inline def setOptions(value: PackageManagerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRemoveAsync(value: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]): Self = StObject.set(x, "removeAsync", js.Any.fromFunction1(value))
      
      inline def setRemoveDevAsync(value: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]): Self = StObject.set(x, "removeDevAsync", js.Any.fromFunction1(value))
      
      inline def setRemoveGlobalAsync(value: js.Array[String] => SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult]): Self = StObject.set(x, "removeGlobalAsync", js.Any.fromFunction1(value))
      
      inline def setRemoveLockfileAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "removeLockfileAsync", js.Any.fromFunction0(value))
      
      inline def setRunAsync(value: js.Array[String] => SpawnPromise[SpawnResult]): Self = StObject.set(x, "runAsync", js.Any.fromFunction1(value))
      
      inline def setUninstallAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "uninstallAsync", js.Any.fromFunction0(value))
      
      inline def setVersionAsync(value: () => js.Promise[String]): Self = StObject.set(x, "versionAsync", js.Any.fromFunction0(value))
      
      inline def setWorkspaceRoot(value: () => PackageManager | Null): Self = StObject.set(x, "workspaceRoot", js.Any.fromFunction0(value))
    }
  }
  
  trait PackageManagerOptions
    extends StObject
       with SpawnOptions {
    
    /**
      * The logging method used to communicate the command which is executed.
      * Without `silent`, this defaults to `console.log`.
      * When `silent` is set to `true`, this defaults to a no-op.
      */
    var log: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    /**
      * If the package manager should run in silent mode.
      * Note, this will hide possible error output from executed commands.
      * When running in silent mode, make sure you handle them properly.
      */
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object PackageManagerOptions {
    
    inline def apply(): PackageManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
