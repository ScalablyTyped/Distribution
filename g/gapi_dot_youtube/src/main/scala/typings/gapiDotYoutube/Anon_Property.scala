package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Property extends js.Object {
  /**
    * A property.
    */
  var property: String
  /**
    * The propertys value.
    */
  var value: String
}

object Anon_Property {
  @scala.inline
  def apply(property: String, value: String): Anon_Property = {
    val __obj = js.Dynamic.literal(property = property, value = value)
  
    __obj.asInstanceOf[Anon_Property]
  }
}

