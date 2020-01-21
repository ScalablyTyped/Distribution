package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperty extends js.Object {
  /**
    * A property.
    */
  var property: String
  /**
    * The propertys value.
    */
  var value: String
}

object AnonProperty {
  @scala.inline
  def apply(property: String, value: String): AnonProperty = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProperty]
  }
}

