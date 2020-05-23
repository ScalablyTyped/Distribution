package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  /**
    * A property.
    */
  var property: String
  /**
    * The propertys value.
    */
  var value: String
}

object Property {
  @scala.inline
  def apply(property: String, value: String): Property = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

