package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an entity type. Entity types serve as a tool for extracting
  * parameter values from natural language queries.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2EntityType extends js.Object {
  /**
    * Optional. Indicates whether the entity type can be automatically
    * expanded.
    */
  var autoExpansionMode: js.UndefOr[String] = js.native
  /**
    * Required. The name of the entity type.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of entity entries associated with the entity
    * type.
    */
  var entities: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2EntityTypeEntity]] = js.native
  /**
    * Required. Indicates the kind of entity type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the entity type. Required for
    * EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes
    * methods. Format: `projects/&lt;Project
    * ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2EntityType {
  @scala.inline
  def apply(
    autoExpansionMode: String = null,
    displayName: String = null,
    entities: js.Array[Schema$GoogleCloudDialogflowV2EntityTypeEntity] = null,
    kind: String = null,
    name: String = null
  ): Schema$GoogleCloudDialogflowV2EntityType = {
    val __obj = js.Dynamic.literal()
    if (autoExpansionMode != null) __obj.updateDynamic("autoExpansionMode")(autoExpansionMode.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2EntityType]
  }
}

