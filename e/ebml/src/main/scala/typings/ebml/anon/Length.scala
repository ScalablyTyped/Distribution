package typings.ebml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: Double
  var value: Double
}

object Length {
  @scala.inline
  def apply(length: Double, value: Double): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

