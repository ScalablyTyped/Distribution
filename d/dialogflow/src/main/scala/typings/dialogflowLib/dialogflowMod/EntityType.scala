package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityType extends js.Object {
  var autoExpansionMode: EntityAutoExpansionMode
  var displayName: java.lang.String
  var entities: js.Array[EntitySynonyms]
  var kind: EntityKind
  var name: java.lang.String
}

object EntityType {
  @scala.inline
  def apply(
    autoExpansionMode: EntityAutoExpansionMode,
    displayName: java.lang.String,
    entities: js.Array[EntitySynonyms],
    kind: EntityKind,
    name: java.lang.String
  ): EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoExpansionMode")(autoExpansionMode)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("entities")(entities)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EntityType]
  }
}

