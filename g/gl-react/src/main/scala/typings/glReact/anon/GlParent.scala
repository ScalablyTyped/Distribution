package typings.glReact.anon

import typings.glReact.mod.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlParent extends js.Object {
  var glParent: Surface[_] | typings.glReact.mod.Node = js.native
  var glSurface: Surface[_] = js.native
}

object GlParent {
  @scala.inline
  def apply(glParent: Surface[_] | typings.glReact.mod.Node, glSurface: Surface[_]): GlParent = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlParent]
  }
  @scala.inline
  implicit class GlParentOps[Self <: GlParent] (val x: Self) extends AnyVal {
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
    def setGlParent(value: Surface[_] | typings.glReact.mod.Node): Self = this.set("glParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlSurface(value: Surface[_]): Self = this.set("glSurface", value.asInstanceOf[js.Any])
  }
  
}

