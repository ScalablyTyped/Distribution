package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Frida")
@js.native
object FridaNs extends js.Object {
  /**
    * The current size – in bytes – of Frida’s private heap, which is shared by all scripts and Frida’s own runtime.
    * This is useful for keeping an eye on how much memory your instrumentation is using out of the total consumed by
    * the hosting process.
    */
  val heapSize: scala.Double = js.native
  /**
    * Source map for the GumJS runtime.
    */
  val sourceMap: fridaDashGumLib.SourceMap = js.native
  /**
    * The current Frida version.
    */
  val version: java.lang.String = js.native
}

