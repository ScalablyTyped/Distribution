package typings
package fpDashTsLib.libWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Writer", "Writer")
@js.native
class Writer[W, A] protected () extends js.Object {
  def this(run: js.Function0[js.Tuple2[A, W]]) = this()
  val _A: A = js.native
  val _L: W = js.native
  val _URI: URI = js.native
  def eval(): A = js.native
  def exec(): W = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Writer[W, B] = js.native
  def run(): js.Tuple2[A, W] = js.native
}

