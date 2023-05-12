package typings.expoPackageManager

import typings.expoSpawnAsync.mod.SpawnOptions
import typings.expoSpawnAsync.mod.SpawnPromise
import typings.node.childProcessMod.ChildProcess
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsSpawnMod {
  
  @JSImport("@expo/package-manager/build/utils/spawn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPendingSpawnAsync[V, T](
    actionAsync: js.Function0[js.Promise[V]],
    spawnAsync: js.Function1[/* result */ V, SpawnPromise[T]]
  ): PendingSpawnPromise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPendingSpawnAsync")(actionAsync.asInstanceOf[js.Any], spawnAsync.asInstanceOf[js.Any])).asInstanceOf[PendingSpawnPromise[T]]
  
  inline def spawnSudoAsync(command: js.Array[String], spawnOptions: SpawnOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSudoAsync")(command.asInstanceOf[js.Any], spawnOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @js.native
  trait PendingSpawnPromise[T]
    extends StObject
       with Promise[T] {
    
    /**
      * The child process from the delayed spawn.
      * This is `null` whenever the promise before the spawn promise is rejected.
      */
    var child: js.Promise[ChildProcess | Null] = js.native
  }
}
