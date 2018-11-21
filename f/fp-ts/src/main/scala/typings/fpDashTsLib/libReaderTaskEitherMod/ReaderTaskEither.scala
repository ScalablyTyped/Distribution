package typings
package fpDashTsLib.libReaderTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/ReaderTaskEither", "ReaderTaskEither")
@js.native
class ReaderTaskEither[E, L, A] protected () extends js.Object {
  def this(value: js.Function1[/* e */ E, fpDashTsLib.libTaskEitherMod.TaskEither[L, A]]) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _U: E = js.native
  val _URI: URI = js.native
  /**
       * @since 1.6.0
       */
  def alt(fy: ReaderTaskEither[E, L, A]): ReaderTaskEither[E, L, A] = js.native
  /**
       * @since 1.6.0
       */
  def ap[B](fab: ReaderTaskEither[E, L, js.Function1[/* a */ A, B]]): ReaderTaskEither[E, L, B] = js.native
  /**
       * @since 1.6.0
       */
  def `ap_`[B, C](`this`: ReaderTaskEither[E, L, js.Function1[/* b */ B, C]], fb: ReaderTaskEither[E, L, B]): ReaderTaskEither[E, L, C] = js.native
  /**
       * Combine two effectful actions, keeping only the result of the first
       * @since 1.6.0
       */
  def applyFirst[B](fb: ReaderTaskEither[E, L, B]): ReaderTaskEither[E, L, A] = js.native
  /**
       * Combine two effectful actions, keeping only the result of the second
       * @since 1.6.0
       */
  def applySecond[B](fb: ReaderTaskEither[E, L, B]): ReaderTaskEither[E, L, B] = js.native
  /**
       * @since 1.6.0
       */
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): ReaderTaskEither[E, V, B] = js.native
  /**
       * @since 1.6.0
       */
  def chain[B](f: js.Function1[/* a */ A, ReaderTaskEither[E, L, B]]): ReaderTaskEither[E, L, B] = js.native
  /**
       * @since 1.6.0
       */
  def fold[R](left: js.Function1[/* l */ L, R], right: js.Function1[/* a */ A, R]): fpDashTsLib.libReaderMod.Reader[E, fpDashTsLib.libTaskMod.Task[R]] = js.native
  /**
       * @since 1.6.1
       */
  def local[E2](f: js.Function1[/* e */ E2, E]): ReaderTaskEither[E2, L, A] = js.native
  /**
       * @since 1.6.0
       */
  def map[B](f: js.Function1[/* a */ A, B]): ReaderTaskEither[E, L, B] = js.native
  /**
       * @since 1.6.0
       */
  def mapLeft[M](f: js.Function1[/* l */ L, M]): ReaderTaskEither[E, M, A] = js.native
  /**
       * Transforms the failure value of the `ReaderTaskEither` into a new `ReaderTaskEither`
       * @since 1.6.0
       */
  def orElse[M](f: js.Function1[/* l */ L, ReaderTaskEither[E, M, A]]): ReaderTaskEither[E, M, A] = js.native
  /** Runs the inner `TaskEither` */
  def run(e: E): stdLib.Promise[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  def value(e: E): fpDashTsLib.libTaskEitherMod.TaskEither[L, A] = js.native
}

