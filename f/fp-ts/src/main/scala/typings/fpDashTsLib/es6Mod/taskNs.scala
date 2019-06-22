package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "task")
@js.native
object taskNs extends js.Object {
  @js.native
  class Task[A] protected ()
    extends fpDashTsLib.es6TaskMod.Task[A] {
    def this(run: fpDashTsLib.es6FunctionMod.Lazy[js.Promise[A]]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Task = js.native
  val never: fpDashTsLib.es6TaskMod.Task[scala.Nothing] = js.native
  val task: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.es6TaskMod.URI] with fpDashTsLib.es6MonadIOMod.MonadIO1[fpDashTsLib.es6TaskMod.URI] with fpDashTsLib.es6MonadTaskMod.MonadTask1[fpDashTsLib.es6TaskMod.URI] = js.native
  val taskSeq: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.es6TaskMod.URI] with fpDashTsLib.es6MonadIOMod.MonadIO1[fpDashTsLib.es6TaskMod.URI] with fpDashTsLib.es6MonadTaskMod.MonadTask1[fpDashTsLib.es6TaskMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, flatten, map) */ def ap[A](fa: fpDashTsLib.es6TaskMod.Task[A]): js.Function1[
    /* fab */ fpDashTsLib.es6TaskMod.Task[js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6TaskMod.Task[_]
  ] = js.native
  def delay[A](millis: scala.Double, a: A): fpDashTsLib.es6TaskMod.Task[A] = js.native
  def delay2v(millis: scala.Double): js.Function1[/* ma */ fpDashTsLib.es6TaskMod.Task[_], fpDashTsLib.es6TaskMod.Task[_]] = js.native
  def fromIO[A](io: fpDashTsLib.es6IOMod.IO[A]): fpDashTsLib.es6TaskMod.Task[A] = js.native
  def getMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6TaskMod.Task[A]] = js.native
  def getRaceMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6TaskMod.Task[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6TaskMod.Task[A]] = js.native
  def of[A](a: A): fpDashTsLib.es6TaskMod.Task[A] = js.native
  def tryCatch[L, A](
    f: fpDashTsLib.es6FunctionMod.Lazy[js.Promise[A]],
    onrejected: js.Function1[/* reason */ js.Any, L]
  ): fpDashTsLib.es6TaskMod.Task[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
}

