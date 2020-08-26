package typings.downscale.anon

import typings.downscale.downscaleBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined downscale.downscale.DownscaleOptions & {  returnCanvas :true} */
@js.native
trait DownscaleOptionsreturnCan extends js.Object {
  var imageType: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var returnBlob: js.UndefOr[Boolean] = js.native
  var returnCanvas: js.UndefOr[Boolean] with `true` = js.native
  var sourceX: js.UndefOr[Double] = js.native
  var sourceY: js.UndefOr[Double] = js.native
}

object DownscaleOptionsreturnCan {
  @scala.inline
  def apply(returnCanvas: js.UndefOr[Boolean] with `true`): DownscaleOptionsreturnCan = {
    val __obj = js.Dynamic.literal(returnCanvas = returnCanvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownscaleOptionsreturnCan]
  }
  @scala.inline
  implicit class DownscaleOptionsreturnCanOps[Self <: DownscaleOptionsreturnCan] (val x: Self) extends AnyVal {
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
    def setReturnCanvas(value: js.UndefOr[Boolean] with `true`): Self = this.set("returnCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setReturnBlob(value: Boolean): Self = this.set("returnBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnBlob: Self = this.set("returnBlob", js.undefined)
    @scala.inline
    def setSourceX(value: Double): Self = this.set("sourceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceX: Self = this.set("sourceX", js.undefined)
    @scala.inline
    def setSourceY(value: Double): Self = this.set("sourceY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceY: Self = this.set("sourceY", js.undefined)
  }
  
}

