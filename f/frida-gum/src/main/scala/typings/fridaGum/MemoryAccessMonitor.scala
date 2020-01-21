package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Monitors one or more memory ranges for access, and notifies on the first
  * access of each contained memory page.
  *
  * Only available on Windows for now. We would love to support this on the other
  * platforms too, so if you find this useful and would like to help out, please
  * get in touch.
  */
@JSGlobal("MemoryAccessMonitor")
@js.native
object MemoryAccessMonitor extends js.Object {
  /**
    * Stops monitoring the remaining memory ranges passed to
    * `MemoryAccessMonitor.enable()`.
    */
  def disable(): Unit = js.native
  def enable(ranges: js.Array[MemoryAccessRange], callbacks: MemoryAccessCallbacks): Unit = js.native
  /**
    * Starts monitoring one or more memory ranges for access, and notifies on
    * the first access of each contained memory page.
    *
    * @param ranges One or more ranges to monitor.
    * @param callbacks Callbacks to be notified on access.
    */
  def enable(ranges: MemoryAccessRange, callbacks: MemoryAccessCallbacks): Unit = js.native
}

