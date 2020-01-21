package typings.enhancedResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  def push(item: String): Unit
}

object AnonItem {
  @scala.inline
  def apply(push: String => Unit): AnonItem = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[AnonItem]
  }
}

