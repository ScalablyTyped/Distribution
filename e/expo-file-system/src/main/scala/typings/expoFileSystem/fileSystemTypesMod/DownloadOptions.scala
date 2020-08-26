package typings.expoFileSystem.fileSystemTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[Record[String, String]] = js.native
  var md5: js.UndefOr[Boolean] = js.native
  var sessionType: js.UndefOr[FileSystemSessionType] = js.native
}

object DownloadOptions {
  @scala.inline
  def apply(): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadOptions]
  }
  @scala.inline
  implicit class DownloadOptionsOps[Self <: DownloadOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMd5(value: Boolean): Self = this.set("md5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5: Self = this.set("md5", js.undefined)
    @scala.inline
    def setSessionType(value: FileSystemSessionType): Self = this.set("sessionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionType: Self = this.set("sessionType", js.undefined)
  }
  
}

