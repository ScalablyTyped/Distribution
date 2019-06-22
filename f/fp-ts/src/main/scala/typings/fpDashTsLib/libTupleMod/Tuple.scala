package typings
package fpDashTsLib.libTupleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Tuple", "Tuple")
@js.native
class Tuple[L, A] protected () extends js.Object {
  def this(fst: L, snd: A) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val fst: L = js.native
  val snd: A = js.native
  /** @obsolete */
  def bimap[M, B](f: js.Function1[/* l */ L, M], g: js.Function1[/* a */ A, B]): Tuple[M, B] = js.native
  /** @obsolete */
  def compose[B](ab: Tuple[A, B]): Tuple[L, B] = js.native
  /** @obsolete */
  def extend[B](f: js.Function1[/* fa */ Tuple[L, A], B]): Tuple[L, B] = js.native
  /** @obsolete */
  def extract(): A = js.native
  def inspect(): java.lang.String = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): Tuple[L, B] = js.native
  /** @obsolete */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /**
    * Exchange the first and second components of a tuple
    * @obsolete
    */
  def swap(): Tuple[A, L] = js.native
  /** @obsolete */
  def toTuple(): js.Tuple2[L, A] = js.native
}

