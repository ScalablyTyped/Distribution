package typings.gliderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GliderEvent[T] extends js.Object {
  var bubbles: Boolean
  var detail: T
}

object GliderEvent {
  @scala.inline
  def apply[T](bubbles: Boolean, detail: T): GliderEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[GliderEvent[T]]
  }
}

