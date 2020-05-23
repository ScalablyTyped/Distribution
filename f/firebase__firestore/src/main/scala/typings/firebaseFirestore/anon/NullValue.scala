package typings.firebaseFirestore.anon

import typings.firebaseFirestore.firebaseFirestoreStrings.NULL_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullValue extends js.Object {
  var nullValue: NULL_VALUE
}

object NullValue {
  @scala.inline
  def apply(nullValue: NULL_VALUE): NullValue = {
    val __obj = js.Dynamic.literal(nullValue = nullValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullValue]
  }
}

