package typings.glReact.anon

import typings.glReact.mod.Bus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlParentBus extends js.Object {
  var glParent: Bus = js.native
}

object GlParentBus {
  @scala.inline
  def apply(glParent: Bus): GlParentBus = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlParentBus]
  }
  @scala.inline
  implicit class GlParentBusOps[Self <: GlParentBus] (val x: Self) extends AnyVal {
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
    def setGlParent(value: Bus): Self = this.set("glParent", value.asInstanceOf[js.Any])
  }
  
}

