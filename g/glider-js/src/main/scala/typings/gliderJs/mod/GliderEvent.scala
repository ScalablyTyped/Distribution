package typings.gliderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GliderEvent[T] extends js.Object {
  var bubbles: Boolean = js.native
  var detail: T = js.native
}

object GliderEvent {
  @scala.inline
  def apply[T](bubbles: Boolean, detail: T): GliderEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[GliderEvent[T]]
  }
  @scala.inline
  implicit class GliderEventOps[Self <: GliderEvent[_], T] (val x: Self with GliderEvent[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetail(value: T): Self = this.set("detail", value.asInstanceOf[js.Any])
  }
  
}

