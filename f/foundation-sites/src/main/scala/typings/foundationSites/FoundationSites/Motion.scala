package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Motion extends js.Object {
  def animateIn(element: js.Object, animation: js.Any, cb: js.Function): Unit = js.native
  def animateOut(element: js.Object, animation: js.Any, cb: js.Function): Unit = js.native
}

object Motion {
  @scala.inline
  def apply(
    animateIn: (js.Object, js.Any, js.Function) => Unit,
    animateOut: (js.Object, js.Any, js.Function) => Unit
  ): Motion = {
    val __obj = js.Dynamic.literal(animateIn = js.Any.fromFunction3(animateIn), animateOut = js.Any.fromFunction3(animateOut))
    __obj.asInstanceOf[Motion]
  }
  @scala.inline
  implicit class MotionOps[Self <: Motion] (val x: Self) extends AnyVal {
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
    def setAnimateIn(value: (js.Object, js.Any, js.Function) => Unit): Self = this.set("animateIn", js.Any.fromFunction3(value))
    @scala.inline
    def setAnimateOut(value: (js.Object, js.Any, js.Function) => Unit): Self = this.set("animateOut", js.Any.fromFunction3(value))
  }
  
}

