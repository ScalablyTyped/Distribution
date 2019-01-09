package typings
package atEmberRunloopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop", JSImport.Namespace)
@js.native
object runloopMod extends js.Object {
  val begin: js.Function0[scala.Unit] = js.native
  val bind: atEmberRunloopLib.Anon_Args = js.native
  val cancel: js.Function1[/* timer */ atEmberRunloopLib.typesMod.EmberRunTimer, scala.Boolean] = js.native
  val debounce: atEmberRunloopLib.Anon_Arg0Arg1 = js.native
  val end: js.Function0[scala.Unit] = js.native
  val join: atEmberRunloopLib.Anon_ArgsMethod = js.native
  val later: atEmberRunloopLib.Anon_Arg0Arg1Arg2 = js.native
  val next: atEmberRunloopLib.Anon_ArgsMethodTarget = js.native
  val once: atEmberRunloopLib.Anon_ArgsMethodTarget = js.native
  val run: atEmberRunloopLib.Anon_Arg0 = js.native
  val schedule: atEmberRunloopLib.Anon_ArgsMethodQueue = js.native
  val scheduleOnce: atEmberRunloopLib.Anon_ArgsMethodQueueTarget = js.native
  val throttle: atEmberRunloopLib.Anon_Arg0Arg1 = js.native
}

