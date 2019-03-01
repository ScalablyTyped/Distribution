package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCounters extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/io-counters
  /**
    * Then number of I/O other operations.
    */
  var otherOperationCount: scala.Double
  /**
    * Then number of I/O other transfers.
    */
  var otherTransferCount: scala.Double
  /**
    * The number of I/O read operations.
    */
  var readOperationCount: scala.Double
  /**
    * The number of I/O read transfers.
    */
  var readTransferCount: scala.Double
  /**
    * The number of I/O write operations.
    */
  var writeOperationCount: scala.Double
  /**
    * The number of I/O write transfers.
    */
  var writeTransferCount: scala.Double
}

object IOCounters {
  @scala.inline
  def apply(
    otherOperationCount: scala.Double,
    otherTransferCount: scala.Double,
    readOperationCount: scala.Double,
    readTransferCount: scala.Double,
    writeOperationCount: scala.Double,
    writeTransferCount: scala.Double
  ): IOCounters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("otherOperationCount")(otherOperationCount)
    __obj.updateDynamic("otherTransferCount")(otherTransferCount)
    __obj.updateDynamic("readOperationCount")(readOperationCount)
    __obj.updateDynamic("readTransferCount")(readTransferCount)
    __obj.updateDynamic("writeOperationCount")(writeOperationCount)
    __obj.updateDynamic("writeTransferCount")(writeTransferCount)
    __obj.asInstanceOf[IOCounters]
  }
}

