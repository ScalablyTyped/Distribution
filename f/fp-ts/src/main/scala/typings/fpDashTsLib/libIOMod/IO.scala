package typings
package fpDashTsLib.libIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IO", "IO")
@js.native
class IO[A] protected () extends js.Object {
  def this(run: fpDashTsLib.libFunctionMod.Lazy[A]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  /** @obsolete */
  def ap[B](fab: IO[js.Function1[/* a */ A, B]]): IO[B] = js.native
  /**
    * Flipped version of `ap`
    * @obsolete
    */
  def ap_[B, C](`this`: IO[js.Function1[/* b */ B, C]], fb: IO[B]): IO[C] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the first
    * @since 1.6.0
    * @obsolete
    */
  def applyFirst[B](fb: IO[B]): IO[A] = js.native
  /**
    * Combine two effectful actions, keeping only the result of the second
    * @since 1.5.0
    * @obsolete
    */
  def applySecond[B](fb: IO[B]): IO[B] = js.native
  /** @obsolete */
  def chain[B](f: js.Function1[/* a */ A, IO[B]]): IO[B] = js.native
  def inspect(): java.lang.String = js.native
  /** @obsolete */
  def map[B](f: js.Function1[/* a */ A, B]): IO[B] = js.native
  def run(): A = js.native
}

