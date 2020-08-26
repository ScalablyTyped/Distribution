package typings.flight.Flight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeStatic extends js.Object {
  def mixin(base: js.Object, mixins: js.Array[js.Function]): Unit = js.native
}

object ComposeStatic {
  @scala.inline
  def apply(mixin: (js.Object, js.Array[js.Function]) => Unit): ComposeStatic = {
    val __obj = js.Dynamic.literal(mixin = js.Any.fromFunction2(mixin))
    __obj.asInstanceOf[ComposeStatic]
  }
  @scala.inline
  implicit class ComposeStaticOps[Self <: ComposeStatic] (val x: Self) extends AnyVal {
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
    def setMixin(value: (js.Object, js.Array[js.Function]) => Unit): Self = this.set("mixin", js.Any.fromFunction2(value))
  }
  
}

