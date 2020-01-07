package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata in google::longrunning::Operation for Knowledge operations.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata extends js.Object {
  /**
    * Required. The current state of this operation.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata {
  @scala.inline
  def apply(state: String = null): Schema$GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata]
  }
}

