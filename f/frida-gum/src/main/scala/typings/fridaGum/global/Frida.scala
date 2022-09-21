package typings.fridaGum.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Frida {
  
  /**
    * The current size – in bytes – of Frida’s private heap, which is shared by all scripts and Frida’s own runtime.
    * This is useful for keeping an eye on how much memory your instrumentation is using out of the total consumed by
    * the hosting process.
    */
  @JSGlobal("Frida.heapSize")
  @js.native
  val heapSize: Double = js.native
  
  /**
    * The current Frida version.
    */
  @JSGlobal("Frida.version")
  @js.native
  val version: String = js.native
}
