package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerValue extends js.Object {
  var integerValue: String | Double
}

object IntegerValue {
  @scala.inline
  def apply(integerValue: String | Double): IntegerValue = {
    val __obj = js.Dynamic.literal(integerValue = integerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerValue]
  }
}

