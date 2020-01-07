package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListOperationsResponse is the result of ListOperationsRequest.
  */
@js.native
trait Schema$ListOperationsResponse extends js.Object {
  /**
    * If any zones are listed here, the list of operations returned may be
    * missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of operations in the project in the specified zone.
    */
  var operations: js.UndefOr[js.Array[Schema$Operation]] = js.native
}

object Schema$ListOperationsResponse {
  @scala.inline
  def apply(missingZones: js.Array[String] = null, operations: js.Array[Schema$Operation] = null): Schema$ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (missingZones != null) __obj.updateDynamic("missingZones")(missingZones.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListOperationsResponse]
  }
}

