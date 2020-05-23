package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TIMESTAMP extends js.Object {
  var TIMESTAMP: Sv
  def increment(delta: Double): SvIncrement
}

object TIMESTAMP {
  @scala.inline
  def apply(TIMESTAMP: Sv, increment: Double => SvIncrement): TIMESTAMP = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], increment = js.Any.fromFunction1(increment))
    __obj.asInstanceOf[TIMESTAMP]
  }
}

