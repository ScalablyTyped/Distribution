package typings.expoFileSystem.fileSystemTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo-file-system.expo-file-system/build/FileSystem.types.FileSystemHttpResult & {  body :string} */
@js.native
trait FileSystemUploadResult extends js.Object {
  var body: String = js.native
  var headers: Record[String, String] = js.native
  var mimeType: String | Null = js.native
  var status: Double = js.native
}

object FileSystemUploadResult {
  @scala.inline
  def apply(body: String, headers: Record[String, String], status: Double): FileSystemUploadResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemUploadResult]
  }
  @scala.inline
  implicit class FileSystemUploadResultOps[Self <: FileSystemUploadResult] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeTypeNull: Self = this.set("mimeType", null)
  }
  
}

