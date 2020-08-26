package typings.expoLocation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remove extends js.Object {
  def remove(): Unit = js.native
}

object Remove {
  @scala.inline
  def apply(remove: () => Unit): Remove = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Remove]
  }
  @scala.inline
  implicit class RemoveOps[Self <: Remove] (val x: Self) extends AnyVal {
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
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

