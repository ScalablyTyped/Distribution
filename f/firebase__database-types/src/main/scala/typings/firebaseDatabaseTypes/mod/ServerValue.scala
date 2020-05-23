package typings.firebaseDatabaseTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerValue extends js.Object {
  var TIMESTAMP: js.Object
  def increment(delta: Double): js.Object
}

object ServerValue {
  @scala.inline
  def apply(TIMESTAMP: js.Object, increment: Double => js.Object): ServerValue = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], increment = js.Any.fromFunction1(increment))
    __obj.asInstanceOf[ServerValue]
  }
}

