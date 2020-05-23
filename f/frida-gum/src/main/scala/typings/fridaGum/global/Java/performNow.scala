package typings.fridaGum.global.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.performNow")
@js.native
object performNow extends js.Object {
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  def apply(fn: js.Function0[Unit]): Unit = js.native
}

