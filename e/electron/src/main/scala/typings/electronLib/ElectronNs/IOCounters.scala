package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOCounters extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/io-counters
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

