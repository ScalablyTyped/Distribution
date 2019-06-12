package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryAccessDetails extends js.Object {
  /**
    * Address being accessed.
    */
  var address: NativePointer
  /**
    * Address of instruction performing the access.
    */
  var from: NativePointer
  /**
    * The kind of operation that triggered the access.
    */
  var operation: MemoryOperation
  /**
    * Index of the accessed memory page inside the specified range.
    */
  var pageIndex: scala.Double
  /**
    * Overall number of pages which have been accessed so far, and are thus
    * no longer being monitored.
    */
  var pagesCompleted: scala.Double
  /**
    * Overall number of pages that were initially monitored.
    */
  var pagesTotal: scala.Double
  /**
    * Index of the accessed range in the ranges provided to
    * `MemoryAccessMonitor.enable()`.
    */
  var rangeIndex: scala.Double
}

object MemoryAccessDetails {
  @scala.inline
  def apply(
    address: NativePointer,
    from: NativePointer,
    operation: MemoryOperation,
    pageIndex: scala.Double,
    pagesCompleted: scala.Double,
    pagesTotal: scala.Double,
    rangeIndex: scala.Double
  ): MemoryAccessDetails = {
    val __obj = js.Dynamic.literal(address = address, from = from, operation = operation, pageIndex = pageIndex, pagesCompleted = pagesCompleted, pagesTotal = pagesTotal, rangeIndex = rangeIndex)
  
    __obj.asInstanceOf[MemoryAccessDetails]
  }
}

