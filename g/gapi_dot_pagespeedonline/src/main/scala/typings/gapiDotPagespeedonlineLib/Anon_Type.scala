package typings
package gapiDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  /**
    * Type of argument. One of URL, STRING_LITERAL, INT_LITERAL, BYTES, or DURATION.
    */
  var `type`: java.lang.String
  /**
    * Argument value, as a localized string.
    */
  var value: java.lang.String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String): Anon_Type = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Type]
  }
}

