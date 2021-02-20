package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryAccessDetails extends StObject {
  
  /**
    * Address being accessed.
    */
  var address: NativePointer = js.native
  
  /**
    * Address of instruction performing the access.
    */
  var from: NativePointer = js.native
  
  /**
    * The kind of operation that triggered the access.
    */
  var operation: MemoryOperation = js.native
  
  /**
    * Index of the accessed memory page inside the specified range.
    */
  var pageIndex: Double = js.native
  
  /**
    * Overall number of pages which have been accessed so far, and are thus
    * no longer being monitored.
    */
  var pagesCompleted: Double = js.native
  
  /**
    * Overall number of pages that were initially monitored.
    */
  var pagesTotal: Double = js.native
  
  /**
    * Index of the accessed range in the ranges provided to
    * `MemoryAccessMonitor.enable()`.
    */
  var rangeIndex: Double = js.native
}
object MemoryAccessDetails {
  
  @scala.inline
  def apply(
    address: NativePointer,
    from: NativePointer,
    operation: MemoryOperation,
    pageIndex: Double,
    pagesCompleted: Double,
    pagesTotal: Double,
    rangeIndex: Double
  ): MemoryAccessDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pagesCompleted = pagesCompleted.asInstanceOf[js.Any], pagesTotal = pagesTotal.asInstanceOf[js.Any], rangeIndex = rangeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryAccessDetails]
  }
  
  @scala.inline
  implicit class MemoryAccessDetailsMutableBuilder[Self <: MemoryAccessDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: NativePointer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: MemoryOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesCompleted(value: Double): Self = StObject.set(x, "pagesCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesTotal(value: Double): Self = StObject.set(x, "pagesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeIndex(value: Double): Self = StObject.set(x, "rangeIndex", value.asInstanceOf[js.Any])
  }
}
