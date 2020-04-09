package typings.firebaseFirestore

import typings.firebaseFirestore.firebaseFirestoreStrings.NULL_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNullValue extends js.Object {
  var nullValue: NULL_VALUE
}

object AnonNullValue {
  @scala.inline
  def apply(nullValue: NULL_VALUE): AnonNullValue = {
    val __obj = js.Dynamic.literal(nullValue = nullValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNullValue]
  }
}

