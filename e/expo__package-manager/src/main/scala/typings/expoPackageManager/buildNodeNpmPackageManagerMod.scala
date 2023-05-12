package typings.expoPackageManager

import typings.expoPackageManager.buildNodeBasePackageManagerMod.BasePackageManager
import typings.expoPackageManager.buildPackageManagerMod.PackageManagerOptions
import typings.expoPackageManager.buildUtilsNodeManagersMod.NodePackageManager
import typings.expoPackageManager.buildUtilsSpawnMod.PendingSpawnPromise
import typings.expoSpawnAsync.mod.SpawnPromise
import typings.expoSpawnAsync.mod.SpawnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNodeNpmPackageManagerMod {
  
  @JSImport("@expo/package-manager/build/node/NpmPackageManager", "NpmPackageManager")
  @js.native
  open class NpmPackageManager ()
    extends BasePackageManager
       with NodePackageManager {
    def this(param0: PackageManagerOptions) = this()
    
    def addAsync(): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    def addDevAsync(): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    def addGlobalAsync(): SpawnPromise[SpawnResult] | PendingSpawnPromise[SpawnResult] = js.native
    
    /**
      * Parse all package specifications from the names or flag list.
      * The result from this method can be used for `.updatePackageFileAsync`.
      */
    /* private */ var parsePackageSpecs: Any = js.native
    
    /**
      * Older npm versions have issues with mismatched nested dependencies when adding exact versions.
      * This propagates as issues like mismatched `@expo/config-pugins` versions.
      * As a workaround, we update the `package.json` directly and run `npm install`.
      */
    /* private */ var updatePackageFileAsync: Any = js.native
  }
}
