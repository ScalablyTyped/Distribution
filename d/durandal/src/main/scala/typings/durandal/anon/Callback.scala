package typings.durandal.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  var routePattern: RegExp = js.native
  def callback(fragment: String): Unit = js.native
}

object Callback {
  @scala.inline
  def apply(callback: String => Unit, routePattern: RegExp): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), routePattern = routePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
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
    def setCallback(value: String => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setRoutePattern(value: RegExp): Self = this.set("routePattern", value.asInstanceOf[js.Any])
  }
  
}

