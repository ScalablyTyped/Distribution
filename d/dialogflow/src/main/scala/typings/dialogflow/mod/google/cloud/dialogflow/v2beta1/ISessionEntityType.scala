package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.SessionEntityType.EntityOverrideMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SessionEntityType. */
trait ISessionEntityType extends js.Object {
  /** SessionEntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  /** SessionEntityType entityOverrideMode */
  var entityOverrideMode: js.UndefOr[
    EntityOverrideMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.SessionEntityType.EntityOverrideMode * / any */ String) | Null
  ] = js.undefined
  /** SessionEntityType name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object ISessionEntityType {
  @scala.inline
  def apply(
    entities: js.UndefOr[Null | js.Array[IEntity]] = js.undefined,
    entityOverrideMode: js.UndefOr[
      Null | EntityOverrideMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.SessionEntityType.EntityOverrideMode * / any */ String)
    ] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): ISessionEntityType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (!js.isUndefined(entityOverrideMode)) __obj.updateDynamic("entityOverrideMode")(entityOverrideMode.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionEntityType]
  }
}

