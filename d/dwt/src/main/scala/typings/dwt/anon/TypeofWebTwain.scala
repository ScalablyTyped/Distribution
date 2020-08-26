package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWebTwain extends js.Object {
  val Addon: TypeofAddon = js.native
}

object TypeofWebTwain {
  @scala.inline
  def apply(Addon: TypeofAddon): TypeofWebTwain = {
    val __obj = js.Dynamic.literal(Addon = Addon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWebTwain]
  }
  @scala.inline
  implicit class TypeofWebTwainOps[Self <: TypeofWebTwain] (val x: Self) extends AnyVal {
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
    def setAddon(value: TypeofAddon): Self = this.set("Addon", value.asInstanceOf[js.Any])
  }
  
}

