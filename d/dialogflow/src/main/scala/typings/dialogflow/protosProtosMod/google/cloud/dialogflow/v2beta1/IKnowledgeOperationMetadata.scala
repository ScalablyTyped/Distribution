package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a KnowledgeOperationMetadata. */
trait IKnowledgeOperationMetadata extends js.Object {
  /** KnowledgeOperationMetadata state */
  var state: js.UndefOr[State | Null] = js.undefined
}

object IKnowledgeOperationMetadata {
  @scala.inline
  def apply(state: State = null): IKnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnowledgeOperationMetadata]
  }
}

