package typings
package fpDashTsLib.libFreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Free", "Impure")
@js.native
class Impure[F, A, X] protected () extends js.Object {
  def this(fx: fpDashTsLib.libHKTMod.HKT[F, X], f: js.Function1[/* x */ X, Free[F, A]]) = this()
  val _A: A = js.native
  val _L: F = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Impure = js.native
  val fx: fpDashTsLib.libHKTMod.HKT[F, X] = js.native
  def ap[B](fab: Free[F, js.Function1[/* a */ A, B]]): Free[F, B] = js.native
  def ap_[B, C](`this`: Free[F, js.Function1[/* b */ B, C]], fb: Free[F, B]): Free[F, C] = js.native
  def chain[B](f: js.Function1[/* a */ A, Free[F, B]]): Free[F, B] = js.native
  def f(x: X): Free[F, A] = js.native
  def inspect(): java.lang.String = js.native
  def isImpure(): /* is fp-ts.fp-ts/lib/Free.Impure<F, A, X> */ scala.Boolean = js.native
  def isPure(): /* is fp-ts.fp-ts/lib/Free.Pure<F, A> */ scala.Boolean = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Free[F, B] = js.native
}

