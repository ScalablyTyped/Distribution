package typings.fineUploader.coreMod

import typings.std.HTMLCanvasElement
import typings.std.MimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasWrapper extends js.Object {
  /**
    * the `<canvas>` to be converted to a file & then uploaded
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  /**
    * the name to assign to the created file
    */
  var name: js.UndefOr[String] = js.native
  /**
    * `1`-`100` value indicating the desired quality of the converted file (only for `image/jpeg`)
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * MIME type of the file to create from this `<canvas>`
    */
  var `type`: js.UndefOr[MimeType] = js.native
}

object CanvasWrapper {
  @scala.inline
  def apply(): CanvasWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasWrapper]
  }
  @scala.inline
  implicit class CanvasWrapperOps[Self <: CanvasWrapper] (val x: Self) extends AnyVal {
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
    def setCanvas(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setType(value: MimeType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

