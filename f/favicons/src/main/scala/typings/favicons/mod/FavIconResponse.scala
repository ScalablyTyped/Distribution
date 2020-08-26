package typings.favicons.mod

import typings.favicons.anon.Contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FavIconResponse extends js.Object {
  var files: js.Array[Contents] = js.native
  var html: js.Array[String] = js.native
  var images: js.Array[Contents] = js.native
}

object FavIconResponse {
  @scala.inline
  def apply(files: js.Array[Contents], html: js.Array[String], images: js.Array[Contents]): FavIconResponse = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[FavIconResponse]
  }
  @scala.inline
  implicit class FavIconResponseOps[Self <: FavIconResponse] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: Contents*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[Contents]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlVarargs(value: String*): Self = this.set("html", js.Array(value :_*))
    @scala.inline
    def setHtml(value: js.Array[String]): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: Contents*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[Contents]): Self = this.set("images", value.asInstanceOf[js.Any])
  }
  
}

