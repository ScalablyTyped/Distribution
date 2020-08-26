package typings.expoFileSystem.anon

import typings.expoFileSystem.fileSystemTypesMod.FileSystemAcceptedUploadHttpMethod
import typings.expoFileSystem.fileSystemTypesMod.FileSystemSessionType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  var headers: js.UndefOr[Record[String, String]] = js.native
  var httpMethod: js.UndefOr[FileSystemAcceptedUploadHttpMethod] = js.native
  var sessionType: js.UndefOr[FileSystemSessionType] = js.native
}

object Headers {
  @scala.inline
  def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
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
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttpMethod(value: FileSystemAcceptedUploadHttpMethod): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    @scala.inline
    def setSessionType(value: FileSystemSessionType): Self = this.set("sessionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionType: Self = this.set("sessionType", js.undefined)
  }
  
}

