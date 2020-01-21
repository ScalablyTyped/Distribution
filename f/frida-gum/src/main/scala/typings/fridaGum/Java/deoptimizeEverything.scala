package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.deoptimizeEverything")
@js.native
object deoptimizeEverything extends js.Object {
  /**
    * Forces the VM to execute everything with its interpreter. Necessary to
    * prevent optimizations from bypassing method hooks in some cases, and
    * allows ART's Instrumentation APIs to be used for tracing the runtime.
    */
  def apply(): Unit = js.native
}

