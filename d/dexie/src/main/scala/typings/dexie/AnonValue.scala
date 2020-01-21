package typings.dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[T] extends js.Object {
  var value: T
}

object AnonValue {
  @scala.inline
  def apply[T](value: T): AnonValue[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue[T]]
  }
}

