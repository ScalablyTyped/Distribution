package typings.expoFileSystem.fileSystemTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined expo-file-system.expo-file-system/build/FileSystem.types.FileSystemHttpResult & {  uri :string,   md5 :string | undefined} */
@js.native
trait FileSystemDownloadResult extends StObject {
  
  var headers: Record[String, String] = js.native
  
  var md5: js.UndefOr[String] = js.native
  
  var mimeType: String | Null = js.native
  
  var status: Double = js.native
  
  var uri: String = js.native
}
object FileSystemDownloadResult {
  
  @scala.inline
  def apply(headers: Record[String, String], status: Double, uri: String): FileSystemDownloadResult = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemDownloadResult]
  }
  
  @scala.inline
  implicit class FileSystemDownloadResultMutableBuilder[Self <: FileSystemDownloadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
