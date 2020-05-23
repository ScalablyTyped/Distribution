package typings.expoLocation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remove extends js.Object {
  def remove(): Unit
}

object Remove {
  @scala.inline
  def apply(remove: () => Unit): Remove = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Remove]
  }
}

