package typings.expoFileSystem.fileSystemTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined expo-file-system.expo-file-system/build/FileSystem.types.FileSystemHttpResult & {  body :string} */
@js.native
trait FileSystemUploadResult extends StObject {
  
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
  implicit class FileSystemUploadResultMutableBuilder[Self <: FileSystemUploadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
