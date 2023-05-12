package typings.expoPackageManager

import typings.expoPackageManager.buildNodeBasePackageManagerMod.BasePackageManager
import typings.expoPackageManager.buildPackageManagerMod.PackageManagerOptions
import typings.expoPackageManager.buildUtilsNodeManagersMod.NodePackageManager
import typings.expoSpawnAsync.mod.SpawnPromise
import typings.expoSpawnAsync.mod.SpawnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNodePnpmPackageManagerMod {
  
  @JSImport("@expo/package-manager/build/node/PnpmPackageManager", "PnpmPackageManager")
  @js.native
  open class PnpmPackageManager ()
    extends BasePackageManager
       with NodePackageManager {
    def this(param0: PackageManagerOptions) = this()
    
    def addAsync(): SpawnPromise[SpawnResult] = js.native
    
    def addDevAsync(): SpawnPromise[SpawnResult] = js.native
    
    def addGlobalAsync(): SpawnPromise[SpawnResult] = js.native
  }
}
