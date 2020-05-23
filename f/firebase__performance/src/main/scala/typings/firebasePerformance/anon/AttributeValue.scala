package typings.firebasePerformance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  var attributeValue: String
}

object AttributeValue {
  @scala.inline
  def apply(attributeValue: String): AttributeValue = {
    val __obj = js.Dynamic.literal(attributeValue = attributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValue]
  }
}

