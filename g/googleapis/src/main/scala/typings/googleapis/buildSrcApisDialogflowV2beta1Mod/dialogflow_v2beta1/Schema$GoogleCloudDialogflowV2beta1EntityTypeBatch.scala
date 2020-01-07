package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is a wrapper around a collection of entity types.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1EntityTypeBatch extends js.Object {
  /**
    * A collection of entity types.
    */
  var entityTypes: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1EntityType]] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1EntityTypeBatch {
  @scala.inline
  def apply(entityTypes: js.Array[Schema$GoogleCloudDialogflowV2beta1EntityType] = null): Schema$GoogleCloudDialogflowV2beta1EntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1EntityTypeBatch]
  }
}

