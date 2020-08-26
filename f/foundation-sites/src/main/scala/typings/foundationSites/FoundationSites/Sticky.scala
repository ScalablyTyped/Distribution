package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/sticky.html#javascript-reference
@js.native
trait Sticky extends js.Object {
  def destroy(): Unit = js.native
}

object Sticky {
  @scala.inline
  def apply(destroy: () => Unit): Sticky = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Sticky]
  }
  @scala.inline
  implicit class StickyOps[Self <: Sticky] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
  }
  
}

