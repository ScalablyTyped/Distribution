package typings.glFbo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameBufferOptions extends js.Object {
  var color: js.UndefOr[Double] = js.native
  var depth: js.UndefOr[Boolean] = js.native
  var float: js.UndefOr[Boolean] = js.native
  var preferFloat: js.UndefOr[Boolean] = js.native
  var stencil: js.UndefOr[Boolean] = js.native
}

object FrameBufferOptions {
  @scala.inline
  def apply(): FrameBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameBufferOptions]
  }
  @scala.inline
  implicit class FrameBufferOptionsOps[Self <: FrameBufferOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDepth(value: Boolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setFloat(value: Boolean): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setPreferFloat(value: Boolean): Self = this.set("preferFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferFloat: Self = this.set("preferFloat", js.undefined)
    @scala.inline
    def setStencil(value: Boolean): Self = this.set("stencil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStencil: Self = this.set("stencil", js.undefined)
  }
  
}

