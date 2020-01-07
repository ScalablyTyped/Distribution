package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for updating an existing operation
  */
@js.native
trait Schema$UpdateOperationRequest extends js.Object {
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[Schema$Operation] = js.native
  /**
    * The fields to update.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$UpdateOperationRequest {
  @scala.inline
  def apply(operation: Schema$Operation = null, updateMask: String = null): Schema$UpdateOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateOperationRequest]
  }
}

