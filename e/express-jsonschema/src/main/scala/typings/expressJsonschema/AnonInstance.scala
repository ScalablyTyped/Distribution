package typings.expressJsonschema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstance extends js.Object {
  var instance: js.Any
  var message: String
  var property: String
}

object AnonInstance {
  @scala.inline
  def apply(instance: js.Any, message: String, property: String): AnonInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstance]
  }
}

