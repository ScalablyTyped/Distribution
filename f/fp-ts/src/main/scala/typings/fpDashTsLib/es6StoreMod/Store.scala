package typings
package fpDashTsLib.es6StoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Store", "Store")
@js.native
class Store[S, A] protected () extends js.Object {
  def this(peek: js.Function1[/* s */ S, A], pos: S) = this()
  val _A: A = js.native
  val _L: S = js.native
  val _URI: URI = js.native
  val pos: S = js.native
  /** @obsolete */
  def extend[B](f: js.Function1[/* sa */ Store[S, A], B]): Store[S, B] = js.native
  /** @obsolete */
  def extract(): A = js.native
  def inspect(): java.lang.String = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): Store[S, B] = js.native
  def peek(s: S): A = js.native
  /**
    * Reposition the focus at the specified position
    * @obsolete
    */
  def seek(s: S): Store[S, A] = js.native
}

