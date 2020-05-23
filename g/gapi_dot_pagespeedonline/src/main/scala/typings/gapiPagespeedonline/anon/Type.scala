package typings.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * Type of argument. One of URL, STRING_LITERAL, INT_LITERAL, BYTES, or DURATION.
    */
  var `type`: String
  /**
    * Argument value, as a localized string.
    */
  var value: String
}

object Type {
  @scala.inline
  def apply(`type`: String, value: String): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

