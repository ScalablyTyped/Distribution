package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: Double
  var width: Double
}

object AnonLength {
  @scala.inline
  def apply(length: Double, width: Double): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

