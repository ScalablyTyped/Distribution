package typings
package fpDashTsLib.es6ValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Validation", "Failure")
@js.native
class Failure[L, A] protected () extends Validation[L, A] {
  def this(value: L) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Failure = js.native
  val value: L = js.native
  /** @obsolete */
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): Validation[V, B] = js.native
  /** @obsolete */
  def fold[B](failure: js.Function1[/* l */ L, B], success: js.Function1[/* a */ A, B]): B = js.native
  /**
    * Returns the value from this `Success` or the given argument if this is a `Failure`
    * @obsolete
    */
  def getOrElse(a: A): A = js.native
  /**
    * Returns the value from this `Success` or the result of given argument if this is a `Failure`
    * @obsolete
    */
  def getOrElseL(f: js.Function1[/* l */ L, A]): A = js.native
  def inspect(): java.lang.String = js.native
  /**
    * Returns `true` if the validation is an instance of `Failure`, `false` otherwise
    * @obsolete
    */
  def isFailure(): /* is fp-ts.fp-ts/es6/Validation.Failure<L, A> */ scala.Boolean = js.native
  /**
    * Returns `true` if the validation is an instance of `Success`, `false` otherwise
    * @obsolete
    */
  def isSuccess(): /* is fp-ts.fp-ts/es6/Validation.Success<L, A> */ scala.Boolean = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): Validation[L, B] = js.native
  /** @obsolete */
  def mapFailure[M](f: js.Function1[/* l */ L, M]): Validation[M, A] = js.native
  /** @obsolete */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /** @obsolete */
  def swap(): Validation[A, L] = js.native
}

