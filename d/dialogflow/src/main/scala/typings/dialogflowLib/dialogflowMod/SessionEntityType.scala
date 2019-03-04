package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionEntityType extends js.Object {
  var entities: js.Array[Entity]
  var entityOverrideMode: java.lang.String
  var name: java.lang.String
}

object SessionEntityType {
  @scala.inline
  def apply(entities: js.Array[Entity], entityOverrideMode: java.lang.String, name: java.lang.String): SessionEntityType = {
    val __obj = js.Dynamic.literal(entities = entities, entityOverrideMode = entityOverrideMode, name = name)
  
    __obj.asInstanceOf[SessionEntityType]
  }
}

