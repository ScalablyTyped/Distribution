package typings.fortawesomeFontawesomeSvgCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Library_ extends js.Object {
  def add(definitions: IconDefinitionOrPack*): Unit = js.native
  def reset(): Unit = js.native
}

object Library_ {
  @scala.inline
  def apply(add: /* repeated */ IconDefinitionOrPack => Unit, reset: () => Unit): Library_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Library_]
  }
  @scala.inline
  implicit class Library_Ops[Self <: Library_] (val x: Self) extends AnyVal {
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
    def setAdd(value: /* repeated */ IconDefinitionOrPack => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

