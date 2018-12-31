package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  val Buffer: org.scalablytyped.runtime.Instantiable0[fibjsLib.globalMod.Buffer] = js.native
  /** const setImmediate: Timer; */
  /** const clearImmediate: null; */
  val GC: js.Function0[scala.Unit] = js.native
  val Int64: org.scalablytyped.runtime.Instantiable0[fibjsLib.globalMod.Int64] = js.native
  val Master: fibjsLib.Class_Worker = js.native
  val __dirname: java.lang.String = js.native
  val __filename: java.lang.String = js.native
  val argv: js.Array[js.Any] = js.native
  val clearHrInterval: js.Function1[/* t */ js.Any, scala.Unit] = js.native
  var exports: fibjsLib.GlobalExportsType = js.native
  val global: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fibjs.global.global */ js.Any = js.native
  val module: fibjsLib.ModuleType = js.native
  /** const console: console; */
  val process: fibjsLib.Anon_ExecPath = js.native
  val repl: fibjsLib.Anon_Cmds = js.native
  /** const run: null; */
  val require: js.Function1[/* id */ java.lang.String, js.Any] = js.native
  /** const setTimeout: Timer; */
  /** const clearTimeout: null; */
  /** const setInterval: Timer; */
  /** const clearInterval: null; */
  val setHrInterval: js.Function3[
    /* callback */ js.Function, 
    /* timeout */ scala.Double, 
    /* repeated */ js.Any, 
    fibjsLib.Class_Timer
  ] = js.native
}

