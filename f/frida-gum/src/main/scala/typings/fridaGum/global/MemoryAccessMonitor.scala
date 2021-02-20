package typings.fridaGum.global

import typings.fridaGum.MemoryAccessCallbacks
import typings.fridaGum.MemoryAccessRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitors one or more memory ranges for access, and notifies on the first
  * access of each contained memory page.
  *
  * Only available on Windows for now. We would love to support this on the other
  * platforms too, so if you find this useful and would like to help out, please
  * get in touch.
  */
object MemoryAccessMonitor {
  
  /**
    * Stops monitoring the remaining memory ranges passed to
    * `MemoryAccessMonitor.enable()`.
    */
  @JSGlobal("MemoryAccessMonitor.disable")
  @js.native
  def disable(): Unit = js.native
  
  @JSGlobal("MemoryAccessMonitor.enable")
  @js.native
  def enable(ranges: js.Array[MemoryAccessRange], callbacks: MemoryAccessCallbacks): Unit = js.native
  /**
    * Starts monitoring one or more memory ranges for access, and notifies on
    * the first access of each contained memory page.
    *
    * @param ranges One or more ranges to monitor.
    * @param callbacks Callbacks to be notified on access.
    */
  @JSGlobal("MemoryAccessMonitor.enable")
  @js.native
  def enable(ranges: MemoryAccessRange, callbacks: MemoryAccessCallbacks): Unit = js.native
}
