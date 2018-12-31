package typings
package atEmberRunloopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", JSImport.Namespace)
@js.native
object runloopMod extends js.Object {
  val begin: js.Function0[scala.Unit] = js.native
  val bind: atEmberRunloopLib.Anon_TargetMethod = js.native
  val cancel: js.Function1[/* timer */ atEmberRunloopLib.typesMod.EmberRunTimer, scala.Boolean] = js.native
  val debounce: atEmberRunloopLib.Anon_MethodArgsWaitImmediate = js.native
  val end: js.Function0[scala.Unit] = js.native
  val join: atEmberRunloopLib.Anon_Method = js.native
  val later: atEmberRunloopLib.Anon_MethodArgsWait = js.native
  val next: atEmberRunloopLib.Anon_Target = js.native
  val once: atEmberRunloopLib.Anon_Target = js.native
  val run: atEmberRunloopLib.Anon_MethodArgs = js.native
  val schedule: atEmberRunloopLib.Anon_QueueTarget = js.native
  val scheduleOnce: atEmberRunloopLib.Anon_Queue = js.native
  val throttle: atEmberRunloopLib.Anon_MethodArgsSpacing = js.native
}

