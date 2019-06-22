package typings
package fpDashTsLib.es6WriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Writer", "Writer")
@js.native
class Writer[W, A] protected () extends js.Object {
  def this(run: js.Function0[js.Tuple2[A, W]]) = this()
  val _A: A = js.native
  val _L: W = js.native
  val _URI: URI = js.native
  /** @obsolete */
  def eval(): A = js.native
  /** @obsolete */
  def exec(): W = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): Writer[W, B] = js.native
  def run(): js.Tuple2[A, W] = js.native
}

