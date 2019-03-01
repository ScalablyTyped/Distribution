package typings
package fpDashTsLib.libValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Validation", "Success")
@js.native
class Success[L, A] protected () extends Validation[L, A] {
  def this(value: A) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Success = js.native
  val value: A = js.native
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): Validation[V, B] = js.native
  def fold[B](failure: js.Function1[/* l */ L, B], success: js.Function1[/* a */ A, B]): B = js.native
  def getOrElse(a: A): A = js.native
  def getOrElseL(f: js.Function1[/* l */ L, A]): A = js.native
  def inspect(): java.lang.String = js.native
  def isFailure(): /* is fp-ts.fp-ts/lib/Validation.Failure<L, A> */ scala.Boolean = js.native
  def isSuccess(): /* is fp-ts.fp-ts/lib/Validation.Success<L, A> */ scala.Boolean = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Validation[L, B] = js.native
  def mapFailure[M](f: js.Function1[/* l */ L, M]): Validation[M, A] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  def swap(): Validation[A, L] = js.native
}

