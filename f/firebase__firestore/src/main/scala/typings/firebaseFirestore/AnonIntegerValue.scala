package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntegerValue extends js.Object {
  var integerValue: String | Double
}

object AnonIntegerValue {
  @scala.inline
  def apply(integerValue: String | Double): AnonIntegerValue = {
    val __obj = js.Dynamic.literal(integerValue = integerValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIntegerValue]
  }
}

