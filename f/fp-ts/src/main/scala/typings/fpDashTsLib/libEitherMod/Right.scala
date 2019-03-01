package typings
package fpDashTsLib.libEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Either", "Right")
@js.native
class Right[L, A] protected () extends Either[L, A] {
  def this(value: A) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Right = js.native
  val value: A = js.native
  def alt(fy: Either[L, A]): Either[L, A] = js.native
  def ap[B](fab: Either[L, js.Function1[/* a */ A, B]]): Either[L, B] = js.native
  def `ap_`[B, C](`this`: Either[L, js.Function1[/* b */ B, C]], fb: Either[L, B]): Either[L, C] = js.native
  def bimap[V, B](f: js.Function1[/* l */ L, V], g: js.Function1[/* a */ A, B]): Either[V, B] = js.native
  def chain[B](f: js.Function1[/* a */ A, Either[L, B]]): Either[L, B] = js.native
  def extend[B](f: js.Function1[/* ea */ Either[L, A], B]): Either[L, B] = js.native
  def filterOrElse(p: fpDashTsLib.libFunctionMod.Predicate[A], zero: L): Either[L, A] = js.native
  def filterOrElseL(p: fpDashTsLib.libFunctionMod.Predicate[A], zero: js.Function1[/* a */ A, L]): Either[L, A] = js.native
  @JSName("filterOrElseL")
  def filterOrElseL_BA[B /* <: A */](p: fpDashTsLib.libFunctionMod.Refinement[A, B], zero: js.Function1[/* a */ A, L]): Either[L, B] = js.native
  @JSName("filterOrElse")
  def filterOrElse_BA[B /* <: A */](p: fpDashTsLib.libFunctionMod.Refinement[A, B], zero: L): Either[L, B] = js.native
  def fold[B](onLeft: js.Function1[/* l */ L, B], onRight: js.Function1[/* a */ A, B]): B = js.native
  def getOrElse(a: A): A = js.native
  def getOrElseL(f: js.Function1[/* l */ L, A]): A = js.native
  def inspect(): java.lang.String = js.native
  def isLeft(): /* is fp-ts.fp-ts/lib/Either.Left<L, A> */ scala.Boolean = js.native
  def isRight(): /* is fp-ts.fp-ts/lib/Either.Right<L, A> */ scala.Boolean = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Either[L, B] = js.native
  def mapLeft[M](f: js.Function1[/* l */ L, M]): Either[M, A] = js.native
  def orElse[M](fy: js.Function1[/* l */ L, Either[M, A]]): Either[M, A] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  def refineOrElse[B /* <: A */](p: fpDashTsLib.libFunctionMod.Refinement[A, B], zero: L): Either[L, B] = js.native
  def refineOrElseL[B /* <: A */](p: fpDashTsLib.libFunctionMod.Refinement[A, B], zero: js.Function1[/* a */ A, L]): Either[L, B] = js.native
  def swap(): Either[A, L] = js.native
}

