package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchUpdateEntities.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest extends js.Object {
  /**
    * Required. The entities to update or create.
    */
  var entities: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest {
  @scala.inline
  def apply(
    entities: js.Array[Schema$GoogleCloudDialogflowV2beta1EntityTypeEntity] = null,
    languageCode: String = null,
    updateMask: String = null
  ): Schema$GoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1BatchUpdateEntitiesRequest]
  }
}

