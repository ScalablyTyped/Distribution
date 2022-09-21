package typings.expoPackageManager

import typings.expoPackageManager.anon.Log
import typings.expoSpawnAsync.mod.SpawnOptions
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pnpmPackageManagerMod {
  
  @JSImport("@expo/package-manager/build/PnpmPackageManager", "PnpmPackageManager")
  @js.native
  open class PnpmPackageManager protected () extends StObject {
    def this(hasCwdLogSilent: Log) = this()
    
    /* private */ var _runAsync: Any = js.native
    
    def addAsync(names: String*): js.Promise[Unit] = js.native
    
    def addDevAsync(names: String*): js.Promise[Unit] = js.native
    
    def addGlobalAsync(names: String*): js.Promise[Unit] = js.native
    
    def addWithParametersAsync(names: js.Array[String], parameters: js.Array[String]): js.Promise[Unit] = js.native
    
    def cleanAsync(): js.Promise[Unit] = js.native
    
    def getConfigAsync(key: String): js.Promise[String] = js.native
    
    def installAsync(): js.Promise[Unit] = js.native
    
    /* private */ var log: Any = js.native
    
    def name: String = js.native
    
    var options: SpawnOptions = js.native
    
    def removeAsync(names: String*): js.Promise[Unit] = js.native
    
    def removeLockfileAsync(): js.Promise[Unit] = js.native
    
    def versionAsync(): js.Promise[String] = js.native
  }
  
  @JSImport("@expo/package-manager/build/PnpmPackageManager", "PnpmStdoutTransform")
  @js.native
  open class PnpmStdoutTransform () extends Transform {
    def this(opts: TransformOptions) = this()
    
    def _transform(
      chunk: Buffer,
      encoding: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    /* private */ var isPeerDepsWarning: Any = js.native
  }
}
