package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteSize extends js.Object {
  var byteSize: js.UndefOr[Double] = js.native
  var contextLink: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var thumbnailHeight: js.UndefOr[Double] = js.native
  var thumbnailLink: js.UndefOr[String] = js.native
  var thumbnailWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ByteSize {
  @scala.inline
  def apply(): ByteSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteSize]
  }
  @scala.inline
  implicit class ByteSizeOps[Self <: ByteSize] (val x: Self) extends AnyVal {
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
    def setByteSize(value: Double): Self = this.set("byteSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteSize: Self = this.set("byteSize", js.undefined)
    @scala.inline
    def setContextLink(value: String): Self = this.set("contextLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextLink: Self = this.set("contextLink", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setThumbnailHeight(value: Double): Self = this.set("thumbnailHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailHeight: Self = this.set("thumbnailHeight", js.undefined)
    @scala.inline
    def setThumbnailLink(value: String): Self = this.set("thumbnailLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailLink: Self = this.set("thumbnailLink", js.undefined)
    @scala.inline
    def setThumbnailWidth(value: Double): Self = this.set("thumbnailWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailWidth: Self = this.set("thumbnailWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

