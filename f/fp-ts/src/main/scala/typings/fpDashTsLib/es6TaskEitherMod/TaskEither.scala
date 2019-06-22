package typings
package fpDashTsLib.es6TaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/TaskEither", "TaskEither")
@js.native
class TaskEither[L, A] protected () extends js.Object {
  def this(value: fpDashTsLib.es6TaskMod.Task[fpDashTsLib.es6EitherMod.Either[L, A]]) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val value: fpDashTsLib.es6TaskMod.Task[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  /**
    * @since 1.6.0
    * @obsolete
    */
  def alt(fy: TaskEither[L, A]): TaskEither[L, A] = js.native
  /** @obsolete */
  def ap[B](fab: TaskEither[L, js.Function1[/* a */ A, B]]): TaskEither[L, B] = js.native
  /**
    * Flipped version of `ap`
    * @obsolete
    */
  def ap_[B, C](`this`: TaskEither[L, js.Function1[/* b */ B, C]], fb: TaskEither[L, B]): TaskEither[L, C] = js.native
  /**
    * Combine two (parallel) effectful actions, keeping only the result of the first
    * @since 1.6.0
    * @obsolete
    */
  def applyFirst[B](fb: TaskEither[L, B]): TaskEither[L, A] = js.native
  /**
    * Combine two (parallel) effectful actions, keeping only the result of the second
    * @since 1.5.0
    * @obsolete
    */
  def applySecond[B](fb: TaskEither[L, B]): TaskEither[L, B] = js.native
  /**
    * Return `Right` if the given action succeeds, `Left` if it throws
    * @since 1.10.0
    * @obsolete
    */
  def attempt[M](): TaskEither[M, fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  /**
    * @since 1.2.0
    * @obsolete
    */
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): TaskEither[V, B] = js.native
  /** @obsolete */
  def chain[B](f: js.Function1[/* a */ A, TaskEither[L, B]]): TaskEither[L, B] = js.native
  /**
    * Combine two (sequential) effectful actions, keeping only the result of the first
    * @since 1.12.0
    * @obsolete
    */
  def chainFirst[B](fb: TaskEither[L, B]): TaskEither[L, A] = js.native
  /**
    * Combine two (sequential) effectful actions, keeping only the result of the second
    * @since 1.12.0
    * @obsolete
    */
  def chainSecond[B](fb: TaskEither[L, B]): TaskEither[L, B] = js.native
  def filterOrElse(p: fpDashTsLib.es6FunctionMod.Predicate[A], zero: L): TaskEither[L, A] = js.native
  def filterOrElseL(p: fpDashTsLib.es6FunctionMod.Predicate[A], zero: js.Function1[/* a */ A, L]): TaskEither[L, A] = js.native
  /**
    * @since 1.11.0
    * @obsolete
    */
  @JSName("filterOrElseL")
  def filterOrElseL_BA[B /* <: A */](p: fpDashTsLib.es6FunctionMod.Refinement[A, B], zero: js.Function1[/* a */ A, L]): TaskEither[L, B] = js.native
  /**
    * @since 1.11.0
    * @obsolete
    */
  @JSName("filterOrElse")
  def filterOrElse_BA[B /* <: A */](p: fpDashTsLib.es6FunctionMod.Refinement[A, B], zero: L): TaskEither[L, B] = js.native
  /** @obsolete */
  def fold[R](onLeft: js.Function1[/* l */ L, R], onRight: js.Function1[/* a */ A, R]): fpDashTsLib.es6TaskMod.Task[R] = js.native
  /**
    * Similar to `fold`, but the result is flattened.
    * @since 1.10.0
    * @obsolete
    */
  def foldTask[R](
    onLeft: js.Function1[/* l */ L, fpDashTsLib.es6TaskMod.Task[R]],
    onRight: js.Function1[/* a */ A, fpDashTsLib.es6TaskMod.Task[R]]
  ): fpDashTsLib.es6TaskMod.Task[R] = js.native
  /**
    * Similar to `fold`, but the result is flattened.
    * @since 1.10.0
    * @obsolete
    */
  def foldTaskEither[M, B](
    onLeft: js.Function1[/* l */ L, TaskEither[M, B]],
    onRight: js.Function1[/* a */ A, TaskEither[M, B]]
  ): TaskEither[M, B] = js.native
  /**
    * Similar to `fold`, return the value from Right or the given argument if Left.
    * @since 1.17.0
    * @obsolete
    */
  def getOrElse(a: A): fpDashTsLib.es6TaskMod.Task[A] = js.native
  /**
    * @since 1.17.0
    * @obsolete
    */
  def getOrElseL(f: js.Function1[/* l */ L, A]): fpDashTsLib.es6TaskMod.Task[A] = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): TaskEither[L, B] = js.native
  /** @obsolete */
  def mapLeft[M](f: js.Function1[/* l */ L, M]): TaskEither[M, A] = js.native
  /**
    * Transforms the failure value of the `TaskEither` into a new `TaskEither`
    * @obsolete
    */
  def orElse[M](f: js.Function1[/* l */ L, TaskEither[M, A]]): TaskEither[M, A] = js.native
  /** Runs the inner `Task` */
  def run(): js.Promise[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
}

