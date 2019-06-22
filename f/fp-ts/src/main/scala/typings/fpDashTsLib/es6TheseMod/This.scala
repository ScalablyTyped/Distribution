package typings
package fpDashTsLib.es6TheseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/These", "This")
@js.native
class This[L, A] protected () extends These[L, A] {
  def this(value: L) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.This = js.native
  val value: L = js.native
  /** @obsolete */
  def bimap[M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): These[M, B] = js.native
  /**
    * Applies a function to each case in the data structure
    * @obsolete
    */
  def fold[B](
    onLeft: js.Function1[/* l */ L, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* l */ L, /* a */ A, B]
  ): B = js.native
  def inspect(): java.lang.String = js.native
  /**
    * Returns `true` if the these is `Both`, `false` otherwise
    * @obsolete
    */
  def isBoth(): /* is fp-ts.fp-ts/es6/These.Both<L, A> */ scala.Boolean = js.native
  /**
    * Returns `true` if the these is `That`, `false` otherwise
    * @obsolete
    */
  def isThat(): /* is fp-ts.fp-ts/es6/These.That<L, A> */ scala.Boolean = js.native
  /**
    * Returns `true` if the these is `This`, `false` otherwise
    * @obsolete
    */
  def isThis(): /* is fp-ts.fp-ts/es6/These.This<L, A> */ scala.Boolean = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): These[L, B] = js.native
  /** @obsolete */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
}

