package typings.expressFlash2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flash extends js.Object {
  var flash: typings.expressFlash2.mod.global.Express.Flash = js.native
}

object Flash {
  @scala.inline
  def apply(flash: typings.expressFlash2.mod.global.Express.Flash): Flash = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flash]
  }
  @scala.inline
  implicit class FlashOps[Self <: Flash] (val x: Self) extends AnyVal {
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
    def setFlash(value: typings.expressFlash2.mod.global.Express.Flash): Self = this.set("flash", value.asInstanceOf[js.Any])
  }
  
}

