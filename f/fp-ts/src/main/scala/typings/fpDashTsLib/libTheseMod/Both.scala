package typings
package fpDashTsLib.libTheseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/These", "Both")
@js.native
class Both[L, A] protected () extends js.Object {
  def this(l: L, a: A) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.Both = js.native
  val a: A = js.native
  val l: L = js.native
  def bimap[M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): These[M, B] = js.native
  def fold[B](
    `this_`: js.Function1[/* l */ L, B],
    that: js.Function1[/* a */ A, B],
    both: js.Function2[/* l */ L, /* a */ A, B]
  ): B = js.native
  def inspect(): java.lang.String = js.native
  def isBoth(): /* is Both */scala.Boolean = js.native
  def isThat(): /* is That */scala.Boolean = js.native
  def isThis(): /* is This */scala.Boolean = js.native
  def map[B](f: js.Function1[/* a */ A, B]): These[L, B] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

