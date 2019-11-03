package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.EntityType.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EntityType. */
trait IEntityType extends js.Object {
  /** EntityType autoExpansionMode */
  var autoExpansionMode: js.UndefOr[AutoExpansionMode | Null] = js.undefined
  /** EntityType displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /** EntityType enableFuzzyExtraction */
  var enableFuzzyExtraction: js.UndefOr[Boolean | Null] = js.undefined
  /** EntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  /** EntityType kind */
  var kind: js.UndefOr[Kind | Null] = js.undefined
  /** EntityType name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IEntityType {
  @scala.inline
  def apply(
    autoExpansionMode: AutoExpansionMode = null,
    displayName: String = null,
    enableFuzzyExtraction: js.UndefOr[Boolean] = js.undefined,
    entities: js.Array[IEntity] = null,
    kind: Kind = null,
    name: String = null
  ): IEntityType = {
    val __obj = js.Dynamic.literal()
    if (autoExpansionMode != null) __obj.updateDynamic("autoExpansionMode")(autoExpansionMode)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enableFuzzyExtraction)) __obj.updateDynamic("enableFuzzyExtraction")(enableFuzzyExtraction)
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IEntityType]
  }
}

