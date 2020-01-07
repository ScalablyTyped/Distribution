package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An **entity entry** for an associated entity type.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1EntityTypeEntity extends js.Object {
  /**
    * Required. A collection of value synonyms. For example, if the entity type
    * is *vegetable*, and `value` is *scallions*, a synonym could be *green
    * onions*.  For `KIND_LIST` entity types:  *   This collection must contain
    * exactly one synonym equal to `value`.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The primary value associated with this entity entry. For
    * example, if the entity type is *vegetable*, the value could be
    * *scallions*.  For `KIND_MAP` entity types:  *   A canonical value to be
    * used in place of synonyms.  For `KIND_LIST` entity types:  *   A string
    * that can contain references to other entity types (with or     without
    * aliases).
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1EntityTypeEntity {
  @scala.inline
  def apply(synonyms: js.Array[String] = null, value: String = null): Schema$GoogleCloudDialogflowV2beta1EntityTypeEntity = {
    val __obj = js.Dynamic.literal()
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1EntityTypeEntity]
  }
}

