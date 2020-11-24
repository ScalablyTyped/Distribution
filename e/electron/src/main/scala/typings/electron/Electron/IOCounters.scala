package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCounters extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/io-counters
  /**
    * Then number of I/O other operations.
    */
  var otherOperationCount: Double = js.native
  
  /**
    * Then number of I/O other transfers.
    */
  var otherTransferCount: Double = js.native
  
  /**
    * The number of I/O read operations.
    */
  var readOperationCount: Double = js.native
  
  /**
    * The number of I/O read transfers.
    */
  var readTransferCount: Double = js.native
  
  /**
    * The number of I/O write operations.
    */
  var writeOperationCount: Double = js.native
  
  /**
    * The number of I/O write transfers.
    */
  var writeTransferCount: Double = js.native
}
object IOCounters {
  
  @scala.inline
  def apply(
    otherOperationCount: Double,
    otherTransferCount: Double,
    readOperationCount: Double,
    readTransferCount: Double,
    writeOperationCount: Double,
    writeTransferCount: Double
  ): IOCounters = {
    val __obj = js.Dynamic.literal(otherOperationCount = otherOperationCount.asInstanceOf[js.Any], otherTransferCount = otherTransferCount.asInstanceOf[js.Any], readOperationCount = readOperationCount.asInstanceOf[js.Any], readTransferCount = readTransferCount.asInstanceOf[js.Any], writeOperationCount = writeOperationCount.asInstanceOf[js.Any], writeTransferCount = writeTransferCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCounters]
  }
  
  @scala.inline
  implicit class IOCountersOps[Self <: IOCounters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOtherOperationCount(value: Double): Self = this.set("otherOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherTransferCount(value: Double): Self = this.set("otherTransferCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOperationCount(value: Double): Self = this.set("readOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTransferCount(value: Double): Self = this.set("readTransferCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteOperationCount(value: Double): Self = this.set("writeOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteTransferCount(value: Double): Self = this.set("writeTransferCount", value.asInstanceOf[js.Any])
  }
}
