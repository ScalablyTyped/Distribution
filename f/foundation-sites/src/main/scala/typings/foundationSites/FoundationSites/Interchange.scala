package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/interchange.html#javascript-reference
@js.native
trait Interchange extends js.Object {
  def destroy(): Unit = js.native
  def replace(path: String): Unit = js.native
}

object Interchange {
  @scala.inline
  def apply(destroy: () => Unit, replace: String => Unit): Interchange = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), replace = js.Any.fromFunction1(replace))
    __obj.asInstanceOf[Interchange]
  }
  @scala.inline
  implicit class InterchangeOps[Self <: Interchange] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setReplace(value: String => Unit): Self = this.set("replace", js.Any.fromFunction1(value))
  }
  
}

