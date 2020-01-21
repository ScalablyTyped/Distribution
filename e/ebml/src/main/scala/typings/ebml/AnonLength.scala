package typings.ebml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: Double
  var value: Double
}

object AnonLength {
  @scala.inline
  def apply(length: Double, value: Double): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLength]
  }
}

