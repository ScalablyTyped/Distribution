package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOperationsResponse extends js.Object {
  /**
    * If any zones are listed here, the list of operations returned
    * may be missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of operations in the project in the specified zone. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
}

