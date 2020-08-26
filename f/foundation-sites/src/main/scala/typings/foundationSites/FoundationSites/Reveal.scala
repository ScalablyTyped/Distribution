package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/reveal.html#javascript-reference
@js.native
trait Reveal extends js.Object {
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def open(): Unit = js.native
  def toggle(): Unit = js.native
}

object Reveal {
  @scala.inline
  def apply(close: () => Unit, destroy: () => Unit, open: () => Unit, toggle: () => Unit): Reveal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Reveal]
  }
  @scala.inline
  implicit class RevealOps[Self <: Reveal] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
  
}

