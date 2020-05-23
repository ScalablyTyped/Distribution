package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: Double
  var width: Double
}

object Length {
  @scala.inline
  def apply(length: Double, width: Double): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

