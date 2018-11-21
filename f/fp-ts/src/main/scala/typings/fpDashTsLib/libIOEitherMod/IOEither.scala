package typings
package fpDashTsLib.libIOEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IOEither", "IOEither")
@js.native
class IOEither[L, A] protected () extends js.Object {
  def this(value: fpDashTsLib.libIOMod.IO[fpDashTsLib.libEitherMod.Either[L, A]]) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val value: fpDashTsLib.libIOMod.IO[fpDashTsLib.libEitherMod.Either[L, A]] = js.native
  /**
       * @since 1.6.0
       */
  def alt(fy: IOEither[L, A]): IOEither[L, A] = js.native
  /**
       * @since 1.6.0
       */
  def ap[B](fab: IOEither[L, js.Function1[/* a */ A, B]]): IOEither[L, B] = js.native
  /**
       * @since 1.6.0
       */
  def `ap_`[B, C](`this`: IOEither[L, js.Function1[/* b */ B, C]], fb: IOEither[L, B]): IOEither[L, C] = js.native
  /**
       * Combine two effectful actions, keeping only the result of the first
       * @since 1.6.0
       */
  def applyFirst[B](fb: IOEither[L, B]): IOEither[L, A] = js.native
  /**
       * Combine two effectful actions, keeping only the result of the second
       * @since 1.6.0
       */
  def applySecond[B](fb: IOEither[L, B]): IOEither[L, B] = js.native
  /**
       * @since 1.6.0
       */
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): IOEither[V, B] = js.native
  /**
       * @since 1.6.0
       */
  def chain[B](f: js.Function1[/* a */ A, IOEither[L, B]]): IOEither[L, B] = js.native
  /**
       * @since 1.6.0
       */
  def fold[R](left: js.Function1[/* l */ L, R], right: js.Function1[/* a */ A, R]): fpDashTsLib.libIOMod.IO[R] = js.native
  /**
       * @since 1.6.0
       */
  def map[B](f: js.Function1[/* a */ A, B]): IOEither[L, B] = js.native
  /**
       * @since 1.6.0
       */
  def mapLeft[M](f: js.Function1[/* l */ L, M]): IOEither[M, A] = js.native
  /**
       * @since 1.6.0
       */
  def orElse[M](f: js.Function1[/* l */ L, IOEither[M, A]]): IOEither[M, A] = js.native
  /**
       * Runs the inner io
       * @since 1.6.0
       */
  def run(): fpDashTsLib.libEitherMod.Either[L, A] = js.native
}

