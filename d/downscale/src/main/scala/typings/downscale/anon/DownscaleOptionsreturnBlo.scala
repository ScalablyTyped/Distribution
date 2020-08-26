package typings.downscale.anon

import typings.downscale.downscaleBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined downscale.downscale.DownscaleOptions & {  returnBlob :true} */
@js.native
trait DownscaleOptionsreturnBlo extends js.Object {
  var imageType: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var returnBlob: js.UndefOr[Boolean] with `true` = js.native
  var returnCanvas: js.UndefOr[Boolean] = js.native
  var sourceX: js.UndefOr[Double] = js.native
  var sourceY: js.UndefOr[Double] = js.native
}

object DownscaleOptionsreturnBlo {
  @scala.inline
  def apply(returnBlob: js.UndefOr[Boolean] with `true`): DownscaleOptionsreturnBlo = {
    val __obj = js.Dynamic.literal(returnBlob = returnBlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownscaleOptionsreturnBlo]
  }
  @scala.inline
  implicit class DownscaleOptionsreturnBloOps[Self <: DownscaleOptionsreturnBlo] (val x: Self) extends AnyVal {
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
    def setReturnBlob(value: js.UndefOr[Boolean] with `true`): Self = this.set("returnBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setReturnCanvas(value: Boolean): Self = this.set("returnCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnCanvas: Self = this.set("returnCanvas", js.undefined)
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

