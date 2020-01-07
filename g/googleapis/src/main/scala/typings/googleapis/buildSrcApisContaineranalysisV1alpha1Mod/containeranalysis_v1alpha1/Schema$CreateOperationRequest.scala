package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for creating an operation
  */
@js.native
trait Schema$CreateOperationRequest extends js.Object {
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[Schema$Operation] = js.native
  /**
    * The ID to use for this operation.
    */
  var operationId: js.UndefOr[String] = js.native
}

object Schema$CreateOperationRequest {
  @scala.inline
  def apply(operation: Schema$Operation = null, operationId: String = null): Schema$CreateOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateOperationRequest]
  }
}

