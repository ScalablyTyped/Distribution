package typings
package fpDashTsLib.libOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Option", "Some")
@js.native
class Some[A] protected () extends Option[A] {
  def this(value: A) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Some = js.native
  val value: A = js.native
  def alt(fa: Option[A]): Option[A] = js.native
  def ap[B](fab: Option[js.Function1[/* a */ A, B]]): Option[B] = js.native
  def ap_[B, C](`this`: Option[js.Function1[/* b */ B, C]], fb: Option[B]): Option[C] = js.native
  def chain[B](f: js.Function1[/* a */ A, Option[B]]): Option[B] = js.native
  def contains(E: fpDashTsLib.libEqMod.Eq[A], a: A): scala.Boolean = js.native
  def exists(p: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean = js.native
  def extend[B](f: js.Function1[/* ea */ Option[A], B]): Option[B] = js.native
  def filter(p: fpDashTsLib.libFunctionMod.Predicate[A]): Option[A] = js.native
  @JSName("filter")
  def filter_BA[B /* <: A */](p: fpDashTsLib.libFunctionMod.Refinement[A, B]): Option[B] = js.native
  def fold[B](b: B, onSome: js.Function1[/* a */ A, B]): B = js.native
  def foldL[B](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, B]): B = js.native
  def getOrElse(a: A): A = js.native
  def getOrElseL(f: js.Function0[A]): A = js.native
  def inspect(): java.lang.String = js.native
  def isNone(): /* is fp-ts.fp-ts/lib/Option.None<A> */ scala.Boolean = js.native
  def isSome(): /* is fp-ts.fp-ts/lib/Option.Some<A> */ scala.Boolean = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Option[B] = js.native
  def mapNullable[B](f: js.Function1[/* a */ A, js.UndefOr[B | scala.Null]]): Option[B] = js.native
  def orElse(fa: fpDashTsLib.libFunctionMod.Lazy[Option[A]]): Option[A] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  def refine[B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): Option[B] = js.native
  def toNullable(): A | scala.Null = js.native
  def toUndefined(): js.UndefOr[A] = js.native
}

