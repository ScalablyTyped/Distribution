package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleValue extends js.Object {
  var doubleValue: String | Double
}

object DoubleValue {
  @scala.inline
  def apply(doubleValue: String | Double): DoubleValue = {
    val __obj = js.Dynamic.literal(doubleValue = doubleValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleValue]
  }
}

