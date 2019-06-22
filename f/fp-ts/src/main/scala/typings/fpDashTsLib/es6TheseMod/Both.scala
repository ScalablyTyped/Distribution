package typings
package fpDashTsLib.es6TheseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/These", "Both")
@js.native
class Both[L, A] protected () extends These[L, A] {
  def this(l: L, a: A) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Both = js.native
  val a: A = js.native
  val l: L = js.native
  def bimap[M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): These[M, B] = js.native
  def fold[B](
    onLeft: js.Function1[/* l */ L, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* l */ L, /* a */ A, B]
  ): B = js.native
  def inspect(): java.lang.String = js.native
  def isBoth(): /* is fp-ts.fp-ts/es6/These.Both<L, A> */ scala.Boolean = js.native
  def isThat(): /* is fp-ts.fp-ts/es6/These.That<L, A> */ scala.Boolean = js.native
  def isThis(): /* is fp-ts.fp-ts/es6/These.This<L, A> */ scala.Boolean = js.native
  def map[B](f: js.Function1[/* a */ A, B]): These[L, B] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

