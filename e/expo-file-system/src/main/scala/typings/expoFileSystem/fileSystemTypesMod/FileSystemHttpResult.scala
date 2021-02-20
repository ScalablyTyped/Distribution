package typings.expoFileSystem.fileSystemTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemHttpResult extends StObject {
  
  var headers: Record[String, String] = js.native
  
  var mimeType: String | Null = js.native
  
  var status: Double = js.native
}
object FileSystemHttpResult {
  
  @scala.inline
  def apply(headers: Record[String, String], status: Double): FileSystemHttpResult = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemHttpResult]
  }
  
  @scala.inline
  implicit class FileSystemHttpResultMutableBuilder[Self <: FileSystemHttpResult] (val x: Self) extends AnyVal {
    
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
