package typings
package fpDashTsLib.es6TaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Task", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Task = js.native
  val task: fpDashTsLib.es6MonadMod.Monad1[URI] with fpDashTsLib.es6MonadIOMod.MonadIO1[URI] with fpDashTsLib.es6MonadTaskMod.MonadTask1[URI] = js.native
  val taskSeq: fpDashTsLib.es6MonadMod.Monad1[URI] with fpDashTsLib.es6MonadIOMod.MonadIO1[URI] with fpDashTsLib.es6MonadTaskMod.MonadTask1[URI] = js.native
  def delay[A](millis: scala.Double, a: A): Task[A] = js.native
  def fromIO[A](io: fpDashTsLib.es6IOMod.IO[A]): Task[A] = js.native
  def getMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Task[A]] = js.native
  def getRaceMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[Task[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Task[A]] = js.native
  def tryCatch[L, A](
    f: fpDashTsLib.es6FunctionMod.Lazy[js.Promise[A]],
    onrejected: js.Function1[/* reason */ js.Any, L]
  ): Task[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
}

