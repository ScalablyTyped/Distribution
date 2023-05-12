package typings.expoPackageManager

import typings.expoPackageManager.buildNodeBasePackageManagerMod.BasePackageManager
import typings.expoPackageManager.buildPackageManagerMod.PackageManagerOptions
import typings.expoPackageManager.buildUtilsNodeManagersMod.NodePackageManager
import typings.expoPackageManager.buildUtilsSpawnMod.PendingSpawnPromise
import typings.expoSpawnAsync.mod.SpawnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNodeYarnPackageManagerMod {
  
  @JSImport("@expo/package-manager/build/node/YarnPackageManager", "YarnPackageManager")
  @js.native
  open class YarnPackageManager ()
    extends BasePackageManager
       with NodePackageManager {
    def this(param0: PackageManagerOptions) = this()
    
    def addAsync(): PendingSpawnPromise[SpawnResult] = js.native
    
    def addDevAsync(): PendingSpawnPromise[SpawnResult] = js.native
    
    def addGlobalAsync(): PendingSpawnPromise[SpawnResult] = js.native
    
    /** Check if Yarn is running in offline mode, and add the `--offline` flag */
    /* private */ var withOfflineFlagAsync: Any = js.native
  }
}
