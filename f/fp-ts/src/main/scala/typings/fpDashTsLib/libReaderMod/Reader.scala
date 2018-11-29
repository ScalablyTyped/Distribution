package typings
package fpDashTsLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Reader", "Reader")
@js.native
class Reader[E, A] protected () extends js.Object {
  def this(run: js.Function1[/* e */ E, A]) = this()
  val _A: A = js.native
  val _L: E = js.native
  val _URI: URI = js.native
  def ap[B](fab: Reader[E, js.Function1[/* a */ A, B]]): Reader[E, B] = js.native
  /**
       * Flipped version of {@link ap}
       */
  def `ap_`[B, C](`this`: Reader[E, js.Function1[/* b */ B, C]], fb: Reader[E, B]): Reader[E, C] = js.native
  def chain[B](f: js.Function1[/* a */ A, Reader[E, B]]): Reader[E, B] = js.native
  /**
       * @since 1.6.1
       */
  def local[E2](f: js.Function1[/* e */ E2, E]): Reader[E2, A] = js.native
  def map[B](f: js.Function1[/* a */ A, B]): Reader[E, B] = js.native
  def run(e: E): A = js.native
}

