package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for EntityTypes.BatchUpdateEntityTypes.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse extends js.Object {
  /**
    * The collection of updated or created entity types.
    */
  var entityTypes: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2EntityType]] = js.native
}

object Schema$GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse {
  @scala.inline
  def apply(entityTypes: js.Array[Schema$GoogleCloudDialogflowV2EntityType] = null): Schema$GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse]
  }
}

