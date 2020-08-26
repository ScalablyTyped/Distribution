package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStageGLOptions extends js.Object {
  var antialias: js.UndefOr[Boolean] = js.native
  var autoPurge: js.UndefOr[Double] = js.native
  var premultiply: js.UndefOr[Boolean] = js.native
  var preserveBuffer: js.UndefOr[Boolean] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
}

object IStageGLOptions {
  @scala.inline
  def apply(): IStageGLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStageGLOptions]
  }
  @scala.inline
  implicit class IStageGLOptionsOps[Self <: IStageGLOptions] (val x: Self) extends AnyVal {
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
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    @scala.inline
    def setAutoPurge(value: Double): Self = this.set("autoPurge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPurge: Self = this.set("autoPurge", js.undefined)
    @scala.inline
    def setPremultiply(value: Boolean): Self = this.set("premultiply", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremultiply: Self = this.set("premultiply", js.undefined)
    @scala.inline
    def setPreserveBuffer(value: Boolean): Self = this.set("preserveBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveBuffer: Self = this.set("preserveBuffer", js.undefined)
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
  }
  
}

