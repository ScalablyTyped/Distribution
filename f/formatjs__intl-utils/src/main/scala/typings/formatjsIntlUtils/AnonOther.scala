package typings.formatjsIntlUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOther[T] extends js.Object {
  var other: T
}

object AnonOther {
  @scala.inline
  def apply[T](other: T): AnonOther[T] = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOther[T]]
  }
}

