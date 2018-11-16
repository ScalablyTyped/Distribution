package typings
package fpDashTsLib.libTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Task", JSImport.Namespace)
@js.native
object libTaskModMembers extends js.Object {
  val URI: /* Task */ java.lang.String = js.native
  val delay: js.Function2[/* millis */ scala.Double, /* a */ js.Any, Task[js.Any]] = js.native
  val fromIO: js.Function1[/* io */ fpDashTsLib.libIOMod.IO[js.Any], Task[js.Any]] = js.native
  val getMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[Task[js.Any]]
  ] = js.native
  val getRaceMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[Task[js.Any]]] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[Task[js.Any]]
  ] = js.native
  val task: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libMonadIOMod.MonadIO1[URI] with fpDashTsLib.libMonadTaskMod.MonadTask1[URI] = js.native
  val taskSeq: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libMonadIOMod.MonadIO1[URI] with fpDashTsLib.libMonadTaskMod.MonadTask1[URI] = js.native
  val tryCatch: js.Function2[
    /* f */ fpDashTsLib.libFunctionMod.Lazy[stdLib.Promise[js.Any]], 
    /* onrejected */ js.Function1[/* reason */ js.Object, js.Any], 
    Task[fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
  ] = js.native
}

