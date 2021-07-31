package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCounters extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/io-counters
  /**
    * Then number of I/O other operations.
    */
  var otherOperationCount: Double
  
  /**
    * Then number of I/O other transfers.
    */
  var otherTransferCount: Double
  
  /**
    * The number of I/O read operations.
    */
  var readOperationCount: Double
  
  /**
    * The number of I/O read transfers.
    */
  var readTransferCount: Double
  
  /**
    * The number of I/O write operations.
    */
  var writeOperationCount: Double
  
  /**
    * The number of I/O write transfers.
    */
  var writeTransferCount: Double
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
  implicit class IOCountersMutableBuilder[Self <: IOCounters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtherOperationCount(value: Double): Self = StObject.set(x, "otherOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherTransferCount(value: Double): Self = StObject.set(x, "otherTransferCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOperationCount(value: Double): Self = StObject.set(x, "readOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTransferCount(value: Double): Self = StObject.set(x, "readTransferCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteOperationCount(value: Double): Self = StObject.set(x, "writeOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteTransferCount(value: Double): Self = StObject.set(x, "writeTransferCount", value.asInstanceOf[js.Any])
  }
}
