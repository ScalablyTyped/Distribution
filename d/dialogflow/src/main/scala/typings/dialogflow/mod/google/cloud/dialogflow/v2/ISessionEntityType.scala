package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typings.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SessionEntityType. */
trait ISessionEntityType extends js.Object {
  /** SessionEntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  /** SessionEntityType entityOverrideMode */
  var entityOverrideMode: js.UndefOr[EntityOverrideMode | Null] = js.undefined
  /** SessionEntityType name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object ISessionEntityType {
  @scala.inline
  def apply(
    entities: js.Array[IEntity] = null,
    entityOverrideMode: EntityOverrideMode = null,
    name: String = null
  ): ISessionEntityType = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (entityOverrideMode != null) __obj.updateDynamic("entityOverrideMode")(entityOverrideMode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionEntityType]
  }
}

