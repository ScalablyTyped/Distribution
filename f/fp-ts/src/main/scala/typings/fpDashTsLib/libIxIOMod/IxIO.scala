package typings
package fpDashTsLib.libIxIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IxIO", "IxIO")
@js.native
class IxIO[I, O, A] protected () extends js.Object {
  def this(value: fpDashTsLib.libIOMod.IO[A]) = this()
  val _A: A = js.native
  val _L: O = js.native
  val _U: I = js.native
  val _URI: URI = js.native
  val value: fpDashTsLib.libIOMod.IO[A] = js.native
  def ap[B](fab: IxIO[I, I, js.Function1[/* a */ A, B]]): IxIO[I, I, B] = js.native
  def chain[B](f: js.Function1[/* a */ A, IxIO[I, I, B]]): IxIO[I, I, B] = js.native
  def ichain[Z, B](f: js.Function1[/* a */ A, IxIO[O, Z, B]]): IxIO[I, Z, B] = js.native
  def map[B](f: js.Function1[/* a */ A, B]): IxIO[I, O, B] = js.native
  def run(): A = js.native
}

