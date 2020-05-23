package typings.fibjs.declareMod

import org.scalablytyped.runtime.Instantiable0
import typings.fibjs.ClassStream
import typings.fibjs.ClassTimer
import typings.fibjs.ClassWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  val Buffer: Instantiable0[typings.fibjs.globalMod.Buffer] = js.native
  /** const setImmediate: Timer; */
  /** const clearImmediate: null; */
  val GC: js.Function0[Unit] = js.native
  val Int64: Instantiable0[typings.fibjs.globalMod.Int64] = js.native
  val Master: ClassWorker = js.native
  val argv: js.Array[js.Any] = js.native
  val clearHrInterval: js.Function1[/* t */ js.Any, Unit] = js.native
  @JSName("__dirname")
  val dirname: String = js.native
  var exports: GlobalExportsType = js.native
  @JSName("__filename")
  val filename: String = js.native
  val global: js.Object = js.native
  val module: ModuleType = js.native
  /** const console: console; */
  val process: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof processNS */ js.Any = js.native
  /** const run: null; */
  val require: js.Function1[/* id */ String, js.Any] = js.native
  /** const setTimeout: Timer; */
  /** const clearTimeout: null; */
  /** const setInterval: Timer; */
  /** const clearInterval: null; */
  val setHrInterval: js.Function3[/* callback */ js.Function, /* timeout */ Double, /* repeated */ js.Any, ClassTimer] = js.native
  @js.native
  object repl extends js.Object {
    def apply(): Unit = js.native
    def apply(cmds: js.Array[_]): Unit = js.native
    def apply(out: ClassStream): Unit = js.native
    def apply(out: ClassStream, cmds: js.Array[_]): Unit = js.native
  }
  
}

