package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataDiskAssignment extends js.Object {
  /**
    * Mounted data disks. The order is important a data disk's 0-based index in
    * this list defines which persistent directory the disk is mounted to, for
    * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
    * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
    */
  var dataDisks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * VM instance name the data disks mounted to, for example
    * "myproject-1014-104817-4c2-harness-0".
    */
  var vmInstance: js.UndefOr[java.lang.String] = js.undefined
}

