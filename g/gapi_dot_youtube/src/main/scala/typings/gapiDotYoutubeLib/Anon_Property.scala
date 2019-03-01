package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Property extends js.Object {
  /**
    * A property.
    */
  var property: java.lang.String
  /**
    * The propertys value.
    */
  var value: java.lang.String
}

object Anon_Property {
  @scala.inline
  def apply(property: java.lang.String, value: java.lang.String): Anon_Property = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Property]
  }
}

