package typings
package fpDashTsLib.es6EitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Either", "Left")
@js.native
class Left[L, A] protected () extends Either[L, A] {
  def this(value: L) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Left = js.native
  val value: L = js.native
  def alt(fy: Either[L, A]): Either[L, A] = js.native
  def ap[B](fab: Either[L, js.Function1[/* a */ A, B]]): Either[L, B] = js.native
  /**
    * Flipped version of `ap`
    */
  def ap_[B, C](`this`: Either[L, js.Function1[/* b */ B, C]], fb: Either[L, B]): Either[L, C] = js.native
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): Either[V, B] = js.native
  /** Binds the given function across `Right` */
  def chain[B](f: js.Function1[/* a */ A, Either[L, B]]): Either[L, B] = js.native
  def extend[B](f: js.Function1[/* ea */ Either[L, A], B]): Either[L, B] = js.native
  def filterOrElse(p: fpDashTsLib.es6FunctionMod.Predicate[A], zero: L): Either[L, A] = js.native
  def filterOrElseL(p: fpDashTsLib.es6FunctionMod.Predicate[A], zero: js.Function1[/* a */ A, L]): Either[L, A] = js.native
  /**
    * Lazy version of `filterOrElse`
    * @since 1.3.0
    */
  @JSName("filterOrElseL")
  def filterOrElseL_BA[B /* <: A */](p: fpDashTsLib.es6FunctionMod.Refinement[A, B], zero: js.Function1[/* a */ A, L]): Either[L, B] = js.native
  /**
    * Returns `Right` with the existing value of `Right` if this is a `Right` and the given predicate `p` holds for the
    * right value, returns `Left(zero)` if this is a `Right` and the given predicate `p` does not hold for the right
    * value, returns `Left` with the existing value of `Left` if this is a `Left`.
    *
    * @example
    * import { right, left } from 'fp-ts/lib/Either'
    *
    * assert.deepStrictEqual(right(12).filterOrElse(n => n > 10, -1), right(12))
    * assert.deepStrictEqual(right(7).filterOrElse(n => n > 10, -1), left(-1))
    * assert.deepStrictEqual(left(12).filterOrElse(n => n > 10, -1), left(12))
    *
    * @since 1.3.0
    */
  @JSName("filterOrElse")
  def filterOrElse_BA[B /* <: A */](p: fpDashTsLib.es6FunctionMod.Refinement[A, B], zero: L): Either[L, B] = js.native
  /** Applies a function to each case in the data structure */
  def fold[B](onLeft: js.Function1[/* l */ L, B], onRight: js.Function1[/* a */ A, B]): B = js.native
  /** Returns the value from this `Right` or the given argument if this is a `Left` */
  def getOrElse(a: A): A = js.native
  /** Returns the value from this `Right` or the result of given argument if this is a `Left` */
  def getOrElseL(f: js.Function1[/* l */ L, A]): A = js.native
  def inspect(): java.lang.String = js.native
  /** Returns `true` if the either is an instance of `Left`, `false` otherwise */
  def isLeft(): /* is fp-ts.fp-ts/es6/Either.Left<L, A> */ scala.Boolean = js.native
  /** Returns `true` if the either is an instance of `Right`, `false` otherwise */
  def isRight(): /* is fp-ts.fp-ts/es6/Either.Right<L, A> */ scala.Boolean = js.native
  /** The given function is applied if this is a `Right` */
  def map[B](f: js.Function1[/* a */ A, B]): Either[L, B] = js.native
  /** Maps the left side of the disjunction */
  def mapLeft[M](f: js.Function1[/* l */ L, M]): Either[M, A] = js.native
  /**
    * Lazy version of `alt`
    *
    * @example
    * import { right } from 'fp-ts/lib/Either'
    *
    * assert.deepStrictEqual(right(1).orElse(() => right(2)), right(1))
    *
    * @since 1.6.0
    */
  def orElse[M](fy: js.Function1[/* l */ L, Either[M, A]]): Either[M, A] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /**
    * Use `filterOrElse` instead
    * @since 1.6.0
    * @deprecated
    */
  def refineOrElse[B /* <: A */](p: fpDashTsLib.es6FunctionMod.Refinement[A, B], zero: L): Either[L, B] = js.native
  /**
    * Lazy version of `refineOrElse`
    * Use `filterOrElseL` instead
    * @since 1.6.0
    * @deprecated
    */
  def refineOrElseL[B /* <: A */](p: fpDashTsLib.es6FunctionMod.Refinement[A, B], zero: js.Function1[/* a */ A, L]): Either[L, B] = js.native
  /** Swaps the disjunction values */
  def swap(): Either[A, L] = js.native
}

