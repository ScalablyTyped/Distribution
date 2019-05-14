package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "ioRef")
@js.native
object ioRefNs extends js.Object {
  @js.native
  class IORef[A] protected ()
    extends fpDashTsLib.es6IORefMod.IORef[A] {
    def this(value: A) = this()
  }
  
  def newIORef[A](a: A): fpDashTsLib.es6IOMod.IO[fpDashTsLib.es6IORefMod.IORef[A]] = js.native
}

