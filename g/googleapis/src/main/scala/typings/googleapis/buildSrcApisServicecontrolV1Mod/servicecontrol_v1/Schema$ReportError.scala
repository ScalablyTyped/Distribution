package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the processing error of one Operation in the request.
  */
@js.native
trait Schema$ReportError extends js.Object {
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Details of the error when processing the Operation.
    */
  var status: js.UndefOr[Schema$Status] = js.native
}

object Schema$ReportError {
  @scala.inline
  def apply(operationId: String = null, status: Schema$Status = null): Schema$ReportError = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReportError]
  }
}

