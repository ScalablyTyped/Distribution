package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCounters extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/io-counters
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
}

