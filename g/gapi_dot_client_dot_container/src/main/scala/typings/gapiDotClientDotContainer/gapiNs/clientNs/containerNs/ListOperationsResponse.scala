package typings.gapiDotClientDotContainer.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOperationsResponse extends js.Object {
  /**
    * If any zones are listed here, the list of operations returned
    * may be missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.undefined
  /** A list of operations in the project in the specified zone. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
}

object ListOperationsResponse {
  @scala.inline
  def apply(missingZones: js.Array[String] = null, operations: js.Array[Operation] = null): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (missingZones != null) __obj.updateDynamic("missingZones")(missingZones)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[ListOperationsResponse]
  }
}

