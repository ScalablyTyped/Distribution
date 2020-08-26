package typings.fancybox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autostart extends js.Object {
  var autostart: Boolean = js.native
}

object Autostart {
  @scala.inline
  def apply(autostart: Boolean): Autostart = {
    val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autostart]
  }
  @scala.inline
  implicit class AutostartOps[Self <: Autostart] (val x: Self) extends AnyVal {
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
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
  }
  
}

