package typings.fridaGum.global.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.perform")
@js.native
object perform extends js.Object {
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * Will defer calling `fn` if the app's class loader is not available yet.
    * Use `Java.performNow()` if access to the app's classes is not needed.
    *
    * @param fn Function to run while attached to the VM.
    */
  def apply(fn: js.Function0[Unit]): Unit = js.native
}

