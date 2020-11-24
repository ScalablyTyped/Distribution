package typings.expoFileSystem.fileSystemTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined expo-file-system.expo-file-system/build/FileSystem.types.FileSystemDownloadResult */
@js.native
trait DownloadResult extends js.Object {
  
  var headers: Record[String, String] = js.native
  
  var md5: js.UndefOr[String] = js.native
  
  var mimeType: String | Null = js.native
  
  var status: Double = js.native
  
  var uri: String = js.native
}
object DownloadResult {
  
  @scala.inline
  def apply(headers: Record[String, String], status: Double, uri: String): DownloadResult = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadResult]
  }
  
  @scala.inline
  implicit class DownloadResultOps[Self <: DownloadResult] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5(value: String): Self = this.set("md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5: Self = this.set("md5", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeNull: Self = this.set("mimeType", null)
  }
}
