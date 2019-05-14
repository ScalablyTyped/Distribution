package typings
package fpDashTsLib.es6IORefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/IORef", "IORef")
@js.native
class IORef[A] protected () extends js.Object {
  def this(value: A) = this()
  var read: fpDashTsLib.es6IOMod.IO[A] = js.native
  var value: js.Any = js.native
  /**
    * @since 1.8.0
    */
  def modify(f: js.Function1[/* a */ A, A]): fpDashTsLib.es6IOMod.IO[scala.Unit] = js.native
  /**
    * @since 1.8.0
    */
  def write(a: A): fpDashTsLib.es6IOMod.IO[scala.Unit] = js.native
}

