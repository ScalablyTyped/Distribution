package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityTypeBatch extends js.Object {
  var entityTypes: js.Array[EntityType]
}

object EntityTypeBatch {
  @scala.inline
  def apply(entityTypes: js.Array[EntityType]): EntityTypeBatch = {
    val __obj = js.Dynamic.literal(entityTypes = entityTypes)
  
    __obj.asInstanceOf[EntityTypeBatch]
  }
}

