package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchDeleteEntityTypes.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest extends js.Object {
  /**
    * Required. The names entity types to delete. All names must point to the
    * same agent as `parent`.
    */
  var entityTypeNames: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest {
  @scala.inline
  def apply(entityTypeNames: js.Array[String] = null): Schema$GoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityTypeNames != null) __obj.updateDynamic("entityTypeNames")(entityTypeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest]
  }
}

