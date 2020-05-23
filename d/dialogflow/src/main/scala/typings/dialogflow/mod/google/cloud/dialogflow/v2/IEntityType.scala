package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode
import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EntityType. */
trait IEntityType extends js.Object {
  /** EntityType autoExpansionMode */
  var autoExpansionMode: js.UndefOr[
    AutoExpansionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.EntityType.AutoExpansionMode * / any */ String) | Null
  ] = js.undefined
  /** EntityType displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /** EntityType enableFuzzyExtraction */
  var enableFuzzyExtraction: js.UndefOr[Boolean | Null] = js.undefined
  /** EntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  /** EntityType kind */
  var kind: js.UndefOr[
    Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.EntityType.Kind * / any */ String) | Null
  ] = js.undefined
  /** EntityType name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IEntityType {
  @scala.inline
  def apply(
    autoExpansionMode: js.UndefOr[
      Null | AutoExpansionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.EntityType.AutoExpansionMode * / any */ String)
    ] = js.undefined,
    displayName: js.UndefOr[Null | String] = js.undefined,
    enableFuzzyExtraction: js.UndefOr[Null | Boolean] = js.undefined,
    entities: js.UndefOr[Null | js.Array[IEntity]] = js.undefined,
    kind: js.UndefOr[
      Null | Kind | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.EntityType.Kind * / any */ String)
    ] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IEntityType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpansionMode)) __obj.updateDynamic("autoExpansionMode")(autoExpansionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFuzzyExtraction)) __obj.updateDynamic("enableFuzzyExtraction")(enableFuzzyExtraction.asInstanceOf[js.Any])
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (!js.isUndefined(kind)) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityType]
  }
}

