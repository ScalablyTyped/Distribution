package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is a wrapper around a collection of entity types.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2EntityTypeBatch extends js.Object {
  /**
    * A collection of entity types.
    */
  var entityTypes: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2EntityType]] = js.native
}

object Schema$GoogleCloudDialogflowV2EntityTypeBatch {
  @scala.inline
  def apply(entityTypes: js.Array[Schema$GoogleCloudDialogflowV2EntityType] = null): Schema$GoogleCloudDialogflowV2EntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2EntityTypeBatch]
  }
}

