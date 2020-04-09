package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDoubleValue extends js.Object {
  var doubleValue: String | Double
}

object AnonDoubleValue {
  @scala.inline
  def apply(doubleValue: String | Double): AnonDoubleValue = {
    val __obj = js.Dynamic.literal(doubleValue = doubleValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDoubleValue]
  }
}

