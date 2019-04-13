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
    def this(run: fpDashTsLib.libFunctionMod.Lazy[js.Promise[A]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Task = js.native
  val task: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libTaskMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO1[fpDashTsLib.libTaskMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask1[fpDashTsLib.libTaskMod.URI] = js.native
  val taskSeq: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libTaskMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO1[fpDashTsLib.libTaskMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask1[fpDashTsLib.libTaskMod.URI] = js.native
  def delay[A](millis: scala.Double, a: A): fpDashTsLib.libTaskMod.Task[A] = js.native
  def fromIO[A](io: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libTaskMod.Task[A] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libTaskMod.Task[A]] = js.native
  def getRaceMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libTaskMod.Task[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTaskMod.Task[A]] = js.native
  def tryCatch[L, A](
    f: fpDashTsLib.libFunctionMod.Lazy[js.Promise[A]],
    onrejected: js.Function1[/* reason */ js.Any, L]
  ): fpDashTsLib.libTaskMod.Task[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
}

