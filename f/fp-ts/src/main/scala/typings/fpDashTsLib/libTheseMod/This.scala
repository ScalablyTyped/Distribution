package typings
package fpDashTsLib.libTheseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/These", "This")
@js.native
class This[L, A] protected () extends js.Object {
  def this(value: L) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.This = js.native
  val value: L = js.native
  def bimap[M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): These[M, B] = js.native
  /** Applies a function to each case in the data structure */
  def fold[B](
    `this_`: js.Function1[/* l */ L, B],
    that: js.Function1[/* a */ A, B],
    both: js.Function2[/* l */ L, /* a */ A, B]
  ): B = js.native
  def inspect(): java.lang.String = js.native
  /** Returns `true` if the these is `Both`, `false` otherwise */
  def isBoth(): /* is fp-ts.fp-ts/lib/These.Both<L, A> */ scala.Boolean = js.native
  /** Returns `true` if the these is `That`, `false` otherwise */
  def isThat(): /* is fp-ts.fp-ts/lib/These.That<L, A> */ scala.Boolean = js.native
  /** Returns `true` if the these is `This`, `false` otherwise */
  def isThis(): /* is fp-ts.fp-ts/lib/These.This<L, A> */ scala.Boolean = js.native
  def map[B](f: js.Function1[/* a */ A, B]): These[L, B] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

