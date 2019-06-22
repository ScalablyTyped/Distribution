package typings
package fpDashTsLib.es6IOEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/IOEither", "IOEither")
@js.native
class IOEither[L, A] protected () extends js.Object {
  def this(value: fpDashTsLib.es6IOMod.IO[fpDashTsLib.es6EitherMod.Either[L, A]]) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val value: fpDashTsLib.es6IOMod.IO[fpDashTsLib.es6EitherMod.Either[L, A]] = js.native
  /** @obsolete */
  def alt(fy: IOEither[L, A]): IOEither[L, A] = js.native
  /** @obsolete */
  def ap[B](fab: IOEither[L, js.Function1[/* a */ A, B]]): IOEither[L, B] = js.native
  /**
    * Flipped version of `ap`
    * @obsolete
    */
  def ap_[B, C](`this`: IOEither[L, js.Function1[/* b */ B, C]], fb: IOEither[L, B]): IOEither[L, C] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the first
    * @obsolete
    */
  def applyFirst[B](fb: IOEither[L, B]): IOEither[L, A] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the second
    * @obsolete
    */
  def applySecond[B](fb: IOEither[L, B]): IOEither[L, B] = js.native
  /** @obsolete */
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): IOEither[V, B] = js.native
  /** @obsolete */
  def chain[B](f: js.Function1[/* a */ A, IOEither[L, B]]): IOEither[L, B] = js.native
  /** @obsolete */
  def fold[R](left: js.Function1[/* l */ L, R], right: js.Function1[/* a */ A, R]): fpDashTsLib.es6IOMod.IO[R] = js.native
  /**
    * Similar to `fold`, but the result is flattened.
    *
    * @since 1.19.0
    * @obsolete
    */
  def foldIO[R](
    left: js.Function1[/* l */ L, fpDashTsLib.es6IOMod.IO[R]],
    right: js.Function1[/* a */ A, fpDashTsLib.es6IOMod.IO[R]]
  ): fpDashTsLib.es6IOMod.IO[R] = js.native
  /**
    * Similar to `fold`, but the result is flattened.
    *
    * @since 1.19.0
    * @obsolete
    */
  def foldIOEither[M, B](onLeft: js.Function1[/* l */ L, IOEither[M, B]], onRight: js.Function1[/* a */ A, IOEither[M, B]]): IOEither[M, B] = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): IOEither[L, B] = js.native
  /** @obsolete */
  def mapLeft[M](f: js.Function1[/* l */ L, M]): IOEither[M, A] = js.native
  /** @obsolete */
  def orElse[M](f: js.Function1[/* l */ L, IOEither[M, A]]): IOEither[M, A] = js.native
  /**
    * Runs the inner io
    */
  def run(): fpDashTsLib.es6EitherMod.Either[L, A] = js.native
}

