package typings
package fpDashTsLib.libTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/TaskEither", "TaskEither")
@js.native
class TaskEither[L, A] protected () extends js.Object {
  def this(value: fpDashTsLib.libTaskMod.Task[fpDashTsLib.libEitherMod.Either[L, A]]) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val value: fpDashTsLib.libTaskMod.Task[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  /**
       * @since 1.6.0
       */
  def alt(fy: TaskEither[L, A]): TaskEither[L, A] = js.native
  def ap[B](fab: TaskEither[L, js.Function1[/* a */ A, B]]): TaskEither[L, B] = js.native
  def `ap_`[B, C](`this`: TaskEither[L, js.Function1[/* b */ B, C]], fb: TaskEither[L, B]): TaskEither[L, C] = js.native
  /**
       * Combine two effectful actions, keeping only the result of the first
       * @since 1.6.0
       */
  def applyFirst[B](fb: TaskEither[L, B]): TaskEither[L, A] = js.native
  /**
       * Combine two effectful actions, keeping only the result of the second
       * @since 1.5.0
       */
  def applySecond[B](fb: TaskEither[L, B]): TaskEither[L, B] = js.native
  /**
       * @since 1.2.0
       */
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): TaskEither[V, B] = js.native
  def chain[B](f: js.Function1[/* a */ A, TaskEither[L, B]]): TaskEither[L, B] = js.native
  def fold[R](whenLeft: js.Function1[/* l */ L, R], whenRight: js.Function1[/* a */ A, R]): fpDashTsLib.libTaskMod.Task[R] = js.native
  def map[B](f: js.Function1[/* a */ A, B]): TaskEither[L, B] = js.native
  def mapLeft[M](f: js.Function1[/* l */ L, M]): TaskEither[M, A] = js.native
  /**
       * Transforms the failure value of the `TaskEither` into a new `TaskEither`
       */
  def orElse[M](f: js.Function1[/* l */ L, TaskEither[M, A]]): TaskEither[M, A] = js.native
  /** Runs the inner `Task` */
  def run(): stdLib.Promise[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
}

