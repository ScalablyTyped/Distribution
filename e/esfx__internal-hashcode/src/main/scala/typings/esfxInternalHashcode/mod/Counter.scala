package typings.esfxInternalHashcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  var next: Double
}

object Counter {
  @scala.inline
  def apply(next: Double): Counter = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
}

