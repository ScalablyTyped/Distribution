package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchUpdateEntityTypes.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest extends js.Object {
  /**
    * The collection of entity types to update or create.
    */
  var entityTypeBatchInline: js.UndefOr[Schema$GoogleCloudDialogflowV2EntityTypeBatch] = js.native
  /**
    * The URI to a Google Cloud Storage file containing entity types to update
    * or create. The file format can either be a serialized proto (of
    * EntityBatch type) or a JSON object. Note: The URI must start with
    * &quot;gs://&quot;.
    */
  var entityTypeBatchUri: js.UndefOr[String] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entity_types`. If
    * not specified, the agent&#39;s default language is used. [Many
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

object Schema$GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest {
  @scala.inline
  def apply(
    entityTypeBatchInline: Schema$GoogleCloudDialogflowV2EntityTypeBatch = null,
    entityTypeBatchUri: String = null,
    languageCode: String = null,
    updateMask: String = null
  ): Schema$GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityTypeBatchInline != null) __obj.updateDynamic("entityTypeBatchInline")(entityTypeBatchInline.asInstanceOf[js.Any])
    if (entityTypeBatchUri != null) __obj.updateDynamic("entityTypeBatchUri")(entityTypeBatchUri.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest]
  }
}

