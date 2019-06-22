package typings
package fpDashTsLib.libConstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Const", "Const")
@js.native
class Const[L, A] protected () extends js.Object {
  /**
    * Use `make`
    *
    * @deprecated
    */
  def this(value: L) = this()
  val _A: A = js.native
  val _L: L = js.native
  val _URI: URI = js.native
  val value: L = js.native
  /** @obsolete */
  def contramap[B](f: js.Function1[/* b */ B, A]): Const[L, B] = js.native
  /** @obsolete */
  def fold[B](f: js.Function1[/* l */ L, B]): B = js.native
  def inspect(): java.lang.String = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): Const[L, B] = js.native
}

