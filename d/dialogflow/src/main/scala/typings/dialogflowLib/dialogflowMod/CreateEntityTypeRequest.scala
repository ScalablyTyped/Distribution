package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEntityTypeRequest extends js.Object {
  var entityType: EntityType
  var parent: java.lang.String
}

object CreateEntityTypeRequest {
  @scala.inline
  def apply(entityType: EntityType, parent: java.lang.String): CreateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entityType")(entityType)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[CreateEntityTypeRequest]
  }
}

