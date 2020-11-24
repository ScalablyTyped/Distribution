package typings.fridaGum.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Frida")
@js.native
object Frida extends js.Object {
  
  /**
    * The current size – in bytes – of Frida’s private heap, which is shared by all scripts and Frida’s own runtime.
    * This is useful for keeping an eye on how much memory your instrumentation is using out of the total consumed by
    * the hosting process.
    */
  val heapSize: Double = js.native
  
  /**
    * Source map for the GumJS runtime.
    */
  val sourceMap: typings.fridaGum.SourceMap = js.native
  
  /**
    * The current Frida version.
    */
  val version: String = js.native
}
