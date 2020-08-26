package typings.fileType.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypeResult extends js.Object {
  /**
  		One of the supported [file types](https://github.com/sindresorhus/file-type#supported-file-types).
  		*/
  val ext: FileExtension = js.native
  /**
  		The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
  		*/
  val mime: MimeType = js.native
}

object FileTypeResult {
  @scala.inline
  def apply(ext: FileExtension, mime: MimeType): FileTypeResult = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTypeResult]
  }
  @scala.inline
  implicit class FileTypeResultOps[Self <: FileTypeResult] (val x: Self) extends AnyVal {
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
    def setExt(value: FileExtension): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setMime(value: MimeType): Self = this.set("mime", value.asInstanceOf[js.Any])
  }
  
}

