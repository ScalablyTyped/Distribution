package typings.expressJsonschema.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var instance: js.Any
  var message: String
  var property: String
}

object Instance {
  @scala.inline
  def apply(instance: js.Any, message: String, property: String): Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

