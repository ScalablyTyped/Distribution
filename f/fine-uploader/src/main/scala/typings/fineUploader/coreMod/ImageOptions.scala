package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageOptions extends js.Object {
  /**
    * Restrict images to a maximum height in pixels (wherever possible)
    *
    * @default `0`
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Restrict images to a maximum width in pixels (wherever possible)
    *
    * @default `0`
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Restrict images to a minimum height in pixels (wherever possible)
    *
    * @default `0`
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * Restrict images to a minimum width in pixels (wherever possible)
    *
    * @default `0`
    */
  var minWidth: js.UndefOr[Double] = js.native
}

object ImageOptions {
  @scala.inline
  def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  @scala.inline
  implicit class ImageOptionsOps[Self <: ImageOptions] (val x: Self) extends AnyVal {
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
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
  
}

