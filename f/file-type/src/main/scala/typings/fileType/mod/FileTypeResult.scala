package typings.fileType.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypeResult extends js.Object {
  /**
  		One of the supported [file types](https://github.com/sindresorhus/file-type#supported-file-types).
  		*/
  var ext: FileType
  /**
  		The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
  		*/
  var mime: MimeType
}

object FileTypeResult {
  @scala.inline
  def apply(ext: FileType, mime: MimeType): FileTypeResult = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileTypeResult]
  }
}

