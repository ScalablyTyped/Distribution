package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchCreateEntities.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2BatchCreateEntitiesRequest extends js.Object {
  /**
    * Required. The entities to create.
    */
  var entities: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2EntityTypeEntity]] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2BatchCreateEntitiesRequest {
  @scala.inline
  def apply(
    entities: js.Array[Schema$GoogleCloudDialogflowV2EntityTypeEntity] = null,
    languageCode: String = null
  ): Schema$GoogleCloudDialogflowV2BatchCreateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2BatchCreateEntitiesRequest]
  }
}

