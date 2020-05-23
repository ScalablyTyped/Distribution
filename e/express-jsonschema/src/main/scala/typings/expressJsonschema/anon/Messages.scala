package typings.expressJsonschema.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages extends js.Object {
  var messages: js.Array[String]
  var property: String
  var value: js.Any
}

object Messages {
  @scala.inline
  def apply(messages: js.Array[String], property: String, value: js.Any): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
}

