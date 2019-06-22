package typings
package fpDashTsLib.libTracedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Traced", "Traced")
@js.native
class Traced[P, A] protected () extends js.Object {
  def this(run: js.Function1[/* p */ P, A]) = this()
  val _A: A = js.native
  val _L: P = js.native
  val _URI: URI = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): Traced[P, B] = js.native
  def run(p: P): A = js.native
}

