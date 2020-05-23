package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increment extends js.Object {
  var increment: Double
}

object Increment {
  @scala.inline
  def apply(increment: Double): Increment = {
    val __obj = js.Dynamic.literal(increment = increment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increment]
  }
}

