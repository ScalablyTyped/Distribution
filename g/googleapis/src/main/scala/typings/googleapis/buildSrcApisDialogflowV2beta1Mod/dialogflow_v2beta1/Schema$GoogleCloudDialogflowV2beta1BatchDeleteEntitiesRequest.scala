package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchDeleteEntities.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest extends js.Object {
  /**
    * Required. The canonical `values` of the entities to delete. Note that
    * these are not fully-qualified names, i.e. they don&#39;t start with
    * `projects/&lt;Project ID&gt;`.
    */
  var entityValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest {
  @scala.inline
  def apply(entityValues: js.Array[String] = null, languageCode: String = null): Schema$GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityValues != null) __obj.updateDynamic("entityValues")(entityValues.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest]
  }
}

