package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "task")
@js.native
object taskNs extends js.Object {
  @js.native
  class Task[A] protected ()
    extends fpDashTsLib.libTaskMod.Task[A] {
    def this(run: fpDashTsLib.libFunctionMod.Lazy[stdLib.Promise[A]]) = this()
  }
  
  val URI: /* Task */ java.lang.String = js.native
  val delay: js.Function2[/* millis */ scala.Double, /* a */ js.Any, fpDashTsLib.libTaskMod.Task[js.Any]] = js.native
  val fromIO: js.Function1[/* io */ fpDashTsLib.libIOMod.IO[js.Any], fpDashTsLib.libTaskMod.Task[js.Any]] = js.native
  val getMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libTaskMod.Task[js.Any]]
  ] = js.native
  val getRaceMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libTaskMod.Task[js.Any]]] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTaskMod.Task[js.Any]]
  ] = js.native
  val task: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libTaskMod.URI] = js.native
  val tryCatch: js.Function2[
    /* f */ fpDashTsLib.libFunctionMod.Lazy[stdLib.Promise[js.Any]], 
    /* onrejected */ js.Function1[/* reason */ js.Object, js.Any], 
    fpDashTsLib.libTaskMod.Task[fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
  ] = js.native
}

