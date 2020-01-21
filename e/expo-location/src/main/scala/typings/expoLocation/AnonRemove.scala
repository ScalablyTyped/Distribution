package typings.expoLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove extends js.Object {
  def remove(): Unit
}

object AnonRemove {
  @scala.inline
  def apply(remove: () => Unit): AnonRemove = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[AnonRemove]
  }
}

