package typings
package fpDashTsLib.es6PairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Pair", "Pair")
@js.native
class Pair[A] protected () extends js.Object {
  def this(fst: A, snd: A) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val fst: A = js.native
  val snd: A = js.native
  def ap[B](fab: Pair[js.Function1[/* a */ A, B]]): Pair[B] = js.native
  /**
    * Flipped version of `ap`
    */
  def ap_[B, C](`this`: Pair[js.Function1[/* b */ B, C]], fb: Pair[B]): Pair[C] = js.native
  def extend[B](f: js.Function1[/* fb */ Pair[A], B]): Pair[B] = js.native
  def extract(): A = js.native
  /** Map a function over the first field of a pair */
  def first(f: fpDashTsLib.es6FunctionMod.Endomorphism[A]): Pair[A] = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Pair[B] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /** Map a function over the second field of a pair */
  def second(f: fpDashTsLib.es6FunctionMod.Endomorphism[A]): Pair[A] = js.native
  /** Swaps the elements in a pair */
  def swap(): Pair[A] = js.native
}

