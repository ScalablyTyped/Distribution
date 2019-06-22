package typings
package fpDashTsLib.libTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Task", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Task = js.native
  val never: Task[scala.Nothing] = js.native
  val task: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libMonadIOMod.MonadIO1[URI] with fpDashTsLib.libMonadTaskMod.MonadTask1[URI] = js.native
  val taskSeq: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libMonadIOMod.MonadIO1[URI] with fpDashTsLib.libMonadTaskMod.MonadTask1[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, flatten, map) */ def ap[A](fa: Task[A]): js.Function1[/* fab */ Task[js.Function1[/* a */ A, _]], Task[_]] = js.native
  def delay[A](millis: scala.Double, a: A): Task[A] = js.native
  def delay2v(millis: scala.Double): js.Function1[/* ma */ Task[_], Task[_]] = js.native
  def fromIO[A](io: fpDashTsLib.libIOMod.IO[A]): Task[A] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Task[A]] = js.native
  def getRaceMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[Task[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Task[A]] = js.native
  def of[A](a: A): Task[A] = js.native
  def tryCatch[L, A](
    f: fpDashTsLib.libFunctionMod.Lazy[js.Promise[A]],
    onrejected: js.Function1[/* reason */ js.Any, L]
  ): Task[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
}

